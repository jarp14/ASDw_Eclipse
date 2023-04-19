/*
* 
*/
package teaw.diagram.part;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite;
import org.eclipse.gef.ui.rulers.RulerComposite;
import org.eclipse.gmf.runtime.common.ui.services.marker.MarkerNavigationService;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramDropTargetListener;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.part.LastClickPositionProvider;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.navigator.resources.ProjectExplorer;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.IShowInTargetList;
import org.eclipse.ui.part.ShowInContext;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import teaw.diagram.navigator.TeawNavigatorItem;
import spaceclipse.collab.CUtilities;
import spaceclipse.collab.interfaces.ICollaborativeEditor;
import spaceclipse.herramientas.UsuarioPanel;
import spaceclipse.space.SpacEclipse;

/**
 * @generated
 */
public class TeawDiagramEditor extends DiagramDocumentEditor implements ICollaborativeEditor, IGotoMarker {

	/**
	* @generated
	*/
	public static final String ID = "teaw.diagram.part.TeawDiagramEditorID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final String CONTEXT_ID = "teaw.diagram.ui.diagramContext"; //$NON-NLS-1$

	/**
	* @generated
	*/
	private LastClickPositionProvider myLastClickPositionProvider;

	/**
	* @generated
	*/
	public TeawDiagramEditor() {
		super(true);
		
		CUtilities.setEditor(this);
	}

	/**
	* @generated
	*/
	protected String getContextID() {
		return CONTEXT_ID;
	}

	/**
	* @generated
	*/
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		PaletteRoot root = super.createPaletteRoot(existingPaletteRoot);
		new TeawPaletteFactory().fillPalette(root);
		return root;
	}

	/**
	* @generated
	*/
	protected PreferencesHint getPreferencesHint() {
		return TeawDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	* @generated
	*/
	public String getContributorId() {
		return TeawDiagramEditorPlugin.ID;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class type) {
		if (type == IShowInTargetList.class) {
			return new IShowInTargetList() {
				public String[] getShowInTargetIds() {
					return new String[] { ProjectExplorer.VIEW_ID };
				}
			};
		}
		return super.getAdapter(type);
	}

	/**
	* @generated
	*/
	protected IDocumentProvider getDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput || input instanceof URIEditorInput) {
			return TeawDiagramEditorPlugin.getInstance().getDocumentProvider();
		}
		return super.getDocumentProvider(input);
	}

	/**
	* @generated
	*/
	public TransactionalEditingDomain getEditingDomain() {
		IDocument document = getEditorInput() != null ? getDocumentProvider().getDocument(getEditorInput()) : null;
		if (document instanceof IDiagramDocument) {
			return ((IDiagramDocument) document).getEditingDomain();
		}
		return super.getEditingDomain();
	}

	/**
	* @generated
	*/
	protected void setDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput || input instanceof URIEditorInput) {
			setDocumentProvider(TeawDiagramEditorPlugin.getInstance().getDocumentProvider());
		} else {
			super.setDocumentProvider(input);
		}
	}

	/**
	* @generated
	*/
	public void gotoMarker(IMarker marker) {
		MarkerNavigationService.getInstance().gotoMarker(this, marker);
	}

	/**
	* @generated
	*/
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	* @generated
	*/
	public void doSaveAs() {
		performSaveAs(new NullProgressMonitor());
	}

	/**
	* @generated
	*/
	protected void performSaveAs(IProgressMonitor progressMonitor) {
		Shell shell = getSite().getShell();
		IEditorInput input = getEditorInput();
		SaveAsDialog dialog = new SaveAsDialog(shell);
		IFile original = input instanceof IFileEditorInput ? ((IFileEditorInput) input).getFile() : null;
		if (original != null) {
			dialog.setOriginalFile(original);
		}
		dialog.create();
		IDocumentProvider provider = getDocumentProvider();
		if (provider == null) {
			// editor has been programmatically closed while the dialog was open
			return;
		}
		if (provider.isDeleted(input) && original != null) {
			String message = NLS.bind(Messages.TeawDiagramEditor_SavingDeletedFile, original.getName());
			dialog.setErrorMessage(null);
			dialog.setMessage(message, IMessageProvider.WARNING);
		}
		if (dialog.open() == Window.CANCEL) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IPath filePath = dialog.getResult();
		if (filePath == null) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IFile file = workspaceRoot.getFile(filePath);
		final IEditorInput newInput = new FileEditorInput(file);
		// Check if the editor is already open
		IEditorMatchingStrategy matchingStrategy = getEditorDescriptor().getEditorMatchingStrategy();
		IEditorReference[] editorRefs = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		for (int i = 0; i < editorRefs.length; i++) {
			if (matchingStrategy.matches(editorRefs[i], newInput)) {
				MessageDialog.openWarning(shell, Messages.TeawDiagramEditor_SaveAsErrorTitle,
						Messages.TeawDiagramEditor_SaveAsErrorMessage);
				return;
			}
		}
		boolean success = false;
		try {
			provider.aboutToChange(newInput);
			getDocumentProvider(newInput).saveDocument(progressMonitor, newInput,
					getDocumentProvider().getDocument(getEditorInput()), true);
			success = true;
		} catch (CoreException x) {
			IStatus status = x.getStatus();
			if (status == null || status.getSeverity() != IStatus.CANCEL) {
				ErrorDialog.openError(shell, Messages.TeawDiagramEditor_SaveErrorTitle,
						Messages.TeawDiagramEditor_SaveErrorMessage, x.getStatus());
			}
		} finally {
			provider.changed(newInput);
			if (success) {
				setInput(newInput);
			}
		}
		if (progressMonitor != null) {
			progressMonitor.setCanceled(!success);
		}
	}

	/**
	* @generated
	*/
	public ShowInContext getShowInContext() {
		return new ShowInContext(getEditorInput(), getNavigatorSelection());
	}

	/**
	* @generated
	*/
	private ISelection getNavigatorSelection() {
		IDiagramDocument document = getDiagramDocument();
		if (document == null) {
			return StructuredSelection.EMPTY;
		}
		Diagram diagram = document.getDiagram();
		if (diagram == null || diagram.eResource() == null) {
			return StructuredSelection.EMPTY;
		}
		IFile file = WorkspaceSynchronizer.getFile(diagram.eResource());
		if (file != null) {
			TeawNavigatorItem item = new TeawNavigatorItem(diagram, file, false);
			return new StructuredSelection(item);
		}
		return StructuredSelection.EMPTY;
	}

	/**
	* @generated
	*/
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		DiagramEditorContextMenuProvider provider = new DiagramEditorContextMenuProvider(this,
				getDiagramGraphicalViewer());
		getDiagramGraphicalViewer().setContextMenu(provider);
		getSite().registerContextMenu(ActionIds.DIAGRAM_EDITOR_CONTEXT_MENU, provider, getDiagramGraphicalViewer());
		
		// Listener para capturar la ejecucion de comandos
		org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack stack = (org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack)getCommandStack();
		stack.addCommandStackListener(new org.eclipse.gef.commands.CommandStackListener() {
			public void commandStackChanged(java.util.EventObject event) {
				// Se lleva la cuenta para no replicar cuando no sea necesario
				cuentaGrabado++;
				if (cuentaGrabado >= 3){
					cuentaGrabado = 0;
					doSave(new org.eclipse.core.runtime.NullProgressMonitor());			
				}
			}
		});
	}

	/**
	* @generated
	*/
	protected void initializeGraphicalViewer() {
		super.initializeGraphicalViewer();
		getDiagramGraphicalViewer().addDropTargetListener(
				new DropTargetListener(getDiagramGraphicalViewer(), LocalSelectionTransfer.getTransfer()) {

					protected Object getJavaObject(TransferData data) {
						return LocalSelectionTransfer.getTransfer().nativeToJava(data);
					}

				});
		getDiagramGraphicalViewer().addDropTargetListener(
				new DropTargetListener(getDiagramGraphicalViewer(), LocalTransfer.getInstance()) {

					protected Object getJavaObject(TransferData data) {
						return LocalTransfer.getInstance().nativeToJava(data);
					}

				});
		startupLastClickPositionProvider();
	}

	/**
	* @generated
	*/
	protected void startupLastClickPositionProvider() {
		if (myLastClickPositionProvider == null) {
			myLastClickPositionProvider = new LastClickPositionProvider(this);
			myLastClickPositionProvider.attachToService();
		}
	}

	/**
	* @generated
	*/
	protected void shutDownLastClickPositionProvider() {
		if (myLastClickPositionProvider != null) {
			myLastClickPositionProvider.detachFromService();
			myLastClickPositionProvider.dispose();
			myLastClickPositionProvider = null;
		}
	}

	/**
	* @generated
	*/
	@Override
	public void dispose() {
		shutDownLastClickPositionProvider();
		super.dispose();
	}

	/**
	* @generated
	*/
	private abstract class DropTargetListener extends DiagramDropTargetListener {

		/**
		* @generated
		*/
		public DropTargetListener(EditPartViewer viewer, Transfer xfer) {
			super(viewer, xfer);
		}

		/**
		* @generated
		*/
		protected List getObjectsBeingDropped() {
			TransferData data = getCurrentEvent().currentDataType;
			HashSet<URI> uris = new HashSet<URI>();

			Object transferedObject = getJavaObject(data);
			if (transferedObject instanceof IStructuredSelection) {
				IStructuredSelection selection = (IStructuredSelection) transferedObject;
				for (Iterator<?> it = selection.iterator(); it.hasNext();) {
					Object nextSelectedObject = it.next();
					if (nextSelectedObject instanceof TeawNavigatorItem) {
						View view = ((TeawNavigatorItem) nextSelectedObject).getView();
						nextSelectedObject = view.getElement();
					} else if (nextSelectedObject instanceof IAdaptable) {
						IAdaptable adaptable = (IAdaptable) nextSelectedObject;
						nextSelectedObject = adaptable.getAdapter(EObject.class);
					}

					if (nextSelectedObject instanceof EObject) {
						EObject modelElement = (EObject) nextSelectedObject;
						uris.add(EcoreUtil.getURI(modelElement));
					}
				}
			}

			ArrayList<EObject> result = new ArrayList<EObject>(uris.size());
			for (URI nextURI : uris) {
				EObject modelObject = getEditingDomain().getResourceSet().getEObject(nextURI, true);
				result.add(modelObject);
			}
			return result;
		}

		/**
		* @generated
		*/
		protected abstract Object getJavaObject(TransferData data);

	}

	//@Override
	public void doSave(org.eclipse.core.runtime.IProgressMonitor progressMonitor) {
		super.doSave(progressMonitor);			

		org.eclipse.emf.ecore.resource.Resource res = this.getDiagram().eResource();	    		
		org.eclipse.core.resources.IFile iFile = org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(res);
		String archivoDiagramaOrigen = iFile.getLocation().toString();
		//Es el mismo nombre quitando "_diagram"
		String archivoModeloOrigen = archivoDiagramaOrigen.substring(0, archivoDiagramaOrigen.length()-8);

		try {
			java.io.File fileModelo = new java.io.File(archivoModeloOrigen);
			java.io.FileReader reader = new java.io.FileReader(fileModelo);
			char[] bufferModelo = new char[(int)fileModelo.length()];
			reader.read(bufferModelo);
			reader.close();

			java.io.File fileDiagrama = new java.io.File(archivoDiagramaOrigen);
			reader = new java.io.FileReader(fileDiagrama);
			char[] bufferDiagrama = new char[(int)fileDiagrama.length()];
			reader.read(bufferDiagrama);
			reader.close();    		

			((SpacEclipse) CUtilities.getAplicacion()).notificarModelo(bufferModelo, bufferDiagrama, "", "");
		} catch(java.lang.Exception e) {
			System.err.println("Error al replicar el modelo");
			e.printStackTrace();
		}	
	}

	@Override
	public void habilitar() {
		habilitado = true;
		myParent.setEnabled(true);

	}

	@Override
	public void deshabilitar() {
		habilitado = false;
		myParent.setEnabled(false);
	}

	protected boolean habilitado = true;
	protected Composite myParent;
	//Cuenta para no replicar cuando no sea necesario
	private int cuentaGrabado = 0;

	// Coordenadas del ultimo telepuntero que se envio
	private int miX = 99999;
	private int miY = 99999;

	// Tabla de telepunteros
	private Hashtable<String, ImageFigure> telepunteros = new Hashtable<String, ImageFigure>();

	@Override
	public void copiaModelo(char[] archivoModelo, char[] archivoDiagrama, String rutaArchivoModelo, String rutaArchivoDiagrama) {

		// Primero se habilita si estaba deshabilitado
		boolean antesHabilitado = true;
		if (!habilitado) {
			habilitar();
			antesHabilitado = false;
		}

		Resource resource = this.getDiagram().eResource();
		IFile iFile = WorkspaceSynchronizer.getFile(resource);
		String archivoDiagramaDestino = iFile.getLocation().toString();
		// Es el mismo nombre quitando "_diagram"
		String archivoModeloDestino = archivoDiagramaDestino.substring(0, archivoDiagramaDestino.length()-8);

		try {
			FileWriter writer = new FileWriter(new File(archivoModeloDestino));
			writer.write(archivoModelo);
			writer.close();

			writer = new FileWriter(new File(archivoDiagramaDestino));
			writer.write(archivoDiagrama);
			writer.close();

			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			root.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

			EList list = this.getEditingDomain().getResourceSet().getResources();
			for (int i = 0; i < list.size(); i++) {
				Resource res = (Resource) list.get(i);
				res.load(this.getEditingDomain().getResourceSet().getLoadOptions());
			}

			this.getDocumentProvider().synchronize(this.getEditorInput());

			EObject rootPkg = this.getDiagram().getElement();
			List editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(rootPkg);
			for (Iterator it = editPolicies.iterator(); it.hasNext();) {
				CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it.next();
				nextEditPolicy.refresh();
			}
		} catch (Exception e) {
			System.err.println("Error al copiar el modelo");
			e.printStackTrace();
		} finally {
			// Al final se deshabilita si antes lo estaba
			if (!antesHabilitado) {
				deshabilitar();
			}
		}		
	}

	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		myParent = parent;
		// Se crea el listener de los telepunteros
		final FigureCanvas canvas = getCanvas();
		canvas.addMouseMoveListener(new MouseMoveListener() {
			@Override
			public void mouseMove(MouseEvent e) {
				// Primero se comprueba que la diferencia con el anterior envio es > 5
				if (Math.abs(e.x-miX) > 5 || Math.abs(e.y-miY) > 5) {
					miX = e.x;
					miY = e.y;

					SpacEclipse app = (SpacEclipse) CUtilities.getAplicacion();

					// Hay que pasar a coordenadas absolutas, porque los
						// demas puede que esten viendo una porcion distinta del diagrama
					Rectangle abs = new Rectangle(e.x, e.y, 0, 0);
					//canvas.getContents().translateToRelative(abs);

					app.notificarTelepuntero(abs.x, abs.y);
				}
			}
		});

		// Deshabilitado por defecto
		deshabilitar();
	}

	@Override
	public void mueveTelepuntero(String usuario, int x, int y) {
		final FigureCanvas canvas = getCanvas();
		//FigureCanvas canvas = getCanvas();
		IFigure contents = canvas.getContents();
		ImageFigure figura = telepunteros.get(usuario);
		// En teoria nunca debera ser null
		Rectangle rect = new Rectangle(x, y, 12, 20);
		figura.setBounds(rect);
		if (!contents.getChildren().contains(figura)) {
			contents.add(figura);
		}
	}

	@Override
	public void actualizaTelepunteros(Vector<UsuarioPanel> listaUsuarios) {
		UsuarioPanel usuario = null;
		ImageFigure figura = null;
		// Se crea una tabla nueva para ir pasando aqui los existentes y meter los nuevos.
		// Asi, los viejos no se copiaran. Al final, la nueva sustituye a la vieja.
		Hashtable<String, ImageFigure> telepunterosNuevos = new Hashtable<String, ImageFigure>();
		for (int i = 0; i < listaUsuarios.size(); i++) {
			usuario = (UsuarioPanel) listaUsuarios.elementAt(i);
			figura = telepunteros.get(usuario.getNombre());
			if (figura == null) {
				// Telepuntero nuevo
				int color = usuario.getColor()+1;
				String ruta = "resources/flecha" +color+ ".png";
				ImageDescriptor desc = AbstractUIPlugin.imageDescriptorFromPlugin("SPACEclipse", ruta);
				figura = new ImageFigure(desc.createImage());
			}
			telepunterosNuevos.put(usuario.getNombre(), figura);
		}
		telepunteros = telepunterosNuevos;
	}

	// Metodo para obtener el canvas
	private FigureCanvas getCanvas() {
		Control[] controles = myParent.getChildren();
		FlyoutPaletteComposite control = (FlyoutPaletteComposite) controles[0];
		Control[] hijos = control.getChildren();
		RulerComposite ruler = (RulerComposite) hijos[2];
		Control[] hijosRuler = ruler.getChildren();
		return (FigureCanvas) hijosRuler[0];
	}

	@Override
	public void copiaFichero(char[] archivoFichero, String rutaArchivo) {
		// TODO Auto-generated method stub
		
	}
}

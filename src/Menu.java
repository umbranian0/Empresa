	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.ItemEvent;
	import java.awt.event.ItemListener;
	import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


	
public class Menu implements ActionListener, ItemListener {

		
		static Stack stackObjetos = new Stack();
		static JPanel contentPane = new JPanel(new GridLayout(0, 1));
		static JFrame frame = new JFrame("GEmp");
		static TextArea text = new TextArea();
		public JMenuBar createMenuBar() {
	    	
	    	
	        //create a menubar
	        JMenuBar menuBar;
	        JMenu filemenu, fornecedorMenu;
	        JMenuItem menuItem;
	        
	        //Create the menu bar.
	        menuBar = new JMenuBar();

	        //Build the file menu.
	        filemenu = new JMenu("Empregados");
	        	
	        filemenu.setMnemonic(KeyEvent.VK_F);
	        filemenu.getAccessibleContext().setAccessibleDescription("Gestor de empresa");
	        menuBar.add(filemenu);

	        //menu items
	        menuItem = new JMenuItem("Adicionar colaborador",KeyEvent.VK_N);
	        menuItem.getAccessibleContext().setAccessibleDescription("cC");
	        menuItem.addActionListener(this);
	        filemenu.add(menuItem);
	        
	        menuItem = new JMenuItem("Modificar Colaborador",KeyEvent.VK_O);
	        menuItem.getAccessibleContext().setAccessibleDescription("mC");
	        menuItem.addActionListener(this);
	        filemenu.add(menuItem);
	        menuItem = new JMenuItem("Desativar colaborador",KeyEvent.VK_C);
	        menuItem.getAccessibleContext().setAccessibleDescription("dC");
	        menuItem.addActionListener(this);
	        filemenu.add(menuItem);   
	        
	        //menu para os fornecedores
	        fornecedorMenu = new JMenu("Fornecedor");
	        fornecedorMenu.setMnemonic(KeyEvent.VK_E);
	        fornecedorMenu.getAccessibleContext().setAccessibleDescription("This is the Edit menu.");
	        menuBar.add(fornecedorMenu);
	        
	        //submenu de CRUD fornecedores 
	    
	        menuItem = new JMenuItem("Novo Fornecedor",KeyEvent.VK_U);
	        menuItem.getAccessibleContext().setAccessibleDescription("nF");
	        menuItem.addActionListener(this);
	        
	        fornecedorMenu.add(menuItem);
	        
	        menuItem = new JMenuItem("Desativar Fornecedor",KeyEvent.VK_R);
	        menuItem.getAccessibleContext().setAccessibleDescription("dF");
	        menuItem.addActionListener(this);
	        
	        fornecedorMenu.add(menuItem);
	        
	        //expand menu item
	
	
	        return menuBar;
	    }


	    private static void createAndShowGUI() {

	        //criar frame
	    	criaFrame();
	    	
	        }

	    private static void criaFrame() {
	    	  	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        Menu smenu = new Menu();
		        frame.setJMenuBar(smenu.createMenuBar());
		        //content layout
		        contentPane.setLayout(new BorderLayout(5, 5));
		        
		        contentPane.setBorder(
		                BorderFactory.createLineBorder(
		                                Color.DARK_GRAY, 5));
		       
		        
		        frame.getContentPane().add(contentPane, BorderLayout.AFTER_LAST_LINE);

			    frame.setContentPane(contentPane);
			       /* show frame */
			    frame.pack();
			    frame.setSize(600,400);
			    frame.setVisible(true);
			    text.setVisible(true);

	    }
	    
	    private static void criarNovoLabel(Object o) {
			// TODO Auto-generated method stub
	    	stackObjetos.adicionaUm(o);
	    	
	    		for(Object obj: stackObjetos.getStack() ) {
	    		JLabel l = new JLabel();	
		    	l.setText( obj.toString());
		    	l.setHorizontalAlignment(JLabel.LEFT);
		    	l.setVerticalAlignment(JLabel.TOP);
		    	
		    	text.append(l.getText() + "\n");
		    	
		    	l.setOpaque(true);
		    	
		    	frame.getContentPane().add(l);
		    			    	
	    		}
	    		
	    	atualizarPainel();
	    	
		}

//nao testado
//		private static void desenharLista() {
//	    	  for(Object o: stackObjetos.getStack() ) {
//		        	JLabel label = new JLabel();
//		         	 
//			        		label.setText(o.toString());
//			        		label.setHorizontalAlignment(SwingConstants.CENTER);
//			        		contentPane.add(label);
//			        		label.setOpaque(true);
//			        		label.setVisible(true);
//			        		frame.getContentPane().add(label);
//			        }
//	    	 
//	    }
	    
	    public void StartMenu() {
	    	//functional interface
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }

	    @Override
	    public void itemStateChanged(ItemEvent e) { }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	    	 
  	        
	        JMenuItem jmi = (JMenuItem)e.getSource();
	       // System.out.println("menu item clicked: " + jmi.getText());
	       
	        //execute action from the list
	       performTask(jmi);
	        
	        if (jmi.getText().equalsIgnoreCase("close")) {
	            System.exit(0);
	        }
	        
	    }


		private void performTask(JMenuItem jmi) {
			
			// TODO Auto-generated method stub
			 switch(jmi.getAccessibleContext().getAccessibleDescription()) {
		        
		        case "cC" : 
		        	//metodo de criação de novo label
			        criarNovoLabel(criarEmpregado());
		        	  
		        	break;
		        case "mC" :
		        	break;
		        case "dC" :
		        	break;
		        case "nF" :
		        	break;
		        case "dF":
		        	break;
		        }
		}
	    
	    
	  public Empregado criarEmpregado() {

		 InputDialogInFrame frame = new InputDialogInFrame();
	  	         
		 String nome = JOptionPane.showInputDialog(frame, "Nome: ");
     	 String endereco = JOptionPane.showInputDialog(frame, "Endereço: ");
     	 String tel = JOptionPane.showInputDialog(frame, "Tel: ");
     	 int codSect = Integer.parseInt(JOptionPane.showInputDialog(frame, "Codigo Setor: "));
     	 int salBase = Integer.parseInt(JOptionPane.showInputDialog(frame, "Salario Base: "));
     	 double imp = Double.parseDouble(JOptionPane.showInputDialog(frame, "Imposto: "));
	  	    
     	 if(!nome.isEmpty() && !endereco.isEmpty() && !tel.isEmpty() ){
             frame.closeIt();
             System.out.println("Empregado valido e criado");
         }
		  return  new Empregado(nome,endereco,tel,codSect,salBase,imp);
	  }
	    
	  public static void atualizarPainel() {
		  contentPane.invalidate();
		  contentPane.validate();
		  
	  }
}

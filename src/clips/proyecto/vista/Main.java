package clips.proyecto.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clips.proyecto.control.Metodos;
import net.sf.clipsrules.jni.Environment;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		
		Metodos m= new Metodos();
		Environment clips;
		clips = new Environment();

		clips.load("proyectoBDC.txt");

		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1127, 776);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTestMedirIq = new JLabel("Test Medir IQ");
		lblTestMedirIq.setBounds(447, 6, 126, 24);
		contentPane.add(lblTestMedirIq);
		
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(16, 43, 61, 24);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(102, 42, 130, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		
		ButtonGroup grupo1 = new ButtonGroup();
		ButtonGroup grupo2 = new ButtonGroup();			
		ButtonGroup grupo3 = new ButtonGroup();		
		ButtonGroup grupo4 = new ButtonGroup();		
		ButtonGroup grupo5 = new ButtonGroup();		
		ButtonGroup grupo6 = new ButtonGroup();		
		ButtonGroup grupo7 = new ButtonGroup();		
		ButtonGroup grupo8 = new ButtonGroup();
		ButtonGroup grupo9 = new ButtonGroup();
		ButtonGroup grupo10 = new ButtonGroup();
		ButtonGroup grupo11 = new ButtonGroup();
		ButtonGroup grupo12 = new ButtonGroup();
		ButtonGroup grupo13= new ButtonGroup();
		ButtonGroup grupo14 = new ButtonGroup();
		ButtonGroup grupo15 = new ButtonGroup();
		ButtonGroup grupo16= new ButtonGroup();
		ButtonGroup grupo17 = new ButtonGroup();
		ButtonGroup grupo18 = new ButtonGroup();
		

		
		JButton btnTest = new JButton("Test");
		btnTest.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String nombre=txtNombre.getText();
			
				String res1=m.mostrar1();
				String res2=m.mostrar2();
				String res3=m.mostrar3();
				String res4=m.mostrar4();
				String res5=m.mostrar5();
				String res6=m.mostrar6();
				String res7=m.mostrar7();
				String res8=m.mostrar8();
				
				String res9=m.mostrar9();
				String res10=m.mostrar10();
				String res11=m.mostrar11();
				String res12=m.mostrar12();
				String res13=m.mostrar13();
				String res14=m.mostrar14();
				String res15=m.mostrar15();
				String res16=m.mostrar16();
				String res17=m.mostrar17();
				String res18=m.mostrar18();
				
				
				
				
				
				
				/*System.out.println(nombre);
			
				System.out.println(res1);
				System.out.println(res2);
				System.out.println(res3);
				System.out.println(res4);
				System.out.println(res5);
				System.out.println(res6);
				System.out.println(res7);
				System.out.println(res8);
				System.out.println(res9);
				System.out.println(res10);
				System.out.println(res11);
				System.out.println(res12);
				System.out.println(res13);
				System.out.println(res14);
				System.out.println(res15);
				System.out.println(res16);
				System.out.println(res17);
				System.out.println(res18);
				
				*/
				String datos="(assert \n" + 
						"	(persona-personalidad\n" + 
						"		(pregunta1 \"" + res1  + "\" )\n"+
						"		(pregunta2 \"" + res2  + "\" )\n"+
						"		(pregunta3 \"" + res3  + "\" )\n"+
						"		(pregunta4 \"" + res4  + "\" )\n"+
						"		(pregunta5 \"" + res5  + "\" )\n"+
						"		(pregunta6 \"" + res6  + "\" )\n"+
						"		(pregunta7 \"" + res7  + "\" )\n"+
						"		(pregunta8 \"" + res8  + "\" )\n"+
						"		(pregunta9 \"" + res9  + "\" )\n"+
						"		(pregunta10 \"" + res10  + "\" )\n"+
						"		(pregunta11 \"" + res11  + "\" )\n"+
						"		(pregunta12 \"" + res12  + "\" )\n"+
						"		(pregunta13 \"" + res13  + "\" )\n"+
						"		(pregunta14 \"" + res14  + "\" )\n"+
						"		(pregunta15 \"" + res15  + "\" )\n"+
						"		(pregunta16 \"" + res16  + "\" )\n"+
						"		(pregunta17 \"" + res17  + "\" )\n"+
						"		(pregunta18 \"" + res18  + "\" )\n"+
						"\n" + 
						"	)\n" + 
						")";
				System.out.println(datos);
				clips.reset();
				clips.eval(datos);
				clips.run(); 
				
		
				
				
			
				File archivo = new File ("datos.txt");
				FileReader fr;
				try {
					fr = new FileReader (archivo);
					BufferedReader br = new BufferedReader(fr);
					
					JOptionPane.showMessageDialog(null, br.readLine()+ "\n"+br.readLine());
					//System.out.println("esto imprime"+ br.readLine());
					fr.close();
					
				//	System.out.println("esto imprime"+ br.readLine());
			
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		
		
		
		
		btnTest.setBounds(384, 682, 189, 44);
		contentPane.add(btnTest);
		
		JLabel lblPregunta = new JLabel("1Cuando est\u00E1 con mucha gente se averg\u00FCenza y se retrae");
		lblPregunta.setBounds(10, 74, 355, 16);
		contentPane.add(lblPregunta);
			
		
		JRadioButton rdbtpg1v = new JRadioButton("verdadero");
		rdbtpg1v.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP1("si");	
			}
		});
	
		rdbtpg1v.setBounds(20, 105, 115, 23);
		contentPane.add(rdbtpg1v);
		
		
		JRadioButton rdbtpg1f = new JRadioButton("falso");
		rdbtpg1f.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP1("no");	
			}
		});
		rdbtpg1f.setBounds(142, 105, 126, 23);
		contentPane.add(rdbtpg1f);
		grupo1.add(rdbtpg1v);
		grupo1.add(rdbtpg1f);
		
		
		JLabel lblqueNumero = new JLabel("2 Se fija mucho en los detalles de los dem\u00E1s; c\u00F3mo act\u00FAan,  c\u00F3mo se visten, etc., para imitarlos");
		lblqueNumero.setBounds(10, 140, 468, 16);
		contentPane.add(lblqueNumero);
		
		JRadioButton rdbtpg2v = new JRadioButton("Verdadero");
		rdbtpg2v.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP2("si");	
			}
		});
		rdbtpg2v.setBounds(20, 171, 115, 23);
		contentPane.add(rdbtpg2v);
		grupo2.add(rdbtpg2v);
		
		JRadioButton rdbtpg2f = new JRadioButton("Falso");
		rdbtpg2f.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP2("no");
			}
		});
		rdbtpg2f.setBounds(142, 171, 130, 23);
		contentPane.add(rdbtpg2f);
		grupo2.add(rdbtpg2f);
		
		
		
		
		JLabel lblcualDe = new JLabel("3 Frecuentemente se muestra agresivo y a la defensiva, sobretodo con la familia	");
		lblcualDe.setBounds(10, 206, 468, 16);
		contentPane.add(lblcualDe);
		
		JRadioButton rdbtnpg3v = new JRadioButton("Verdadero");
		rdbtnpg3v.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.RespuestaP3("si");
			}
		});
	
		
		rdbtnpg3v.setBounds(20, 237, 115, 23);
		contentPane.add(rdbtnpg3v);
		grupo3.add(rdbtnpg3v);
		
		JRadioButton rdbtnpg3f = new JRadioButton("Falso");
		rdbtnpg3f.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP3("no");
			}
		});
		rdbtnpg3f.setBounds(142, 237, 115, 23);
		contentPane.add(rdbtnpg3f);
		grupo3.add(rdbtnpg3f);
		
		
		
		JLabel lblAguaEs = new JLabel("4 A menudo pregunta a varias personas sobre una misma duda o problema (a padres, hermanos, amigos…)");
		lblAguaEs.setBounds(10, 272, 529, 16);
		contentPane.add(lblAguaEs);
		
		JRadioButton rdbtnpg4v = new JRadioButton("Verdadero");
		rdbtnpg4v.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.RespuestaP4("si");
			}
		});
	
		
		rdbtnpg4v.setBounds(20, 303, 115, 23);
		contentPane.add(rdbtnpg4v);
		grupo4.add(rdbtnpg4v);
		
		JRadioButton rdbtnpg4f= new JRadioButton("Falso");
		rdbtnpg4f.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP4("no");
			}
		});
		rdbtnpg4f.setBounds(142, 303, 106, 23);
		contentPane.add(rdbtnpg4f);
		grupo4.add(rdbtnpg4f);
		
		
		JLabel lblquePalabra = new JLabel("5 Siempre antepone las opiniones de sus amigos a las de su familia");
		lblquePalabra.setBounds(10, 338, 355, 16);
		contentPane.add(lblquePalabra);
		
		JRadioButton rdbtnQueja = new JRadioButton("Verdadero");
		rdbtnQueja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.RespuestaP5("si");
			}
		});
		rdbtnQueja.setBounds(20, 369, 115, 23);
		contentPane.add(rdbtnQueja);
		grupo5.add(rdbtnQueja);
		
		JRadioButton rdbtnInjusticia = new JRadioButton("Falso");
		rdbtnInjusticia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP5("no");
			}
		});
		rdbtnInjusticia.setBounds(142, 369, 126, 23);
		contentPane.add(rdbtnInjusticia);
		grupo5.add(rdbtnInjusticia);
		
		
		
		
		JLabel lblqueAnimal = new JLabel("6 No le importa que me acerque a hablar con él cuando está con sus amigos");
		lblqueAnimal.setBounds(10, 404, 468, 16);
		contentPane.add(lblqueAnimal);
		
		JRadioButton rdbtnAlugia = new JRadioButton("Verdadero");
		rdbtnAlugia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.RespuestaP6("si");
			}
		});
		rdbtnAlugia.setBounds(20, 435, 115, 23);
		contentPane.add(rdbtnAlugia);
		grupo6.add(rdbtnAlugia);
		
		JRadioButton rdbtnObllaca= new JRadioButton("Falso");
		rdbtnObllaca.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			m.RespuestaP6("no");	
			}
		});
		rdbtnObllaca.setBounds(142, 435, 126, 23);
		contentPane.add(rdbtnObllaca);
		grupo6.add(rdbtnObllaca);
		
		
		
		
		JLabel lblSeleccionaLa = new JLabel("7 Sus amigos suelen seguirle, no es extraño que parezca el líder del grupo");
		lblSeleccionaLa.setBounds(10, 470, 355, 16);
		contentPane.add(lblSeleccionaLa);
		
		JRadioButton rdbtnEvalcl = new JRadioButton("verdadero");
		rdbtnEvalcl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.RespuestaP7("si");
			}
		});
		rdbtnEvalcl.setBounds(20, 501, 115, 23);
		contentPane.add(rdbtnEvalcl);
		grupo7.add(rdbtnEvalcl);
		
		JRadioButton rdbtnOras = new JRadioButton("Falso");
		rdbtnOras.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP7("no");
			}
		});
		rdbtnOras.setBounds(142, 501, 126, 23);
		contentPane.add(rdbtnOras);
		grupo7.add(rdbtnOras);
		
		
		
		JLabel lblcualDe_1 = new JLabel("8 Continuamente quiere comprarse ropa, juegos, etc., nunca está satisfecho con lo que tiene");
		lblcualDe_1.setBounds(10, 531, 529, 21);
		contentPane.add(lblcualDe_1);
		
		JRadioButton rdbtnLobo = new JRadioButton("Verdadero");
		rdbtnLobo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.RespuestaP8("si");
			}
		});
		rdbtnLobo.setBounds(20, 567, 115, 23);
		contentPane.add(rdbtnLobo);
		grupo8.add(rdbtnLobo);
		
		JRadioButton rdbtnPuma = new JRadioButton("Falso");
		rdbtnPuma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP8("no");
			}
		});
		rdbtnPuma.setBounds(142, 567, 126, 23);
		contentPane.add(rdbtnPuma);
		grupo8.add(rdbtnPuma);
		
		
		JLabel label_7 = new JLabel("9 Es muy extrovertido");
		label_7.setBounds(10, 607, 529, 21);
		contentPane.add(label_7);
		
		JRadioButton rdbtnVerdadero_9 = new JRadioButton("Verdadero");
		rdbtnVerdadero_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.RespuestaP9("si");
			}
		});
		rdbtnVerdadero_9.setBounds(20, 643, 115, 23);
		contentPane.add(rdbtnVerdadero_9);
		
		JRadioButton radioButton_16 = new JRadioButton("Falso");
		rdbtnVerdadero_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP9("no");
			}
		});
		
		radioButton_16.setBounds(142, 643, 126, 23);
		contentPane.add(radioButton_16);
		
		grupo9.add(rdbtnVerdadero_9);
		grupo9.add(radioButton_16);
		
		
		
		
		JLabel lblEsMs = new JLabel("10 Es más bien tranquilo, aunque en ocasiones se puede poner nervioso (por exámenes, por ejemplo), en general no se muestra tenso");
		lblEsMs.setBounds(549, 74, 572, 16);
		contentPane.add(lblEsMs);
		
		JRadioButton rdbtnVerdadero = new JRadioButton("Verdadero");
		rdbtnVerdadero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.RespuestaP10("si");
			}
		});
		
		rdbtnVerdadero.setBounds(559, 105, 115, 23);
		contentPane.add(rdbtnVerdadero);
		JRadioButton rdbtnFalso_1 = new JRadioButton("Falso");
		rdbtnFalso_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP10("no");
			}
		});
		rdbtnFalso_1.setBounds(681, 105, 126, 23);
		contentPane.add(rdbtnFalso_1);
		grupo10.add(rdbtnVerdadero);
		grupo10.add(rdbtnFalso_1);
		
		
		JLabel lblLeAfectan = new JLabel("11 Le afectan mucho las críticas, sobretodo si se la hace un amigo o compañero\r\n");
		lblLeAfectan.setBounds(549, 140, 468, 16);
		contentPane.add(lblLeAfectan);
		
		JRadioButton rdbtnVerdadero_1 = new JRadioButton("Verdadero");
		rdbtnVerdadero_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP11("si");
			}
		});
		rdbtnVerdadero_1.setBounds(559, 171, 115, 23);
		contentPane.add(rdbtnVerdadero_1);
		
		
		JRadioButton rdbtnFalso = new JRadioButton("Falso");
		rdbtnFalso.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP11("no");
			}
		});
		rdbtnFalso.setBounds(681, 171, 130, 23);
		contentPane.add(rdbtnFalso);
		grupo11.add(rdbtnVerdadero_1);
		grupo11.add(rdbtnFalso);
		//-------------------------------------------------6589645328563345165421683419-------------------------------------------------------------------------------
		
		JLabel lblCuandoToma = new JLabel("12 Cuando toma una decisión, difícilmente la cambia\r\n");
		lblCuandoToma.setBounds(549, 206, 468, 16);
		contentPane.add(lblCuandoToma);
		
		
		JRadioButton rdbtnVerdadero_2 = new JRadioButton("Verdadero");
		rdbtnVerdadero_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP12("si");
			}
		});
		rdbtnVerdadero_2.setBounds(559, 237, 115, 23);
		contentPane.add(rdbtnVerdadero_2);
		
		JRadioButton radioButton_10 = new JRadioButton("Falso");
		radioButton_10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP12("no");
			}
		});
		radioButton_10.setBounds(681, 237, 115, 23);
		contentPane.add(radioButton_10);
		grupo12.add(rdbtnVerdadero_2);
		grupo12.add(radioButton_10);
		
		JLabel lblCuandoTiene = new JLabel("13 Cuando tiene que hablar frente a un grupo más o menos grande de personas (por ejemplo en clase), se pone nervioso y muy ansioso");
		lblCuandoTiene.setBounds(539, 272, 572, 16);
		contentPane.add(lblCuandoTiene);
		
		
		JRadioButton radioButton_9 = new JRadioButton("Falso");
		radioButton_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP13("no");
			}
		});
		radioButton_9.setBounds(681, 303, 106, 23);
		contentPane.add(radioButton_9);
		
		JRadioButton rdbtnVerdadero_3 = new JRadioButton("Verdadero");
		rdbtnVerdadero_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP13("si");
			}
		});
		rdbtnVerdadero_3.setBounds(559, 303, 115, 23);
		contentPane.add(rdbtnVerdadero_3);
		grupo13.add(rdbtnVerdadero_3);
		grupo13.add(radioButton_9);
		
		
		JLabel lblTieneUna = new JLabel("14 Tiene una idea clara y objetiva de cómo es, no se infravalora\r\n");
		lblTieneUna.setBounds(549, 338, 355, 16);
		contentPane.add(lblTieneUna);
		
		JRadioButton rdbtnVerdadero_4 = new JRadioButton("Verdadero");
		rdbtnVerdadero_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP14("si");
			}
		});
		rdbtnVerdadero_4.setBounds(559, 369, 115, 23);
		contentPane.add(rdbtnVerdadero_4);
		
		
		JRadioButton radioButton_6 = new JRadioButton("Falso");
		radioButton_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP14("no");
			}
		});
		radioButton_6.setBounds(681, 369, 126, 23);
		contentPane.add(radioButton_6);
		grupo14.add(rdbtnVerdadero_4);
		grupo14.add(radioButton_6);
		
		JLabel lblLeResulta_1 = new JLabel("15 Le resulta fácil hacer nuevas amistades\r\n");
		lblLeResulta_1.setBounds(549, 404, 355, 16);
		contentPane.add(lblLeResulta_1);
		
		JRadioButton radioButton_5 = new JRadioButton("Falso");
		radioButton_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP15("no");
			}
		});
		radioButton_5.setBounds(681, 435, 126, 23);
		contentPane.add(radioButton_5);
		
		JRadioButton rdbtnVerdadero_5 = new JRadioButton("Verdadero");
		rdbtnVerdadero_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP15("si");
			}
		});
		rdbtnVerdadero_5.setBounds(559, 435, 115, 23);
		contentPane.add(rdbtnVerdadero_5);
		
		grupo15.add(rdbtnVerdadero_5);
		grupo15.add(radioButton_5);
		
		JLabel lblLeResulta = new JLabel("16 Frecuentemente habla de sus amigos como si fueran mejores que él, alabando todo lo que dicen y hacen\r\n\r\n");
		lblLeResulta.setBounds(549, 470, 552, 16);
		contentPane.add(lblLeResulta);
		
		
		JRadioButton rdbtnVerdadero_6 = new JRadioButton("Verdadero");
		rdbtnVerdadero_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP16("si");
			}
		});
		rdbtnVerdadero_6.setBounds(559, 501, 115, 23);
		contentPane.add(rdbtnVerdadero_6);
		
		
		
		JRadioButton radioButton_3 = new JRadioButton("Falso");
		radioButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP16("no");
			}
		});
		radioButton_3.setBounds(681, 501, 126, 23);
		contentPane.add(radioButton_3);
		grupo16.add(radioButton_3);
		grupo16.add(rdbtnVerdadero_6);
		
		JLabel lblSMuy = new JLabel("17 s muy indeciso a la hora de arreglarse o vestirse, nunca se ve lo suficientemente bien\r\n");
		lblSMuy.setBounds(549, 531, 529, 21);
		contentPane.add(lblSMuy);
		
		JRadioButton rdbtnVerdadero_7 = new JRadioButton("Verdadero");
		rdbtnVerdadero_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP17("si");
			}
		});
		rdbtnVerdadero_7.setBounds(559, 567, 115, 23);
		contentPane.add(rdbtnVerdadero_7);
		
		

		
		JRadioButton radioButton = new JRadioButton("Falso");
		radioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP17("no");
			}
		});
		radioButton.setBounds(681, 567, 126, 23);
		contentPane.add(radioButton);
		grupo17.add(radioButton);
		grupo17.add(rdbtnVerdadero_7);
		
		JLabel lblMuchasVeces = new JLabel("18 Muchas veces creo que se avergüenza de su familia");
		lblMuchasVeces.setBounds(549, 607, 529, 21);
		contentPane.add(lblMuchasVeces);
		
		
	
		
		JRadioButton radioButton_18 = new JRadioButton("Falso");
		radioButton_18.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP18("no");
			}
		});
		radioButton_18.setBounds(681, 643, 126, 23);
		contentPane.add(radioButton_18);
		
		JRadioButton rdbtnVerdadero_8 = new JRadioButton("Verdadero");
		rdbtnVerdadero_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				m.RespuestaP18("si");
			}
		});
		rdbtnVerdadero_8.setBounds(559, 643, 115, 23);
		contentPane.add(rdbtnVerdadero_8);
		grupo18.add(rdbtnVerdadero_8);
		grupo18.add(radioButton_18);
		
		
		
		
	}
}

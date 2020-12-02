package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import controller.CandidatoController;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CandidatoGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblCpf;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JLabel lblTitulo;
	private JLabel lblNome;
	private JLabel lblCargo;
	private JRadioButton rdbtnProfFund;
	private JRadioButton rdbtnProfMed;
	private JRadioButton rdbtnProfSup;
	private JButton btnLimpar;
	private JButton btnEnviar;
	private ButtonGroup grupo;
	
	 /** Criar the frame **/
	
	public CandidatoGUI() {
		setTitle("CONCURSO - INSCRI\u00C7\u00C3O");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Handler handler = new Handler(); /**instanciando o "ouvinte" **/

		lblTitulo = new JLabel("INSCRI\u00C7\u00C3O DE CANDIDATO");
		lblTitulo.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblTitulo.setBounds(86, 21, 179, 36);
		contentPane.add(lblTitulo);

		lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNome.setBounds(42, 68, 72, 24);
		contentPane.add(lblNome);

		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblCpf.setBounds(42, 144, 72, 24);
		contentPane.add(lblCpf);

		lblCargo = new JLabel("CARGO");
		lblCargo.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblCargo.setBounds(43, 222, 72, 24);
		contentPane.add(lblCargo);

		txtNome = new JTextField();
		txtNome.setBounds(42, 99, 223, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(42, 179, 223, 20);
		contentPane.add(txtCpf);

		rdbtnProfFund = new JRadioButton("Professor Ensino Fundamental");
		rdbtnProfFund.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnProfFund.setBounds(43, 255, 222, 23);
		contentPane.add(rdbtnProfFund);

		rdbtnProfMed = new JRadioButton("Professor Ensino Medio");
		rdbtnProfMed.setBounds(42, 299, 223, 23);
		contentPane.add(rdbtnProfMed);

		rdbtnProfSup = new JRadioButton("Professor Ensino Superior");
		rdbtnProfSup.setBounds(42, 342, 223, 23);
		contentPane.add(rdbtnProfSup);
		
		/**criar grupo de radio buttons que permite que o usuário selecione apenas uma opção**/
		
		grupo = new ButtonGroup();
		grupo.add(rdbtnProfFund);
		grupo.add(rdbtnProfMed);
		grupo.add(rdbtnProfSup);

		btnLimpar = new JButton("LIMPAR");
		btnLimpar.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnLimpar.setBounds(42, 394, 110, 33);
		btnLimpar.addActionListener(handler);
		contentPane.add(btnLimpar);
		

		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setFont(new Font("Arial Black", Font.BOLD, 11));
		btnEnviar.setBounds(208, 394, 110, 33);
		btnEnviar.addActionListener(handler);
		contentPane.add(btnEnviar);

		/**Definindo responsividade e visibilidade da caixa**/
		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

	}
	
	public void limpar() {
		
		txtNome.setText("");
		txtCpf.setText("");
		grupo.clearSelection();
	}
	
	/**Tratamento de Exceção**/
	
	public class Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnLimpar) {
				limpar();
			}
			else {
				/**evento do botão cadastrar**/
				
				if(e.getSource()==btnEnviar) {
					String nome = txtNome.getText();/**recebe os textos dos campos e transforma no formato **/
					String cpf = txtCpf.getText();
					String cargo;
					if(rdbtnProfFund.isSelected()) {
						cargo = "Professor Ensino Fundamental";
					}
					else if(rdbtnProfMed.isSelected()) {
						cargo = "Professor Ensino Medio";
					}
					else {
						cargo = "Professor Ensino Superior";
					}
				
					
					if((nome.equals("")) ||  (cpf.equals("")) || ( (!rdbtnProfFund.isSelected()) && (!rdbtnProfMed.isSelected()) && (!rdbtnProfSup.isSelected()) ) ) {
						JOptionPane.showMessageDialog(getContentPane(), "Todos os campos devem ser preenchidos", "Atenção!", 1, null);
						
					}
					else {
						CandidatoController ccontrol= new	CandidatoController();/**importar da classe de controle**/
						if (ccontrol.cadastrar(cpf, nome, cargo)==1){
							JOptionPane.showMessageDialog(getContentPane(), "Usuário cadastrado com sucesso", "Bem-vindo!", 1, null);
							limpar();   /**quando cadastra, temos a opção de limpar**/
						}
						else {
							
							JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o usuário", "ATENÇÃO", 1);
						}
					
						
					}
				}
			}
		}
	}
}

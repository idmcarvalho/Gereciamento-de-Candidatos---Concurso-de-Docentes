package view;

import java.awt.EventQueue;//2º passo - imports iniciais para GUI
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
//3º passo - abrir com windowbuilder



private JPanel contentPane;
private JTextField txtTtututtu;
private JButton btnNewButton;
private JTextField textField;
private JTextField textField_1;

    public class CandidatoGUI extends JFrame {
        private JTextField txtInscricaoDeCandidato;
        private JTextField textField;
        private JTextField textField_1;
        private JTextField textField_2;
        public CandidatoGUI() {
        	getContentPane().setBackground(new Color(230, 230, 250));
        	setTitle("CONCURSO - INSCRI\u00C7\u00C3O");
        	getContentPane().setLayout(null);
        	
        	JTextPane txtpnInscrioDeCandidato = new JTextPane();
        	txtpnInscrioDeCandidato.setBackground(new Color(230, 230, 250));
        	txtpnInscrioDeCandidato.setFont(new Font("Arial Black", Font.BOLD, 11));
        	txtpnInscrioDeCandidato.setText("INSCRI\u00C7\u00C3O DE CANDIDATO");
        	txtpnInscrioDeCandidato.setBounds(68, 25, 183, 34);
        	getContentPane().add(txtpnInscrioDeCandidato);
        	
        	JTextPane txtpnNome = new JTextPane();
        	txtpnNome.setBackground(new Color(230, 230, 250));
        	txtpnNome.setFont(new Font("Arial Black", Font.BOLD, 11));
        	txtpnNome.setText("NOME");
        	txtpnNome.setBounds(28, 91, 49, 23);
        	getContentPane().add(txtpnNome);
        	
        	JTextPane txtpnCpf = new JTextPane();
        	txtpnCpf.setBackground(new Color(230, 230, 250));
        	txtpnCpf.setText("CPF");
        	txtpnCpf.setFont(new Font("Arial Black", Font.BOLD, 11));
        	txtpnCpf.setBounds(28, 173, 49, 23);
        	getContentPane().add(txtpnCpf);
        	
        	JTextPane txtpnCargo = new JTextPane();
        	txtpnCargo.setBackground(new Color(230, 230, 250));
        	txtpnCargo.setText("CARGO");
        	txtpnCargo.setFont(new Font("Arial Black", Font.BOLD, 11));
        	txtpnCargo.setBounds(28, 256, 49, 23);
        	getContentPane().add(txtpnCargo);
        	
        	JRadioButton rdbtnNewRadioButton = new JRadioButton("Professor Ensino Fundamental");
        	rdbtnNewRadioButton.setBackground(new Color(230, 230, 250));
        	rdbtnNewRadioButton.setBounds(26, 278, 200, 50);
        	getContentPane().add(rdbtnNewRadioButton);
        	
        	JRadioButton rdbtnProfessorEnsinoMdio = new JRadioButton("Professor Ensino M\u00E9dio");
        	rdbtnProfessorEnsinoMdio.setBackground(new Color(230, 230, 250));
        	rdbtnProfessorEnsinoMdio.setBounds(26, 318, 200, 50);
        	getContentPane().add(rdbtnProfessorEnsinoMdio);
        	
        	JRadioButton rdbtnProfessorEnsinoSuperior = new JRadioButton("Professor Ensino Superior");
        	rdbtnProfessorEnsinoSuperior.setBackground(new Color(230, 230, 250));
        	rdbtnProfessorEnsinoSuperior.setBounds(26, 361, 200, 50);
        	getContentPane().add(rdbtnProfessorEnsinoSuperior);
        	
        	JButton btnNewButton = new JButton("LIMPAR");
        	btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 11));
        	btnNewButton.addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent e) {
        		}
        	});
        	btnNewButton.setBounds(26, 434, 96, 34);
        	getContentPane().add(btnNewButton);
        	
        	textField_1 = new JTextField();
        	textField_1.setFont(new Font("Arial Black", Font.BOLD, 11));
        	textField_1.setBounds(26, 125, 254, 34);
        	getContentPane().add(textField_1);
        	textField_1.setColumns(10);
        	
        	textField_2 = new JTextField();
        	textField_2.setFont(new Font("Arial Black", Font.BOLD, 11));
        	textField_2.setColumns(10);
        	textField_2.setBounds(26, 202, 254, 34);
        	getContentPane().add(textField_2);
        	
        	JButton btnEnviar = new JButton("ENVIAR");
        	btnEnviar.setFont(new Font("Arial Black", Font.BOLD, 11));
        	btnEnviar.setBounds(184, 434, 96, 34);
        	getContentPane().add(btnEnviar);
}//1º passo - aplicar extends JFrame a public class
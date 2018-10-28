import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin {

	public static void main(String[] args) {
		
		JFrame jFrameLogin = new JFrame();
		Container content = jFrameLogin.getContentPane();
		content.setLayout(null);
		jFrameLogin.setVisible(true);
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Tela de Login");
		lblTitulo.setBounds(112, 16, 180, 15);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
		lblTitulo.setForeground(Color.red);
		content.add(lblTitulo);
		
		JLabel lblLogin = new JLabel();
		lblLogin.setText("Insira seu Login!");
		lblLogin.setBounds(83, 30, 190, 20);
		content.add(lblLogin);
		
		
		JLabel lblPassword = new JLabel();
		lblPassword.setText("Insira sua Senha!");
		lblPassword.setBounds(83, 73, 190, 15);
		content.add(lblPassword);
		
		JTextField jTFLogin = new JTextField();
		jTFLogin.setBounds(80, 50, 210, 20);
		content.add(jTFLogin);
		
		JPasswordField jPFPassword = new JPasswordField();
		jPFPassword.setBounds(80, 90, 210, 20);
		content.add(jPFPassword);
		
		JPanel jPanelBotoes = new JPanel();
		jPanelBotoes.setBounds(30, 120, 280, 60); 
		jPanelBotoes.setLayout (null); 
		jPanelBotoes.setBackground(Color.blue);
		content.add(jPanelBotoes);
		
		JButton btnOk = new JButton("OK");
		btnOk. setBounds(70, 20, 80, 23);
		jPanelBotoes.add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(150, 20, 100, 23);
		btnCancelar.setToolTipText("Sair do	Programa");    
		jPanelBotoes.add(btnCancelar);
		
		jFrameLogin.pack();
		jFrameLogin.setSize(350, 200);

	}

}


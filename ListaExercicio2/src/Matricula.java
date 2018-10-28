import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Matricula {	
	
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Utilizando o JtextComponent");
		Container content = frame.getContentPane();
		content.setLayout(null);
		frame.setVisible(true);
				
		JPanel painelBranco = new JPanel();
		painelBranco.setLayout(null);
		painelBranco.setBackground(Color.white);
		painelBranco.setBounds(10, 10, 550, 340);
		content.add(painelBranco);
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Matrícula em Disciplina");
		lblTitulo.setForeground(Color.blue);
		lblTitulo.setFont(new Font("Arial", Font.BOLD|Font.ITALIC, 18) );
		lblTitulo.setBounds(170, 10, 210, 30);
		painelBranco.add(lblTitulo);
		
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome do aluno: ");
		lblNome.setBounds(20, 60, 170, 15);
		painelBranco.add(lblNome);
		
		JLabel lblCurso = new JLabel();
		lblCurso.setText("Curso: ");
		lblCurso.setBounds(20, 90, 50, 15);
		painelBranco.add(lblCurso);
		
		JLabel lblDisciplina = new JLabel();
		lblDisciplina.setText("Disciplina: ");
		lblDisciplina.setBounds(20, 120, 110, 15);
		painelBranco.add(lblDisciplina);
		
		JPanel painelAmarelo = new JPanel();
		painelAmarelo.setLayout(null);
		painelAmarelo.setBackground(Color.yellow);
		painelAmarelo.setBounds(20, 180, 470, 130);
		painelAmarelo.setBorder(BorderFactory.createEtchedBorder());
		painelBranco.add(painelAmarelo);
		
		JTextField tfNome = new JTextField();
		tfNome.setText("Digite o seu nome!");
		tfNome.setForeground(Color.blue);
		tfNome.setBounds(132, 58, 390, 20);
		painelBranco.add(tfNome);
		
		JTextField tfCurso = new JTextField();
		tfCurso.setText("Sistemas de informação");
		tfCurso.setForeground(Color.blue);
		tfCurso.setBounds(132, 90, 390, 20);
		painelBranco.add(tfCurso);

		JTextField tfDisciplina = new JTextField();
		tfDisciplina.setText("Linguagens e Técnicas de Programação");
		tfDisciplina.setForeground(Color.blue);
		tfDisciplina.setBounds(132, 120, 390, 20);
		painelBranco.add(tfDisciplina);
		
		JLabel lblComentario = new JLabel();
		lblComentario.setText("Comentário");
		lblComentario.setBounds(20, 10, 70, 15);
		painelAmarelo.add(lblComentario);
		
		JTextArea taComentario = new JTextArea();
		taComentario.setText("O Intuito da disciplina é ensinar ao aluno o paradigma orientado a objetos, setText ('O Intuito da disciplina é "
				+ "ensinar ao aluno o paradigma orientado a objetos, utilizando a linguagem de programação orientada a objetos JAVA, "
				+ "também apresentar os componentes para construção de interface gráfica, o SWING.");
		taComentario.setForeground(Color.blue); 
		taComentario.setLineWrap(true);
		taComentario.setWrapStyleWord(true);
		taComentario.setBounds(20, 30, 430, 87);
		painelAmarelo.add(taComentario);
		
		frame.pack();
		frame.setSize(550, 400);
						
	}
	

}
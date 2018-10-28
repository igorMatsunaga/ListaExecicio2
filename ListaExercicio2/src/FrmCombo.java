import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCombo extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCombo frame = new FrmCombo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrmCombo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFrame frame = new JFrame("teste");
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(39, 20, 399, 82);
		panel.setBorder(BorderFactory.createRaisedBevelBorder());
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEscolhaUmCarro = new JLabel("Escolha um carro:");
		lblEscolhaUmCarro.setBounds(12, 12, 125, 15);
		panel.add(lblEscolhaUmCarro);
		
		String[] carros = {"fusca","palio","civic"};
		JComboBox<?> comboBox = new JComboBox(carros);
		comboBox.setForeground(new Color(255, 255, 255));
		comboBox.setBackground(Color.BLUE);
		comboBox.setBounds(203, 7, 184, 24);
		panel.add(comboBox);
		
		JLabel lblAcabaDeGanhar = new JLabel("Você acaba de ganhar um.");
		lblAcabaDeGanhar.setBounds(49, 152, 190, 15);
		contentPane.add(lblAcabaDeGanhar);
		
		JLabel lblIndexDoValor = new JLabel("Index do valor escolhido:");
		lblIndexDoValor.setBounds(49, 210, 190, 15);
		contentPane.add(lblIndexDoValor);
		
		JLabel label = new JLabel();
		label.setBounds(243, 152, 70, 15);
		contentPane.add(label);
		label.add(new JSeparator(SwingConstants.VERTICAL));
		
		JLabel label_1 = new JLabel();
		label_1.setBounds(243, 210, 70, 15);
		contentPane.add(label_1);
		label_1.add(new JSeparator(SwingConstants.VERTICAL));
				
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tipo = comboBox.getSelectedItem().toString();
				label.setText(tipo);
				int ind = comboBox.getSelectedIndex();
				label_1.setText(String.valueOf(ind));
			
				
			}
		});
		btnLimpar.setBounds(322, 168, 117, 25);
		contentPane.add(btnLimpar);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.BLACK);
		separator.setBounds(312, 130, 10, 100);
		contentPane.add(separator);
		
		
	}
}
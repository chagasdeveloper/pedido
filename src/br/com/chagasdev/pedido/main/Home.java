package br.com.chagasdev.pedido.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;;
	private JLabel jLabel = new JLabel("Eu te amo :)");

	private JPanel jPanel = new JPanel();
	public static final int WIDTH = 600;
	public static final int HEIGHT = 400;

	public Home() {
		jPanel.setLayout(null);
		jPanel.setBounds(0, 0, WIDTH, HEIGHT);
		jPanel.setBackground(new Color(172, 113, 117));

		// jLabel
		jLabel.setForeground(new Color(218, 165, 32));
		jLabel.setFont(new Font("Verdana", 3, 32));
		jLabel.setBounds(180, 80, 350, 80);
		jPanel.add(jLabel);
		this.add(jPanel);
		setTitle("O amor está no ar");
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}

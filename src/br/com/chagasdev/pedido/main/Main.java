package br.com.chagasdev.pedido.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame implements KeyListener, MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Random rand;
	private JButton jButtonYes = new JButton("Sim");
	private JButton jButtonNot = new JButton("Não");
	private JLabel jLabel = new JLabel("Quer namorar comigo?");

	private JPanel jPanel = new JPanel();
	public static final int WIDTH = 600;
	public static final int HEIGHT = 400;

	public Main() {
		rand = new Random();
		jPanel.setLayout(null);
		jPanel.setBounds(0, 0, WIDTH, HEIGHT);
		jPanel.setBackground(new Color(172, 113, 117));
		// jButtonYes
		jButtonYes.setForeground(new Color(230, 69, 78));
		jButtonYes.setBackground(new Color(218, 165, 32));
		jButtonYes.setFont(new Font("Verdana", 3, 13));
		jButtonYes.setBounds(190, 150, 70, 25);
		jButtonYes.setBorderPainted(false);
		jButtonYes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonYesActionPerformed(evt);
			}
		});
		// jButtonNot
		jButtonNot.setForeground(new Color(230, 69, 78));
		jButtonNot.setBackground(new Color(218, 165, 32));
		jButtonNot.setFont(new Font("Verdana", 3, 13));
		jButtonNot.setBounds(290, 150, 70, 25);
		jButtonNot.setBorderPainted(false);
		jButtonNot.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButtonNotEntered(evt);
			}
		});
		// jLabel
		jLabel.setForeground(new Color(218, 165, 32));
		jLabel.setFont(new Font("Verdana", 3, 24));
		jLabel.setBounds(140, 80, 350, 50);
		jPanel.add(jButtonYes);
		jPanel.add(jButtonNot);
		jPanel.add(jLabel);
		this.add(jPanel);
		setTitle("Developed by @chagas.dev");
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		rand = new Random();
		this.addMouseListener(this);
		this.addKeyListener(this);

	}

	private void jButtonNotEntered(java.awt.event.MouseEvent evt) {
		System.out.println("Entrou");
		int x = rand.nextInt(530);
		int y = rand.nextInt(320);
		if ((x <= 0 || x > 530) && (y <= 0 || y > 320)) {
			return;
		} 
		if ((x >= 190 && x <= 260) && (y >= 150 && y <= 175)) {
			return;
		}
		jButtonNot.setBounds(x, y, 70, 25);
		System.out.println("X: " + x + " Y: " + y);
	}

	private void jButtonYesActionPerformed(java.awt.event.ActionEvent evt) {
		new Home().setVisible(true);
		this.dispose();
	}

	public static void main(String[] args) {
		new Main();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if (code == KeyEvent.VK_TAB) {
			System.out.println("oi");
			jButtonYes.requestFocus();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

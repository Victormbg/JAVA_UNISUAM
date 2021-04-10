package com.suam.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.suam.av1.Empresa;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CadastroEmpresa extends JFrame {
	
	private JPanel contentPane;
	private JTextField c_emp_nome;
	private JTextField c_emp_cnpj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroEmpresa frame = new CadastroEmpresa();
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
	public CadastroEmpresa() {
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Empresa");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNewLabel.setBounds(139, 28, 162, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(139, 78, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		c_emp_nome = new JTextField();
		c_emp_nome.setBounds(139, 93, 162, 20);
		contentPane.add(c_emp_nome);
		c_emp_nome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cnpj");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(139, 142, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		c_emp_cnpj = new JTextField();
		c_emp_cnpj.setBounds(139, 157, 162, 20);
		contentPane.add(c_emp_cnpj);
		c_emp_cnpj.setColumns(10);
		
		JButton btn_semp = new JButton("Cadastrar");
		btn_semp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empresa E = new Empresa(c_emp_nome.getText(),c_emp_cnpj.getText());
				
				LoadTableEmp();
			}
		});
		btn_semp.setBackground(new Color(0, 100, 0));
		btn_semp.setForeground(Color.WHITE);
		btn_semp.setBounds(139, 191, 162, 23);
		contentPane.add(btn_semp);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Redirecionar para tela principal
				main viewMain = new main(); 
				viewMain.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(139, 225, 162, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("..\\ApsPOO\\img\\oi.jpg"));
		lblNewLabel_3.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_3);
	}

	protected void LoadTableEmp() {
		// TODO Auto-generated method stub
		
	}
}

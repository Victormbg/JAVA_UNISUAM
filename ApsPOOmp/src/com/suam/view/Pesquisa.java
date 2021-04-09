package com.suam.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pesquisa extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JComboBox comboBox;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pesquisa frame = new Pesquisa();
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
	public Pesquisa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		table = new JTable();
		table.setShowGrid(false);
		table.setShowHorizontalLines(false);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 128, 0), 2, true));
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(0, 0, 0));
		table.setFont(new Font("Source Sans Pro", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Unisuam", "111.111.111-2", "Marcos", "Paulo"},
				{"2", "Estacio", "155.121.131-2", "Victor", "Paulo"},
				{"3", "UERJ", "111.111.111-2", "Pedro", "Paulo"},
				{"4", "UFRJ", "111.111.111-2", "Lucas", "Paulo"},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "Empresa", "CNPJ", "Funcionario", "Cliente"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(2).setPreferredWidth(95);
		
		lblNewLabel_9 = new JLabel("Cliente");
		lblNewLabel_9.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(309, 101, 60, 14);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_8 = new JLabel("Funcion\u00E1rio");
		lblNewLabel_8.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(309, 39, 87, 14);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_7 = new JLabel("Empresa");
		lblNewLabel_7.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(50, 101, 68, 14);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_6 = new JLabel("ID");
		lblNewLabel_6.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(50, 39, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setBounds(50, 54, 187, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(309, 54, 241, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(309, 118, 241, 25);
		contentPane.add(textField_2);
		
		comboBox = new JComboBox();
		comboBox.setBounds(50, 119, 187, 22);
		contentPane.add(comboBox);
		
		btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Redirecionar para tela principal
				main viewMain = new main(); 
				viewMain.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(128, 0, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(461, 170, 89, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setBackground(new Color(218, 165, 32));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(362, 170, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton = new JButton("Buscar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setBounds(263, 170, 89, 23);
		contentPane.add(btnNewButton);
		table.setBounds(10, 242, 557, 190);
		contentPane.add(table);
		
		lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(31, 217, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Empresa");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(129, 217, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Cnpj");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(249, 217, 30, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Funcion\u00E1rio");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(345, 220, 68, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Cliente");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(488, 220, 46, 14);
		contentPane.add(lblNewLabel_5);
		JLabel lblNewLabel = new JLabel("Fundo");
		lblNewLabel.setLabelFor(lblNewLabel_1);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon("..\\ApsPOO\\img\\oi.jpg"));
		lblNewLabel.setBounds(0, 0, 577, 443);
		contentPane.add(lblNewLabel);
	}
}

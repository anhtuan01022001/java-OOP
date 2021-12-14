package thuNghiem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.ArrayList;
public class testAuto extends JFrame {

	private JPanel contentPane;
	private JTextField txttim;
	private TextAutoCompleter ac;
	private JButton btnNhấn;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel model=new DefaultTableModel();
	private Connection conn;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testAuto frame = new testAuto();
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
	public testAuto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txttim = new JTextField();
		txttim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			CargarAutoCompleter();
			}
		});
		txttim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				CargarAutoCompleter();
			}
		});
		ac = new TextAutoCompleter(txttim);
	
		txttim.setBounds(64, 65, 207, 33);
		contentPane.add(txttim);
		txttim.setColumns(10);
		
		btnNhấn = new JButton("New button");
		btnNhấn.setBounds(285, 68, 77, 27);
		contentPane.add(btnNhấn);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 123, 477, 238);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		model.addColumn("Tên tài khoản");
		model.addColumn("Số tiền nạp");
		table.setModel(model);
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QUAN_NET;user=sa;password=Son862001");
		    
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		loadData();
		
	}
	private void CargarAutoCompleter() {  
		ArrayList<String> valores=new ArrayList<>();
		int j=0;
		try {
			PreparedStatement pstm = conn.prepareStatement("Select * from AcountMember ");
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				
				valores.add(rs.getString("MbName")) ;
			
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		for(int i =0; i < valores.size();i++){
			ac.addItem(valores.get(i));
		}	
	}
	
	public void loadData() {
		model.setRowCount(0);
	try {
		PreparedStatement pstm = conn.prepareStatement("Select * from AcountMember ");
		ResultSet rs = pstm.executeQuery();
		while(rs.next()) {
		
			model.addRow(new Object [] {rs.getString("MbName"),rs.getInt("SoTienNap")});
		}
		table.setModel(model);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}
	
	
}

package thuNghiem;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.ComponentOrientation;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JCalendar;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

public class thongkeNgay extends JPanel {
	private JTable table;
	private Connection conn=null;
	private DefaultTableModel model =new DefaultTableModel();
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private int D=0;
	private int M=0;
	private int Y=0;
	private String ngay[];
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public thongkeNgay() {
		setBorder(new MatteBorder(5, 5, 1, 1, (Color) new Color(112, 128, 144)));
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 104, 419, 327);
		add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("CHI TI\u1EBET DOANH THU NG\u00C0Y");
		lblNewLabel.setBounds(114, 13, 257, 34);
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		add(lblNewLabel);
		table.setRowHeight(25);
		model.addColumn("Tên Tài Khoản");
		model.addColumn("Số tiền nạp");
		model.addColumn("Ngày nạp");
		table.setModel(model);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dateChooser.setBounds(239, 57, 143, 23);
		add(dateChooser);
		
		JButton btnNewButton = new JButton("Xem");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
				String date = df.format(dateChooser.getDate());
				textField.setText(date);
				model.setRowCount(0);
				String sl= "select * from thongKe where date = '"+ date+"'";
				try {
					Statement pstm = conn.createStatement();
					
					
					ResultSet rs = pstm.executeQuery(sl);
					while(rs.next()) {
						
						model.addRow(new Object [] {rs.getString("MbName"),rs.getInt("SoTienNap"),sdf.format(rs.getDate("date"))});
					}
					table.setModel(model);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(80, 57, 85, 23);
		add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(10, 23, 96, 19);
		add(textField);
		textField.setColumns(10);
		//ngay=ng;
		
		
		
		
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QUAN_NET;user=sa;password=Son862001");
		    
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
		
		loadData();
	}
	
	
	public void loadData() {
		model.setRowCount(0);
		
		
		
		
		try {
			PreparedStatement pstm = conn.prepareStatement("select * from dbo.CTdoanhThuNgay()");
			
			
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				
				model.addRow(new Object [] {rs.getString("MbName"),rs.getInt("SoTienNap"),sdf.format(rs.getDate("date"))});
			}
			table.setModel(model);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}

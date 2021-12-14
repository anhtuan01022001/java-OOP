package thuNghiem;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

public class ThongkeNam extends JPanel {
	private JTable table;
	private Connection conn=null;
	private DefaultTableModel model =new DefaultTableModel();
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	/**
	 * Create the panel.
	 */
	public ThongkeNam() {
		setBorder(new MatteBorder(5, 5, 1, 1, (Color) new Color(112, 128, 144)));
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 85, 419, 346);
		add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		scrollPane.setViewportView(table);
		
		JLabel lblThngKNm = new JLabel("CHI TI\u1EBET DOANH THU N\u0102M");
		lblThngKNm.setFont(new Font("Times New Roman", Font.ITALIC, 27));
		lblThngKNm.setBounds(45, 25, 348, 37);
		add(lblThngKNm);
		table.setRowHeight(25);
		
		
		
		model.addColumn("Tên Tài Khoản");
		model.addColumn("Số tiền nạp");
		model.addColumn("Ngày nạp");
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
	
	public void loadData() {
		model.setRowCount(0);
		
		
		
		
		try {
			PreparedStatement pstm = conn.prepareStatement("select * from dbo.CTdoanhThuQuy()");
			
			
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

package thuNghiem;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class testbnt extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public testbnt() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\sondu\\Downloads\\bin.png"));
		btnNewButton.setBounds(0, 0, 25, 25);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\sondu\\Downloads\\repair.png"));
		btnNewButton_1.setBounds(24, 0, 25, 25);
		add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 195, 612, 369);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
}

package forThreePerson;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class result extends JFrame {

	private JPanel panel;
	private JTextField totalTk;
	private JTextField mt;
	private JTextField mgm;
	private JTextField mco;
	private JTextField mg;
	private JTextField rt;
	private JTextField rgm;
	private JTextField rco;
	private JTextField rg;
	private JTextField rr;
	private JTextField at;
	private JTextField agm;
	private JTextField aco;
	private JTextField ag;
	private JTextField ar;
	private JTextField mr;
	private JTextField tReturn;
	private JTextField tShort;
	private JTextField mRate;

	public result(double[]mc,double[]gm, double left) {
		setTitle("Meal rate calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 627);
		setLocationRelativeTo(null);
		panel = new JPanel();
		panel.setForeground(Color.RED);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);

		JLabel lblMehediVai1 = new JLabel("Akhi apu");
		lblMehediVai1.setFont(new Font("NewsGoth Cn BT", Font.BOLD, 26));
		lblMehediVai1.setBounds(39, 173, 114, 34);
		panel.add(lblMehediVai1);

		JLabel lblRaabbiVai = new JLabel("Munni");
		lblRaabbiVai.setFont(new Font("NewsGoth Cn BT", Font.BOLD, 26));
		lblRaabbiVai.setBounds(63, 241, 94, 34);
		panel.add(lblRaabbiVai);

		JLabel lblAmitVai = new JLabel("Saria");
		lblAmitVai.setFont(new Font("NewsGoth Cn BT", Font.BOLD, 26));
		lblAmitVai.setBounds(72, 300, 75, 34);
		panel.add(lblAmitVai);

		JLabel lblTotalMeal = new JLabel("Total debit :");
		lblTotalMeal.setFont(new Font("Myanmar Text", Font.BOLD, 26));
		lblTotalMeal.setBounds(84, 25, 163, 51);
		panel.add(lblTotalMeal);

		JTextField tMeal = new JTextField();
		tMeal.setEditable(false);
		tMeal.setText("212");
		tMeal.setFont(new Font("Times New Roman", Font.BOLD, 30));
		tMeal.setColumns(10);
		tMeal.setBackground(Color.WHITE);
		tMeal.setBounds(252, 72, 145, 33);
		panel.add(tMeal);

		JLabel label = new JLabel("Total meal :");
		label.setFont(new Font("Myanmar Text", Font.BOLD, 26));
		label.setBounds(84, 70, 145, 51);
		panel.add(label);

		totalTk = new JTextField();
		totalTk.setText("212");
		totalTk.setFont(new Font("Times New Roman", Font.BOLD, 30));
		totalTk.setEditable(false);
		totalTk.setColumns(10);
		totalTk.setBackground(Color.WHITE);
		totalTk.setBounds(252, 27, 145, 33);
		panel.add(totalTk);

		JLabel lblNewLabel = new JLabel("Rate:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblNewLabel.setBounds(451, 45, 163, 61);
		panel.add(lblNewLabel);

		mt = new JTextField();
		mt.setEditable(false);
		mt.setBackground(new Color(245, 222, 179));
		mt.setText("212");
		mt.setFont(new Font("Times New Roman", Font.BOLD, 30));
		mt.setBounds(167, 172, 64, 32);
		panel.add(mt);
		mt.setColumns(10);

		JLabel label_1 = new JLabel("Given money");
		label_1.setForeground(new Color(220, 20, 60));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(264, 142, 115, 25);
		panel.add(label_1);

		JLabel lblTotalMeal_1 = new JLabel("Total meal");
		lblTotalMeal_1.setForeground(new Color(210, 180, 140));
		lblTotalMeal_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotalMeal_1.setBounds(145, 142, 94, 25);
		panel.add(lblTotalMeal_1);

		JLabel lblWillGive = new JLabel("Will give");
		lblWillGive.setForeground(new Color(154, 205, 50));
		lblWillGive.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWillGive.setBounds(580, 142, 75, 25);
		panel.add(lblWillGive);

		JLabel lblCost = new JLabel("Meal cost");
		lblCost.setForeground(new Color(255, 140, 0));
		lblCost.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCost.setBounds(435, 144, 87, 20);
		panel.add(lblCost);

		JLabel lblWillReturn = new JLabel("Worth");
		lblWillReturn.setForeground(new Color(255, 0, 0));
		lblWillReturn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblWillReturn.setBounds(747, 144, 54, 20);
		panel.add(lblWillReturn);

		mgm = new JTextField();
		mgm.setBackground(Color.WHITE);
		mgm.setEditable(false);
		mgm.setText("");
		mgm.setFont(new Font("Times New Roman", Font.BOLD, 30));
		mgm.setColumns(10);
		mgm.setBounds(264, 172, 124, 32);
		panel.add(mgm);

		mco = new JTextField();
		mco.setEditable(false);
		mco.setBackground(new Color(255, 160, 122));
		mco.setText("");
		mco.setFont(new Font("Times New Roman", Font.BOLD, 30));
		mco.setColumns(10);
		mco.setBounds(420, 172, 119, 32);
		panel.add(mco);

		mg = new JTextField();
		mg.setEditable(false);
		mg.setBackground(new Color(152, 251, 152));
		mg.setText("");
		mg.setFont(new Font("Times New Roman", Font.BOLD, 30));
		mg.setColumns(10);
		mg.setBounds(563, 172, 124, 32);
		panel.add(mg);

		rt = new JTextField();
		rt.setEditable(false);
		rt.setText("");
		rt.setFont(new Font("Times New Roman", Font.BOLD, 30));
		rt.setColumns(10);
		rt.setBackground(new Color(245, 222, 179));
		rt.setBounds(167, 241, 64, 32);
		panel.add(rt);

		rgm = new JTextField();
		rgm.setBackground(Color.WHITE);
		rgm.setEditable(false);
		rgm.setText("");
		rgm.setFont(new Font("Times New Roman", Font.BOLD, 30));
		rgm.setColumns(10);
		rgm.setBounds(264, 241, 124, 32);
		panel.add(rgm);

		rco = new JTextField();
		rco.setEditable(false);
		rco.setText("");
		rco.setFont(new Font("Times New Roman", Font.BOLD, 30));
		rco.setColumns(10);
		rco.setBackground(new Color(255, 160, 122));
		rco.setBounds(420, 241, 119, 32);
		panel.add(rco);

		rg = new JTextField();
		rg.setEditable(false);
		rg.setText("");
		rg.setFont(new Font("Times New Roman", Font.BOLD, 30));
		rg.setColumns(10);
		rg.setBackground(new Color(152, 251, 152));
		rg.setBounds(563, 241, 124, 32);
		panel.add(rg);

		rr = new JTextField();
		rr.setEditable(false);
		rr.setText("");
		rr.setForeground(Color.BLACK);
		rr.setFont(new Font("Times New Roman", Font.BOLD, 30));
		rr.setColumns(10);
		rr.setBackground(Color.RED);
		rr.setBounds(714, 241, 124, 32);
		panel.add(rr);

		at = new JTextField();
		at.setEditable(false);
		at.setText("");
		at.setFont(new Font("Times New Roman", Font.BOLD, 30));
		at.setColumns(10);
		at.setBackground(new Color(245, 222, 179));
		at.setBounds(167, 303, 64, 32);
		panel.add(at);

		agm = new JTextField();
		agm.setBackground(Color.WHITE);
		agm.setEditable(false);
		agm.setText("");
		agm.setFont(new Font("Times New Roman", Font.BOLD, 30));
		agm.setColumns(10);
		agm.setBounds(264, 303, 124, 32);
		panel.add(agm);

		aco = new JTextField();
		aco.setEditable(false);
		aco.setText("");
		aco.setFont(new Font("Times New Roman", Font.BOLD, 30));
		aco.setColumns(10);
		aco.setBackground(new Color(255, 160, 122));
		aco.setBounds(420, 303, 119, 32);
		panel.add(aco);

		ag = new JTextField();
		ag.setEditable(false);
		ag.setText("");
		ag.setFont(new Font("Times New Roman", Font.BOLD, 30));
		ag.setColumns(10);
		ag.setBackground(new Color(152, 251, 152));
		ag.setBounds(563, 303, 124, 32);
		panel.add(ag);

		ar = new JTextField();
		ar.setEditable(false);
		ar.setText("");
		ar.setForeground(Color.BLACK);
		ar.setFont(new Font("Times New Roman", Font.BOLD, 30));
		ar.setColumns(10);
		ar.setBackground(Color.RED);
		ar.setBounds(714, 303, 124, 32);
		panel.add(ar);

		mr = new JTextField();
		mr.setEditable(false);
		mr.setText("");
		mr.setForeground(Color.BLACK);
		mr.setFont(new Font("Times New Roman", Font.BOLD, 30));
		mr.setColumns(10);
		mr.setBackground(Color.RED);
		mr.setBounds(714, 172, 124, 32);
		panel.add(mr);

		JLabel lblTotalShort = new JLabel("Total return:");
		lblTotalShort.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 26));
		lblTotalShort.setBounds(55, 416, 184, 32);
		panel.add(lblTotalShort);

		tReturn = new JTextField();
		tReturn.setEditable(false);
		tReturn.setForeground(Color.RED);
		tReturn.setText("");
		tReturn.setFont(new Font("Times New Roman", Font.BOLD, 30));
		tReturn.setColumns(10);
		tReturn.setBounds(249, 415, 124, 32);
		panel.add(tReturn);

		JLabel lblTotalShortage = new JLabel("Total shortage:");
		lblTotalShortage.setToolTipText("To equalize, add left money with total shortage");
		lblTotalShortage.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 26));
		lblTotalShortage.setBounds(38, 486, 212, 32);
		panel.add(lblTotalShortage);

		tShort = new JTextField();
		tShort.setToolTipText("To equalize, add left money with total shortage");
		tShort.setEditable(false);
		tShort.setForeground(new Color(255, 0, 0));
		tShort.setText("");
		tShort.setFont(new Font("Times New Roman", Font.BOLD, 30));
		tShort.setColumns(10);
		tShort.setBounds(252, 485, 124, 32);
		panel.add(tShort);

		mRate = new JTextField();
		mRate.setForeground(new Color(255, 0, 0));
		mRate.setEditable(false);
		mRate.setText("52.34");
		mRate.setFont(new Font("Tahoma", Font.PLAIN, 65));
		mRate.setBounds(626, 31, 212, 85);
		panel.add(mRate);
		mRate.setColumns(10);

		double rate=0,tTk=0,tM=0,ret=0,sh=0;
		double[] tk = new double[mc.length];
		double[] give = new double[mc.length];
		double[] take = new double[mc.length];
		for(int i=0;i<mc.length;i++) {
			tTk+=gm[i];
			tM+=mc[i];
		}
		tTk-=left;
		rate=(int)((tTk/tM)*100)/100.0;
		for(int i=0;i<mc.length;i++) {
			tk[i]=(int)((rate*mc[i])*100)/100.0;
			if(tk[i]>gm[i]) {
				give[i]=(int)((tk[i]-gm[i])*100)/100.0;
				take[i]=0.0;
				sh+=(int)((give[i]*100)/100.0);
			}
			else if(tk[i]<gm[i]) {
				give[i]=0.0;
				take[i]=(int)((gm[i]-tk[i])*100)/100.0;
				ret+=(int)((take[i]*100)/100.0);
			}
			else {
				give[i]=0.0;
				take[i]=0.0;	
			}
		}
		mRate.setText(Double.toString(rate));
		tMeal.setText(Double.toString(tM));
		totalTk.setText(Double.toString(tTk));
		tReturn.setText(Double.toString(ret));
		tShort.setText(Double.toString(sh));
		//Akhi apu
		mt.setText(Double.toString(mc[0]));
		mgm.setText(Double.toString(gm[0]));
		mco.setText(Double.toString(tk[0]));
		mg.setText(Double.toString(give[0]));
		mr.setText(Double.toString(take[0]));

		//Munni
		rt.setText(Double.toString(mc[1]));
		rgm.setText(Double.toString(gm[1]));
		rco.setText(Double.toString(tk[1]));
		rg.setText(Double.toString(give[1]));
		rr.setText(Double.toString(take[1]));
		
		//Saria
		at.setText(Double.toString(mc[2]));
		agm.setText(Double.toString(gm[2]));
		aco.setText(Double.toString(tk[2]));
		ag.setText(Double.toString(give[2]));
		ar.setText(Double.toString(take[2]));
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mealRateCalculator m= new mealRateCalculator();
				dispose();
				m.setVisible(true);				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.setBounds(563, 455, 109, 40);
		panel.add(btnNewButton);
		
		JLabel lblWithoutLeftMoney = new JLabel("(Without left money)");
		lblWithoutLeftMoney.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblWithoutLeftMoney.setBounds(252, 517, 98, 13);
		panel.add(lblWithoutLeftMoney);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnClose.setBounds(716, 455, 109, 40);
		panel.add(btnClose);
		
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class mealRateCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField mMc, mGm, rMc, rGm, aMc, aGm, tMc, tGm, sMc, sGm, left;
	private JLabel lblShipu, lblEnterGivenMoney, lblMealCount, lblGiverMoney, lblMoneyLeft;
	
	
	private JPanel panel;
	private JTextField totalTk, mt, mgm, mco, mg, rt, rgm, rco, rg, rr, at, agm;
	private JTextField aco, ag, ar, tt, tgm, tco, tr, st, sgm, sco, sg, sr, mr;
	private JTextField tReturn, tShort, mRate;
	static double mm, mtk, rm, rtk, am, atk,tm, ttk, sm,stk;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mealRateCalculator frame = new mealRateCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public mealRateCalculator() {
		setTitle("Meal rate calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 627);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMehediVai = new JLabel("Mehedi vai :");
		lblMehediVai.setFont(new Font("MV Boli", Font.BOLD, 26));
		lblMehediVai.setBounds(136, 127, 172, 43);
		contentPane.add(lblMehediVai);

		mMc = new JTextField();
		mMc.setBackground(new Color(255, 228, 196));
		mMc.setFont(new Font("Myanmar Text", Font.BOLD, 22));
		mMc.setBounds(345, 136, 138, 37);
		contentPane.add(mMc);
		mMc.setColumns(10);

		mGm = new JTextField();
		mGm.setBackground(new Color(240, 128, 128));
		mGm.setFont(new Font("Myanmar Text", Font.BOLD, 22));
		mGm.setColumns(10);
		mGm.setBounds(546, 136, 138, 37);
		contentPane.add(mGm);

		rMc = new JTextField();
		rMc.setBackground(new Color(255, 228, 196));
		rMc.setFont(new Font("Myanmar Text", Font.BOLD, 22));
		rMc.setColumns(10);
		rMc.setBounds(345, 213, 138, 37);
		contentPane.add(rMc);

		rGm = new JTextField();
		rGm.setBackground(new Color(240, 128, 128));
		rGm.setFont(new Font("Myanmar Text", Font.BOLD, 22));
		rGm.setColumns(10);
		rGm.setBounds(546, 213, 138, 37);
		contentPane.add(rGm);

		aMc = new JTextField();
		aMc.setBackground(new Color(255, 228, 196));
		aMc.setFont(new Font("Myanmar Text", Font.BOLD, 22));
		aMc.setColumns(10);
		aMc.setBounds(345, 286, 138, 37);
		contentPane.add(aMc);

		aGm = new JTextField();
		aGm.setBackground(new Color(240, 128, 128));
		aGm.setFont(new Font("Myanmar Text", Font.BOLD, 22));
		aGm.setColumns(10);
		aGm.setBounds(546, 286, 138, 37);
		contentPane.add(aGm);

		tMc = new JTextField();
		tMc.setBackground(new Color(255, 228, 196));
		tMc.setFont(new Font("Myanmar Text", Font.BOLD, 22));
		tMc.setColumns(10);
		tMc.setBounds(345, 355, 138, 37);
		contentPane.add(tMc);

		tGm = new JTextField();
		tGm.setBackground(new Color(240, 128, 128));
		tGm.setFont(new Font("Myanmar Text", Font.BOLD, 22));
		tGm.setColumns(10);
		tGm.setBounds(546, 355, 138, 37);
		contentPane.add(tGm);

		sMc = new JTextField();
		sMc.setBackground(new Color(255, 228, 196));
		sMc.setFont(new Font("Myanmar Text", Font.BOLD, 22));
		sMc.setColumns(10);
		sMc.setBounds(345, 428, 138, 37);
		contentPane.add(sMc);

		sGm = new JTextField();
		sGm.setBackground(new Color(240, 128, 128));
		sGm.setFont(new Font("Myanmar Text", Font.BOLD, 22));
		sGm.setColumns(10);
		sGm.setBounds(546, 428, 138, 37);
		contentPane.add(sGm);

		JLabel lblRabbiVai = new JLabel("Rabbi vai :");
		lblRabbiVai.setFont(new Font("MV Boli", Font.BOLD, 26));
		lblRabbiVai.setBounds(149, 204, 152, 43);
		contentPane.add(lblRabbiVai);

		JLabel lblAmitVai = new JLabel("Amit vai :");
		lblAmitVai.setFont(new Font("MV Boli", Font.BOLD, 26));
		lblAmitVai.setBounds(159, 286, 152, 43);
		contentPane.add(lblAmitVai);

		JLabel lblTalha = new JLabel("Talha :");
		lblTalha.setFont(new Font("MV Boli", Font.BOLD, 26));
		lblTalha.setBounds(204, 355, 97, 43);
		contentPane.add(lblTalha);

		lblShipu = new JLabel("Shipu :");
		lblShipu.setFont(new Font("MV Boli", Font.BOLD, 26));
		lblShipu.setBounds(207, 422, 128, 43);
		contentPane.add(lblShipu);

		lblEnterGivenMoney = new JLabel("Enter given money and meal count.");
		lblEnterGivenMoney.setFont(new Font("MS UI Gothic", Font.BOLD, 19));
		lblEnterGivenMoney.setBounds(262, 23, 304, 20);
		contentPane.add(lblEnterGivenMoney);

		lblMealCount = new JLabel("Meal count");
		lblMealCount.setForeground(new Color(255, 140, 0));
		lblMealCount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMealCount.setBounds(345, 90, 110, 20);
		contentPane.add(lblMealCount);

		lblGiverMoney = new JLabel("Given money");
		lblGiverMoney.setForeground(new Color(220, 20, 60));
		lblGiverMoney.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGiverMoney.setBounds(545, 90, 110, 20);
		contentPane.add(lblGiverMoney);

		left = new JTextField();
		left.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				left.setText("");
			}
		});
		left.setText("0.0");
		left.setForeground(Color.RED);
		left.setFont(new Font("Times New Roman", Font.BOLD, 30));
		left.setColumns(10);
		left.setBounds(247, 512, 124, 32);
		contentPane.add(left);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean all=false;
				double d=0.0;
				if(checkNum(mMc.getText())&&checkNum(mGm.getText()))all=true;
				else {
					all=false;
					JOptionPane.showMessageDialog(mealRateCalculator.this,"Invalid inpute for Mehedi vai.!!\nInpute again.","Error",JOptionPane.ERROR_MESSAGE);
					mMc.setText("");
					mGm.setText("");
					return;
				}
				if(checkNum(rMc.getText())&&checkNum(rGm.getText()))all=true;
				else {
					all=false;
					JOptionPane.showMessageDialog(mealRateCalculator.this,"Invalid inpute for Rabbii vai.!!\nInpute again.","Error",JOptionPane.ERROR_MESSAGE);
					rMc.setText("");
					rGm.setText("");
					return;
				}
				if(checkNum(aMc.getText())&&checkNum(aGm.getText()))all=true;
				else {
					all=false;
					JOptionPane.showMessageDialog(mealRateCalculator.this,"Invalid inpute for Amit vai.!!\nInpute again.","Error",JOptionPane.ERROR_MESSAGE);
					aMc.setText("");
					aGm.setText("");
					return;
				}
				if(checkNum(tMc.getText())&&checkNum(tGm.getText()))all=true;
				else {
					all=false;
					JOptionPane.showMessageDialog(mealRateCalculator.this,"Invalid inpute for Talha.!!\nInpute again.","Error",JOptionPane.ERROR_MESSAGE);
					tMc.setText("");
					tGm.setText("");
					return;
				}
				if(checkNum(sMc.getText())&&checkNum(sGm.getText()))all = true;
				else {
					all=false;
					JOptionPane.showMessageDialog(mealRateCalculator.this,"Invalid inpute for Shipu.!!\nInpute again.","Error",JOptionPane.ERROR_MESSAGE);
					sMc.setText("");
					sGm.setText("");
					return;
				}
				if(checkl(left.getText())==-1) {
					all=false;
					JOptionPane.showMessageDialog(mealRateCalculator.this,"Invalid inpute for left money.!!\nInpute again.","Error",JOptionPane.ERROR_MESSAGE);
					left.setText("");
					return;
				}
				else d=checkl(left.getText());
				if(all) {
					double []mc = new double[5];
					mm = mc[0] = Double.parseDouble(mMc.getText());
					rm = mc[1] = Double.parseDouble(rMc.getText());
					am = mc[2] = Double.parseDouble(aMc.getText());
					tm = mc[3] = Double.parseDouble(tMc.getText());
					sm = mc[4] = Double.parseDouble(sMc.getText());
					double []gm = new double[5];
					mtk = gm[0] = Double.parseDouble(mGm.getText());
					rtk = gm[1] = Double.parseDouble(rGm.getText());
					atk = gm[2] = Double.parseDouble(aGm.getText());
					ttk = gm[3] = Double.parseDouble(tGm.getText());
					stk = gm[4] = Double.parseDouble(sGm.getText());

					result(mc,gm,d);
				}

			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 36));
		btnSubmit.setBounds(715, 256, 152, 67);
		contentPane.add(btnSubmit);

		lblMoneyLeft = new JLabel("Money left :");
		lblMoneyLeft.setFont(new Font("MV Boli", Font.BOLD, 26));
		lblMoneyLeft.setBounds(70, 507, 177, 43);
		contentPane.add(lblMoneyLeft);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		btnExit.setBounds(729, 511, 97, 37);
		contentPane.add(btnExit);
		
		JButton btnClr = new JButton("Clear");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mMc.setText("");
				mGm.setText("");
				rMc.setText("");
				rGm.setText("");
				aMc.setText("");
				aGm.setText("");
				tMc.setText("");
				tGm.setText("");
				sMc.setText("");
				sGm.setText("");				
			}
		});
		btnClr.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnClr.setBounds(484, 511, 128, 37);
		contentPane.add(btnClr);
	}

	protected boolean checkNum(String s) {
		try {
			double d = Double.parseDouble(s);
			if(d<0)return false;
		}catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
	protected double checkl(String s) {
		if(s.equals("")) return 0.0;
		else {
			double d=0.0;
			try {
				d=Double.parseDouble(s);
				if(d<0)return -1;
			}catch(NumberFormatException e) {
				return -1;
			}
			return d;
		}
	}
	
	void result(double[]mc,double[]gm, double left) {
		setTitle("Meal rate calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 904, 627);
		setLocationRelativeTo(null);
		panel = new JPanel();
		panel.setForeground(Color.RED);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);

		JLabel lblMehediVai1 = new JLabel("Mehedi vai ");
		lblMehediVai1.setFont(new Font("NewsGoth Cn BT", Font.BOLD, 26));
		lblMehediVai1.setBounds(23, 174, 142, 34);
		panel.add(lblMehediVai1);

		JLabel lblRaabbiVai = new JLabel("Rabbi vai ");
		lblRaabbiVai.setFont(new Font("NewsGoth Cn BT", Font.BOLD, 26));
		lblRaabbiVai.setBounds(38, 241, 124, 34);
		panel.add(lblRaabbiVai);

		JLabel lblAmitVai = new JLabel("Amit vai ");
		lblAmitVai.setFont(new Font("NewsGoth Cn BT", Font.BOLD, 26));
		lblAmitVai.setBounds(50, 303, 109, 34);
		panel.add(lblAmitVai);

		JLabel lblTalha = new JLabel("Talha");
		lblTalha.setFont(new Font("NewsGoth Cn BT", Font.BOLD, 26));
		lblTalha.setBounds(67, 365, 69, 34);
		panel.add(lblTalha);

		JLabel lblShipu = new JLabel("Shipu");
		lblShipu.setFont(new Font("NewsGoth Cn BT", Font.BOLD, 26));
		lblShipu.setBounds(67, 428, 73, 34);
		panel.add(lblShipu);

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
		lblNewLabel.setBounds(479, 45, 163, 61);
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

		tt = new JTextField();
		tt.setEditable(false);
		tt.setText("");
		tt.setFont(new Font("Times New Roman", Font.BOLD, 30));
		tt.setColumns(10);
		tt.setBackground(new Color(245, 222, 179));
		tt.setBounds(167, 364, 64, 32);
		panel.add(tt);

		tgm = new JTextField();
		tgm.setBackground(Color.WHITE);
		tgm.setEditable(false);
		tgm.setText("");
		tgm.setFont(new Font("Times New Roman", Font.BOLD, 30));
		tgm.setColumns(10);
		tgm.setBounds(264, 365, 124, 32);
		panel.add(tgm);

		tco = new JTextField();
		tco.setEditable(false);
		tco.setText("");
		tco.setFont(new Font("Times New Roman", Font.BOLD, 30));
		tco.setColumns(10);
		tco.setBackground(new Color(255, 160, 122));
		tco.setBounds(420, 365, 119, 32);
		panel.add(tco);

		JTextField tg = new JTextField();
		tg.setEditable(false);
		tg.setText("");
		tg.setFont(new Font("Times New Roman", Font.BOLD, 30));
		tg.setColumns(10);
		tg.setBackground(new Color(152, 251, 152));
		tg.setBounds(563, 365, 124, 32);
		panel.add(tg);

		tr = new JTextField();
		tr.setEditable(false);
		tr.setText("");
		tr.setForeground(Color.BLACK);
		tr.setFont(new Font("Times New Roman", Font.BOLD, 30));
		tr.setColumns(10);
		tr.setBackground(Color.RED);
		tr.setBounds(714, 365, 124, 32);
		panel.add(tr);

		st = new JTextField();
		st.setEditable(false);
		st.setText("");
		st.setFont(new Font("Times New Roman", Font.BOLD, 30));
		st.setColumns(10);
		st.setBackground(new Color(245, 222, 179));
		st.setBounds(167, 428, 64, 32);
		panel.add(st);

		sgm = new JTextField();
		sgm.setBackground(Color.WHITE);
		sgm.setEditable(false);
		sgm.setText("");
		sgm.setFont(new Font("Times New Roman", Font.BOLD, 30));
		sgm.setColumns(10);
		sgm.setBounds(264, 428, 124, 32);
		panel.add(sgm);

		sco = new JTextField();
		sco.setEditable(false);
		sco.setText("");
		sco.setFont(new Font("Times New Roman", Font.BOLD, 30));
		sco.setColumns(10);
		sco.setBackground(new Color(255, 160, 122));
		sco.setBounds(420, 428, 119, 32);
		panel.add(sco);

		sg = new JTextField();
		sg.setEditable(false);
		sg.setText("");
		sg.setFont(new Font("Times New Roman", Font.BOLD, 30));
		sg.setColumns(10);
		sg.setBackground(new Color(152, 251, 152));
		sg.setBounds(563, 428, 124, 32);
		panel.add(sg);

		sr = new JTextField();
		sr.setEditable(false);
		sr.setText("");
		sr.setForeground(Color.BLACK);
		sr.setFont(new Font("Times New Roman", Font.BOLD, 30));
		sr.setColumns(10);
		sr.setBackground(Color.RED);
		sr.setBounds(714, 428, 124, 32);
		panel.add(sr);

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
		lblTotalShort.setBounds(85, 490, 184, 32);
		panel.add(lblTotalShort);

		tReturn = new JTextField();
		tReturn.setEditable(false);
		tReturn.setForeground(Color.RED);
		tReturn.setText("");
		tReturn.setFont(new Font("Times New Roman", Font.BOLD, 30));
		tReturn.setColumns(10);
		tReturn.setBounds(279, 489, 124, 32);
		panel.add(tReturn);

		JLabel lblTotalShortage = new JLabel("Total shortage:");
		lblTotalShortage.setToolTipText("To equalize, add left money with total shortage");
		lblTotalShortage.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 26));
		lblTotalShortage.setBounds(57, 533, 212, 32);
		panel.add(lblTotalShortage);

		tShort = new JTextField();
		tShort.setToolTipText("To equalize, add left money with total shortage");
		tShort.setEditable(false);
		tShort.setForeground(new Color(255, 0, 0));
		tShort.setText("");
		tShort.setFont(new Font("Times New Roman", Font.BOLD, 30));
		tShort.setColumns(10);
		tShort.setBounds(279, 532, 124, 32);
		panel.add(tShort);
		
		mRate = new JTextField();
		mRate.setForeground(new Color(255, 0, 0));
		mRate.setEditable(false);
		mRate.setText("52.34");
		mRate.setFont(new Font("Tahoma", Font.PLAIN, 65));
		mRate.setBounds(626, 31, 212, 85);
		panel.add(mRate);
		mRate.setColumns(10);

		double rate = 0,tTk = 0,tM = 0,ret = 0,sh = 0;
		double[] tk = new double[mc.length];
		double[] give = new double[mc.length];
		double[] take = new double[mc.length];
		for(int i = 0; i<mc.length; i++) {
			tTk += gm[i];
			tM += mc[i];
		}
		tTk -= left;
		rate = (int)((tTk/tM) * 100) / 100.0;
		for(int i = 0; i<mc.length; i++) {
			tk[i] = (int)((rate*mc[i]) * 100) / 100.0;
			if( tk[i]>gm[i]) {
				give[i] = (int)((tk[i]-gm[i]) * 100) / 100.0;
				take[i] = 0.0;
				sh += (int)((give[i] * 100) / 100.0);
			}
			else if(tk[i]<gm[i]) {
				give[i] = 0.0;
				take[i] = (int)((gm[i]-tk[i]) * 100) / 100.0;
				ret += (int)((take[i] * 100) / 100.0);
			}
			else {
				give[i] = 0.0;
				take[i] = 0.0;	
			}
		}
		mRate.setText(Double.toString(rate));
		tMeal.setText(Double.toString(tM));
		totalTk.setText(Double.toString(tTk));
		tReturn.setText(Double.toString(ret));
		tShort.setText(Double.toString(sh));
		//Mehedi vai
		mt.setText(Double.toString(mc[0]));
		mgm.setText(Double.toString(gm[0]));
		mco.setText(Double.toString(tk[0]));
		mg.setText(Double.toString(give[0]));
		mr.setText(Double.toString(take[0]));

		//Rabbi vai
		rt.setText(Double.toString(mc[1]));
		rgm.setText(Double.toString(gm[1]));
		rco.setText(Double.toString(tk[1]));
		rg.setText(Double.toString(give[1]));
		rr.setText(Double.toString(take[1]));
		
		//Amit vai
		at.setText(Double.toString(mc[2]));
		agm.setText(Double.toString(gm[2]));
		aco.setText(Double.toString(tk[2]));
		ag.setText(Double.toString(give[2]));
		ar.setText(Double.toString(take[2]));

		//Talha
		tt.setText(Double.toString(mc[3]));
		tgm.setText(Double.toString(gm[3]));
		tco.setText(Double.toString(tk[3]));
		tg.setText(Double.toString(give[3]));
		tr.setText(Double.toString(take[3]));
	
		//Shipu
		st.setText(Double.toString(mc[4]));
		sgm.setText(Double.toString(gm[4]));
		sco.setText(Double.toString(tk[4]));
		sg.setText(Double.toString(give[4]));
		sr.setText(Double.toString(take[4]));
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mealRateCalculator m = new mealRateCalculator();
				dispose();
				m.setVisible(true);				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.setBounds(709, 535, 92, 31);
		panel.add(btnNewButton);
		
		JLabel lblWithoutLeftMoney = new JLabel("(Without left money)");
		lblWithoutLeftMoney.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblWithoutLeftMoney.setBounds(289, 566, 98, 13);
		panel.add(lblWithoutLeftMoney);
	}
}

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

import javax.swing.border.*;

public class GUI extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField input;
	public final static Color lightBrown = Color.decode("#CAA35F");
	public final static Color teal = Color.decode("#A1D7BB");
	public final static Color lightGreen = Color.decode("#51B67D");
	public final static Color aqua = Color.decode("#19EBBA");
	public final static Color lightBlue = Color.decode("#00A9BC");
	public final static Color lightOrange = Color.decode("#F2B86D");
	public final static Color lightPink = Color.decode("#DF99BC");
	public final static Color darkRed = Color.decode("#990000");
	public final static String metalloid = "Metalloid";
	public final static String nonmetal = "Non-metal";
	public final static String halogen = "Halogen";
	public final static String nobleGas = "Noble Gas";
	public final static String lanth = "Lanthanoid";
	public final static String actin = "Actinoid";
	public final static String alk = "Alkali Metal";
	public final static String alkearth = "Alkaline Earth Metal";
	public final static String trans = "Transition Metal";
	public final static String pTrans = "Post-transition metal";
	public final static Color INDIGO = Color.decode("#8A2BE2");
	public final static Color VIOLET = Color.decode("#C77DF3");
	private JLabel message;
	List<Color> numColors = new ArrayList<>();
	

	public GUI() {
		super(Driver.screen.getUserName() + "'s Periodic Table Of Elements (Credits to ptable.com) © SJCRV Coders 2015");

		setLayout(new GridLayout(17, 18));
		
		message = new JLabel();

		makeNums();
		makeRowEight();
		makeRowOne();
		makeRowTwo();
		makeRowThree();
		makeRowFour();
		makeRowFive();
		makeRowSix();
		makeRowSeven();
		makeRowEight();
		makeRowNine();
		makeRowTen();
		makeRowEight();
		makeRowEight();
		blankSpace();
		makeRowEight();
		makeRowEight();
	}

	public void makeNums(){
		numColors.add(Color.RED);
		numColors.add(Color.ORANGE);
		numColors.add(Color.YELLOW);
		numColors.add(Color.GREEN);
		numColors.add(Color.BLUE);
		numColors.add(INDIGO);
		numColors.add(VIOLET);
		numColors.add(Color.CYAN);
		numColors.add(Color.PINK);
		numColors.add(Color.MAGENTA);
		int counter = 0;
		for(int i = 0; i < 18;i++){
			if (i > 3 && i < 14){
				JButton num = new JButton(Integer.toString(counter));
				num.setToolTipText(Integer.toString(counter));
				num.setOpaque(true);
				num.setBorderPainted(false);
				num.setBackground(numColors.get(counter));
				add(num);
				num.setActionCommand(Integer.toString(counter));
				num.addActionListener(this);
				counter++;
			}else{
				add(new JLabel());
			}
		}
	}
	public void blankSpace() {
		for (int i = 0; i < 8; i++) {
			add(new JLabel());
		}
		JLabel label = new JLabel("Enter: ");
		label.setForeground(Color.WHITE);
		add(label);

		input = new JTextField(100);
		input.addActionListener(this);
		add(input);
		for (int j = 0; j < 6; j++) {
			add(new JLabel());
		}
	}

	public void makeRowOne() {
		JButton hydrogen = new JButton("H");
		hydrogen.setOpaque(true);
		hydrogen.setBorderPainted(false);
		hydrogen.setBackground(Color.GREEN);
		hydrogen.setToolTipText("Hydrogen");
		hydrogen.setActionCommand("H");
		hydrogen.addActionListener(this);

		JButton helium = new JButton("He");
		helium.setOpaque(true);
		helium.setBorderPainted(false);
		helium.setBackground(lightBlue);
		helium.setToolTipText(nobleGas);
		helium.setActionCommand("He");
		helium.addActionListener(this);
		
		for (int a = 0; a < 18; a++) {
			if (a == 0) {
				add(hydrogen);
			} else if (a == 17) {
				add(helium);
			} else {
				add(new JLabel());
			}
			
		}
	}

	public void makeRowTwo() {
		JButton lithium = new JButton("Li");
		lithium.setOpaque(true);
		lithium.setBorderPainted(false);
		lithium.setBorder(new LineBorder(Color.RED, 12));
		lithium.setBackground(Color.ORANGE);
		lithium.setToolTipText(alk);
		lithium.setActionCommand("Li");
		lithium.addActionListener(this);

		JButton beryllium = new JButton("Be");
		beryllium.setOpaque(true);
		beryllium.setBorderPainted(false);
		beryllium.setBackground(Color.YELLOW);
		beryllium.setToolTipText(alkearth);
		beryllium.setActionCommand("Be");
		beryllium.addActionListener(this);

		JButton boron = new JButton("B");
		boron.setOpaque(true);
		boron.setBorderPainted(false);
		boron.setBackground(lightGreen);
		boron.setToolTipText(metalloid);
		boron.setActionCommand("B");
		boron.addActionListener(this);

		JButton carbon = new JButton("C");
		carbon.setOpaque(true);
		carbon.setBorderPainted(false);
		carbon.setBackground(Color.GREEN);
		carbon.setToolTipText(nonmetal);
		carbon.setActionCommand("C");
		carbon.addActionListener(this);

		JButton nitrogen = new JButton("N");
		nitrogen.setOpaque(true);
		nitrogen.setBorderPainted(false);
		nitrogen.setBackground(Color.GREEN);
		nitrogen.setToolTipText(nonmetal);
		nitrogen.setActionCommand("N");
		nitrogen.addActionListener(this);

		JButton oxygen = new JButton("O");
		oxygen.setOpaque(true);
		oxygen.setBorderPainted(false);
		oxygen.setBackground(Color.GREEN);
		oxygen.setToolTipText(nonmetal);
		oxygen.setActionCommand("O");
		oxygen.addActionListener(this);

		JButton fluorine = new JButton("F");
		fluorine.setOpaque(true);
		fluorine.setBorderPainted(false);
		fluorine.setBackground(aqua);
		fluorine.setToolTipText(halogen);
		fluorine.setActionCommand("F");
		fluorine.addActionListener(this);

		JButton neon = new JButton("Ne");
		neon.setOpaque(true);
		neon.setBorderPainted(false);
		neon.setBackground(lightBlue);
		neon.setToolTipText(nobleGas);
		neon.setActionCommand("Ne");
		neon.addActionListener(this);

		for (int a = 0; a < 18; a++) {
			if (a == 0) {
				add(lithium);
			} else if (a == 1) {
				add(beryllium);
			} else if (a == 12) {
				add(boron);
			} else if (a == 13) {
				add(carbon);
			} else if (a == 14) {
				add(nitrogen);
			} else if (a == 15) {
				add(oxygen);
			} else if (a == 16) {
				add(fluorine);
			} else if (a == 17) {
				add(neon);
			} else {
				JLabel label = new JLabel();
				add(label);
			}
		}
	}

	public void makeRowThree() {
		JButton sodium = new JButton("Na");
		sodium.setOpaque(true);
		sodium.setBorderPainted(false);
		sodium.setBackground(Color.ORANGE);
		sodium.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
		sodium.setToolTipText(alk);
		sodium.setActionCommand("Na");
		sodium.addActionListener(this);

		JButton magnesium = new JButton("Mg");
		magnesium.setOpaque(true);
		magnesium.setBorderPainted(false);
		magnesium.setBackground(Color.YELLOW);
		magnesium.setToolTipText(alkearth);
		magnesium.setActionCommand("Mg");
		magnesium.addActionListener(this);

		JButton aluminum = new JButton("Al");
		aluminum.setOpaque(true);
		aluminum.setBorderPainted(false);
		aluminum.setBackground(teal);
		aluminum.setToolTipText(pTrans);
		aluminum.setActionCommand("Al");
		aluminum.addActionListener(this);

		JButton silicon = new JButton("Si");
		silicon.setOpaque(true);
		silicon.setBorderPainted(false);
		silicon.setBackground(lightGreen);
		silicon.setToolTipText(metalloid);
		silicon.setActionCommand("Si");
		silicon.addActionListener(this);

		JButton phosphorus = new JButton("P");
		phosphorus.setOpaque(true);
		phosphorus.setBorderPainted(false);
		phosphorus.setBackground(Color.GREEN);
		phosphorus.setToolTipText(nonmetal);
		phosphorus.setActionCommand("P");
		phosphorus.addActionListener(this);

		JButton sulfur = new JButton("S");
		sulfur.setOpaque(true);
		sulfur.setBorderPainted(false);
		sulfur.setBackground(Color.GREEN);
		sulfur.setToolTipText(nonmetal);
		sulfur.setActionCommand("S");
		sulfur.addActionListener(this);

		JButton chlorine = new JButton("Cl");
		chlorine.setOpaque(true);
		chlorine.setBorderPainted(false);
		chlorine.setBackground(aqua);
		chlorine.setToolTipText(halogen);
		chlorine.setActionCommand("Cl");
		chlorine.addActionListener(this);

		JButton argon = new JButton("Ar");
		argon.setOpaque(true);
		argon.setBorderPainted(false);
		argon.setBackground(lightBlue);
		argon.setToolTipText(nobleGas);
		argon.setActionCommand("Ar");
		argon.addActionListener(this);

		for (int a = 0; a < 18; a++) {
			if (a == 0) {
				add(sodium);
			} else if (a == 1) {
				add(magnesium);
			} else if (a == 12) {
				add(aluminum);
			} else if (a == 13) {
				add(silicon);
			} else if (a == 14) {
				add(phosphorus);
			} else if (a == 15) {
				add(sulfur);
			} else if (a == 16) {
				add(chlorine);
			} else if (a == 17) {
				add(argon);
			} else {
				JLabel label = new JLabel();
				add(label);
			}
		}
	}

	public void makeRowFour() {
		JButton potassium = new JButton("K");
		potassium.setOpaque(true);
		potassium.setBorderPainted(false);
		potassium.setBackground(Color.ORANGE);
		potassium.setToolTipText(alk);
		potassium.setActionCommand("K");
		potassium.addActionListener(this);

		JButton calcium = new JButton("Ca");
		calcium.setOpaque(true);
		calcium.setBorderPainted(false);
		calcium.setBackground(Color.YELLOW);
		calcium.setToolTipText(alkearth);
		calcium.setActionCommand("Ca");
		calcium.addActionListener(this);

		JButton scandium = new JButton("Sc");
		scandium.setOpaque(true);
		scandium.setBorderPainted(false);
		scandium.setBackground(lightBrown);
		scandium.setToolTipText(trans);
		scandium.setActionCommand("Sc");
		scandium.addActionListener(this);

		JButton titanium = new JButton("Ti");
		titanium.setOpaque(true);
		titanium.setBorderPainted(false);
		titanium.setBackground(lightBrown);
		titanium.setToolTipText(trans);
		titanium.setActionCommand("Ti");
		titanium.addActionListener(this);

		JButton vanadium = new JButton("V");
		vanadium.setOpaque(true);
		vanadium.setBorderPainted(false);
		vanadium.setBackground(lightBrown);
		vanadium.setToolTipText(trans);
		vanadium.setActionCommand("V");
		vanadium.addActionListener(this);

		JButton chromium = new JButton("Cr");
		chromium.setOpaque(true);
		chromium.setBorderPainted(false);
		chromium.setBackground(lightBrown);
		chromium.setToolTipText(trans);
		chromium.setActionCommand("Cr");
		chromium.addActionListener(this);

		JButton manganese = new JButton("Mn");
		manganese.setOpaque(true);
		manganese.setBorderPainted(false);
		manganese.setBackground(lightBrown);
		manganese.setToolTipText(trans);
		manganese.setActionCommand("Mn");
		manganese.addActionListener(this);

		JButton iron = new JButton("Fe");
		iron.setOpaque(true);
		iron.setBorderPainted(false);
		iron.setBackground(lightBrown);
		iron.setToolTipText(trans);
		iron.setActionCommand("Fe");
		iron.addActionListener(this);

		JButton cobalt = new JButton("Co");
		cobalt.setOpaque(true);
		cobalt.setBorderPainted(false);
		cobalt.setBackground(lightBrown);
		cobalt.setToolTipText(trans);
		cobalt.setActionCommand("Co");
		cobalt.addActionListener(this);

		JButton nickel = new JButton("Ni");
		nickel.setOpaque(true);
		nickel.setBorderPainted(false);
		nickel.setBackground(lightBrown);
		nickel.setToolTipText(trans);
		nickel.setActionCommand("Ni");
		nickel.addActionListener(this);

		JButton copper = new JButton("Cu");
		copper.setOpaque(true);
		copper.setBorderPainted(false);
		copper.setBackground(lightBrown);
		copper.setToolTipText(trans);
		copper.setActionCommand("Cu");
		copper.addActionListener(this);

		JButton zinc = new JButton("Zn");
		zinc.setOpaque(true);
		zinc.setBorderPainted(false);
		zinc.setBackground(lightBrown);
		zinc.setToolTipText(trans);
		zinc.setActionCommand("Zn");
		zinc.addActionListener(this);

		JButton gallium = new JButton("Ga");
		gallium.setOpaque(true);
		gallium.setBorderPainted(false);
		gallium.setBackground(teal);
		gallium.setToolTipText(pTrans);
		gallium.setActionCommand("Ga");
		gallium.addActionListener(this);

		JButton germanium = new JButton("Ge");
		germanium.setOpaque(true);
		germanium.setBorderPainted(false);
		germanium.setBackground(lightGreen);
		germanium.setToolTipText(metalloid);
		germanium.setActionCommand("Ge");
		germanium.addActionListener(this);

		JButton arsenic = new JButton("As");
		arsenic.setOpaque(true);
		arsenic.setBorderPainted(false);
		arsenic.setBackground(lightGreen);
		arsenic.setToolTipText(metalloid);
		arsenic.setActionCommand("As");
		arsenic.addActionListener(this);

		JButton selenium = new JButton("Se");
		selenium.setOpaque(true);
		selenium.setBorderPainted(false);
		selenium.setBackground(Color.GREEN);
		selenium.setToolTipText(nonmetal);
		selenium.setActionCommand("Se");
		selenium.addActionListener(this);

		JButton bromine = new JButton("Br");
		bromine.setOpaque(true);
		bromine.setBorderPainted(false);
		bromine.setBackground(aqua);
		bromine.setToolTipText(halogen);
		bromine.setActionCommand("Br");
		bromine.addActionListener(this);

		JButton krypton = new JButton("Kr");
		krypton.setOpaque(true);
		krypton.setBorderPainted(false);
		krypton.setBackground(lightBlue);
		krypton.setToolTipText(nobleGas);
		krypton.setActionCommand("Kr");
		krypton.addActionListener(this);

		for (int a = 0; a < 18; a++) {
			if (a == 0) {
				add(potassium);
			} else if (a == 1) {
				add(calcium);
			} else if (a == 2) {
				add(scandium);
			} else if (a == 3) {
				add(titanium);
			} else if (a == 4) {
				add(vanadium);
			} else if (a == 5) {
				add(chromium);
			} else if (a == 6) {
				add(manganese);
			} else if (a == 7) {
				add(iron);
			} else if (a == 8) {
				add(cobalt);
			} else if (a == 9) {
				add(nickel);
			} else if (a == 10) {
				add(copper);
			} else if (a == 11) {
				add(zinc);
			} else if (a == 12) {
				add(gallium);
			} else if (a == 13) {
				add(germanium);
			} else if (a == 14) {
				add(arsenic);
			} else if (a == 15) {
				add(selenium);
			} else if (a == 16) {
				add(bromine);
			} else if (a == 17) {
				add(krypton);
			}
		}
	}

	public void makeRowFive() {
		List<JButton> rowFive = new ArrayList<>();
		JButton rb = new JButton("Rb");
		rb.setOpaque(true);
		rb.setBorderPainted(false);
		rb.setBackground(Color.ORANGE);
		rb.setToolTipText(alk);
		rb.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
		rb.setActionCommand("Rb");
		rb.addActionListener(this);

		JButton sr = new JButton("Sr");
		sr.setOpaque(true);
		sr.setBorderPainted(false);
		sr.setBackground(Color.YELLOW);
		sr.setToolTipText(alkearth);
		sr.setActionCommand("Sr");
		sr.addActionListener(this);

		JButton y = new JButton("Y");
		y.setOpaque(true);
		y.setBorderPainted(false);
		y.setBackground(lightBrown);
		y.setToolTipText(trans);
		y.setActionCommand("Y");
		y.addActionListener(this);

		JButton zr = new JButton("Zr");
		zr.setOpaque(true);
		zr.setBorderPainted(false);
		zr.setBackground(lightBrown);
		zr.setToolTipText(trans);
		zr.setActionCommand("Zr");
		zr.addActionListener(this);

		JButton nb = new JButton("Nb");
		nb.setOpaque(true);
		nb.setBorderPainted(false);
		nb.setBackground(lightBrown);
		nb.setToolTipText(trans);
		nb.setActionCommand("Nb");
		nb.addActionListener(this);

		JButton mo = new JButton("Mo");
		mo.setOpaque(true);
		mo.setBorderPainted(false);
		mo.setBackground(lightBrown);
		mo.setToolTipText(trans);
		mo.setActionCommand("Mo");
		mo.addActionListener(this);

		JButton tc = new JButton("Tc");
		tc.setOpaque(true);
		tc.setBorderPainted(false);
		tc.setBackground(lightBrown);
		tc.setToolTipText(trans);
		tc.setActionCommand("Tc");
		tc.addActionListener(this);

		JButton ru = new JButton("Ru");
		ru.setOpaque(true);
		ru.setBorderPainted(false);
		ru.setBackground(lightBrown);
		ru.setToolTipText(trans);
		ru.setActionCommand("Ru");
		ru.addActionListener(this);

		JButton rh = new JButton("Rh");
		rh.setOpaque(true);
		rh.setBorderPainted(false);
		rh.setBackground(lightBrown);
		rh.setToolTipText(trans);
		rh.setActionCommand("Rh");
		rh.addActionListener(this);

		JButton pd = new JButton("Pd");
		pd.setOpaque(true);
		pd.setBorderPainted(false);
		pd.setBackground(lightBrown);
		pd.setToolTipText(trans);
		pd.setActionCommand("Pd");
		pd.addActionListener(this);

		JButton ag = new JButton("Ag");
		ag.setOpaque(true);
		ag.setBorderPainted(false);
		ag.setBackground(lightBrown);
		ag.setToolTipText(trans);
		ag.setActionCommand("Ag");
		ag.addActionListener(this);

		JButton cd = new JButton("Cd");
		cd.setOpaque(true);
		cd.setBorderPainted(false);
		cd.setBackground(lightBrown);
		cd.setToolTipText(trans);
		cd.setActionCommand("Cd");
		cd.addActionListener(this);

		JButton in = new JButton("In");
		in.setOpaque(true);
		in.setBorderPainted(false);
		in.setBackground(teal);
		in.setToolTipText(pTrans);
		in.setActionCommand("In");
		in.addActionListener(this);

		JButton sn = new JButton("Sn");
		sn.setOpaque(true);
		sn.setBorderPainted(false);
		sn.setBackground(teal);
		sn.setToolTipText(pTrans);
		sn.setActionCommand("Sn");
		sn.addActionListener(this);

		JButton sb = new JButton("Sb");
		sb.setOpaque(true);
		sb.setBorderPainted(false);
		sb.setBackground(lightGreen);
		sb.setToolTipText(metalloid);
		sb.setActionCommand("Sb");
		sb.addActionListener(this);

		JButton te = new JButton("Te");
		te.setOpaque(true);
		te.setBorderPainted(false);
		te.setBackground(lightGreen);
		te.setToolTipText(metalloid);
		te.setActionCommand("Te");
		te.addActionListener(this);

		JButton i = new JButton("I");
		i.setOpaque(true);
		i.setBorderPainted(false);
		i.setBackground(aqua);
		i.setToolTipText(halogen);
		i.setActionCommand("I");
		i.addActionListener(this);

		JButton xe = new JButton("Xe");
		xe.setOpaque(true);
		xe.setBorderPainted(false);
		xe.setBackground(lightBlue);
		xe.setToolTipText(nobleGas);
		xe.setActionCommand("Xe");
		xe.addActionListener(this);

		rowFive.add(rb);
		rowFive.add(sr);
		rowFive.add(y);
		rowFive.add(zr);
		rowFive.add(nb);
		rowFive.add(mo);
		rowFive.add(tc);
		rowFive.add(ru);
		rowFive.add(rh);
		rowFive.add(pd);
		rowFive.add(ag);
		rowFive.add(cd);
		rowFive.add(in);
		rowFive.add(sn);
		rowFive.add(sb);
		rowFive.add(te);
		rowFive.add(i);
		rowFive.add(xe);
		for (int a = 0; a < rowFive.size(); a++) {
			add(rowFive.get(a));
		}

	}

	public void makeRowSix() {
		JButton cs = new JButton("Cs");
		cs.setOpaque(true);
		cs.setBorderPainted(false);
		cs.setBackground(Color.ORANGE);
		cs.setToolTipText(alk);
		cs.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
		cs.setActionCommand("Cs");
		cs.addActionListener(this);

		JButton ba = new JButton("Ba");
		ba.setOpaque(true);
		ba.setBorderPainted(false);
		ba.setBackground(Color.YELLOW);
		ba.setToolTipText(alkearth);
		ba.setActionCommand("Ba");
		ba.addActionListener(this);

		JButton hf = new JButton("Hf");
		hf.setOpaque(true);
		hf.setBorderPainted(false);
		hf.setBackground(lightBrown);
		hf.setToolTipText(trans);
		hf.setActionCommand("Hf");
		hf.addActionListener(this);

		JButton ta = new JButton("Ta");
		ta.setOpaque(true);
		ta.setBorderPainted(false);
		ta.setBackground(lightBrown);
		ta.setToolTipText(trans);
		ta.setActionCommand("Ta");
		ta.addActionListener(this);

		JButton w = new JButton("W");
		w.setOpaque(true);
		w.setBorderPainted(false);
		w.setBackground(lightBrown);
		w.setToolTipText(trans);
		w.setActionCommand("W");
		w.addActionListener(this);

		JButton re = new JButton("Re");
		re.setOpaque(true);
		re.setBorderPainted(false);
		re.setBackground(lightBrown);
		re.setToolTipText(trans);
		re.setActionCommand("Re");
		re.addActionListener(this);

		JButton os = new JButton("Os");
		os.setOpaque(true);
		os.setBorderPainted(false);
		os.setBackground(lightBrown);
		os.setToolTipText(trans);
		os.setActionCommand("Os");
		os.addActionListener(this);

		JButton ir = new JButton("Ir");
		ir.setOpaque(true);
		ir.setBorderPainted(false);
		ir.setBackground(lightBrown);
		ir.setToolTipText(trans);
		ir.setActionCommand("Cs");
		ir.addActionListener(this);

		JButton pt = new JButton("Pt");
		pt.setOpaque(true);
		pt.setBorderPainted(false);
		pt.setBackground(lightBrown);
		pt.setToolTipText(trans);
		pt.setActionCommand("Pt");
		pt.addActionListener(this);

		JButton au = new JButton("Au");
		au.setOpaque(true);
		au.setBorderPainted(false);
		au.setBackground(lightBrown);
		au.setToolTipText(trans);
		au.setActionCommand("Au");
		au.addActionListener(this);

		JButton hg = new JButton("Hg");
		hg.setOpaque(true);
		hg.setBorderPainted(false);
		hg.setBackground(lightBrown);
		hg.setToolTipText(trans);
		hg.setActionCommand("Hg");
		hg.addActionListener(this);

		JButton ti = new JButton("TI");
		ti.setOpaque(true);
		ti.setBorderPainted(false);
		ti.setBackground(teal);
		ti.setToolTipText(pTrans);
		ti.setActionCommand("TI");
		ti.addActionListener(this);

		JButton pb = new JButton("Pb");
		pb.setOpaque(true);
		pb.setBorderPainted(false);
		pb.setBackground(teal);
		pb.setToolTipText(pTrans);
		pb.setActionCommand("Pb");
		pb.addActionListener(this);

		JButton bi = new JButton("Bi");
		bi.setOpaque(true);
		bi.setBorderPainted(false);
		bi.setBackground(teal);
		bi.setToolTipText(pTrans);
		bi.setActionCommand("Bi");
		bi.addActionListener(this);

		JButton po = new JButton("Po");
		po.setOpaque(true);
		po.setBorderPainted(false);
		po.setBackground(lightGreen);
		po.setToolTipText(metalloid);
		po.setActionCommand("Po");
		po.addActionListener(this);

		JButton at = new JButton("At");
		at.setOpaque(true);
		at.setBorderPainted(false);
		at.setBackground(aqua);
		at.setToolTipText(halogen);
		at.setActionCommand("At");
		at.addActionListener(this);

		JButton rn = new JButton("Rn");
		rn.setOpaque(true);
		rn.setBorderPainted(false);
		rn.setBackground(lightBlue);
		rn.setToolTipText(nobleGas);
		rn.setActionCommand("Rn");
		rn.addActionListener(this);

		for (int a = 0; a < 18; a++) {
			if (a == 0) {
				add(cs);
			} else if (a == 1) {
				add(ba);
			} else if (a == 2) {
				JButton butt = new JButton("57 - 71");
				butt.setToolTipText("Lanthanides");
				add(butt);
			} else if (a == 3) {
				add(hf);
			} else if (a == 4) {
				add(ta);
			} else if (a == 5) {
				add(w);
			} else if (a == 6) {
				add(re);
			} else if (a == 7) {
				add(os);
			} else if (a == 8) {
				add(ir);
			} else if (a == 9) {
				add(pt);
			} else if (a == 10) {
				add(au);
			} else if (a == 11) {
				add(hg);
			} else if (a == 12) {
				add(ti);
			} else if (a == 13) {
				add(pb);
			} else if (a == 14) {
				add(bi);
			} else if (a == 15) {
				add(po);
			} else if (a == 16) {
				add(at);
			} else if (a == 17) {
				add(rn);
			}
		}
	}

	public void makeRowSeven() {
		List<JButton> rowSeven = new ArrayList<>();

		JButton fr = new JButton("Fr");
		fr.setOpaque(true);
		fr.setBorderPainted(false);
		fr.setBackground(Color.ORANGE);
		fr.setToolTipText(alk);
		fr.setActionCommand("Fr");
		fr.addActionListener(this);
		rowSeven.add(fr);

		JButton ra = new JButton("Ra");
		ra.setOpaque(true);
		ra.setBorderPainted(false);
		ra.setBackground(Color.YELLOW);
		ra.setToolTipText(alkearth);
		ra.setActionCommand("Ra");
		ra.addActionListener(this);
		rowSeven.add(ra);

		JButton butt = new JButton("89 - 103");
		butt.setToolTipText("Actinoids");
		rowSeven.add(butt);

		JButton rf = new JButton("Rf");
		rf.setActionCommand("Rf");
		rf.setOpaque(true);
		rf.setBorderPainted(false);
		rf.setBackground(lightBrown);
		rf.setToolTipText(trans);
		rf.addActionListener(this);
		rowSeven.add(rf);

		JButton db = new JButton("Db");
		db.setOpaque(true);
		db.setBorderPainted(false);
		db.setBackground(lightBrown);
		db.setToolTipText(trans);
		db.setActionCommand("Db");
		db.addActionListener(this);
		rowSeven.add(db);

		JButton sg = new JButton("Sg");
		sg.setOpaque(true);
		sg.setBorderPainted(false);
		sg.setBackground(lightBrown);
		sg.setToolTipText(trans);
		sg.setActionCommand("Sg");
		sg.addActionListener(this);
		rowSeven.add(sg);

		JButton bh = new JButton("Bh");
		bh.setOpaque(true);
		bh.setBorderPainted(false);
		bh.setBackground(lightBrown);
		bh.setToolTipText(trans);
		bh.setActionCommand("Bh");
		bh.addActionListener(this);
		rowSeven.add(bh);

		JButton hs = new JButton("Hs");
		hs.setOpaque(true);
		hs.setBorderPainted(false);
		hs.setBackground(lightBrown);
		hs.setToolTipText(trans);
		hs.setActionCommand("Hs");
		hs.addActionListener(this);
		rowSeven.add(hs);

		JButton mt = new JButton("Mt");
		mt.setOpaque(true);
		mt.setBorderPainted(false);
		mt.setBackground(lightBrown);
		mt.setToolTipText(trans);
		mt.setActionCommand("Mt");
		mt.addActionListener(this);
		rowSeven.add(mt);

		JButton ds = new JButton("Ds");
		ds.setOpaque(true);
		ds.setBorderPainted(false);
		ds.setBackground(lightBrown);
		ds.setToolTipText(trans);
		ds.setActionCommand("Ds");
		ds.addActionListener(this);
		rowSeven.add(ds);

		JButton rg = new JButton("Rg");
		rg.setOpaque(true);
		rg.setBorderPainted(false);
		rg.setBackground(lightBrown);
		rg.setToolTipText(trans);
		rg.setActionCommand("Rg");
		rg.addActionListener(this);
		rowSeven.add(rg);

		JButton cn = new JButton("Cn");
		cn.setOpaque(true);
		cn.setBorderPainted(false);
		cn.setBackground(lightBrown);
		cn.setToolTipText(trans);
		cn.setActionCommand("Cn");
		cn.addActionListener(this);
		rowSeven.add(cn);

		JButton uut = new JButton("Uut");
		uut.setOpaque(true);
		uut.setBorderPainted(false);
		uut.setBackground(teal);
		uut.setToolTipText(pTrans);
		uut.setActionCommand("Uut");
		uut.addActionListener(this);
		rowSeven.add(uut);

		JButton fl = new JButton("Fl");
		fl.setOpaque(true);
		fl.setBorderPainted(false);
		fl.setBackground(teal);
		fl.setToolTipText(pTrans);
		fl.setActionCommand("Fl");
		fl.addActionListener(this);
		rowSeven.add(fl);

		JButton uup = new JButton("Uup");
		uup.setOpaque(true);
		uup.setBorderPainted(false);
		uup.setBackground(teal);
		uup.setToolTipText(pTrans);
		uup.setActionCommand("Uup");
		uup.addActionListener(this);
		rowSeven.add(uup);

		JButton lv = new JButton("Lv");
		lv.setOpaque(true);
		lv.setBorderPainted(false);
		lv.setBackground(teal);
		lv.setToolTipText(pTrans);
		lv.setActionCommand("Lv");
		lv.addActionListener(this);
		rowSeven.add(lv);

		JButton uus = new JButton("Uus");
		uus.setOpaque(true);
		uus.setBorderPainted(false);
		uus.setBackground(aqua);
		uus.setToolTipText(halogen);
		uus.setActionCommand("Uus");
		uus.addActionListener(this);
		rowSeven.add(uus);

		JButton uuo = new JButton("Uuo");
		uuo.setOpaque(true);
		uuo.setBorderPainted(false);
		uuo.setBackground(lightBlue);
		uuo.setToolTipText(nobleGas);
		uuo.setActionCommand("Uuo");
		uuo.addActionListener(this);
		rowSeven.add(uuo);

		for (int i = 0; i < rowSeven.size(); i++) {
			add(rowSeven.get(i));
		}
	}

	public void makeRowEight() {
		for (int i = 0; i < 18; i++) {
			add(new JLabel());
		}

	}

	public void makeRowNine() {
		JButton la = new JButton("La");
		la.setOpaque(true);
		la.setBorderPainted(false);
		la.setBackground(lightPink);
		la.setToolTipText(lanth);
		la.setActionCommand("La");
		la.addActionListener(this);

		JButton ce = new JButton("Ce");
		ce.setOpaque(true);
		ce.setBorderPainted(false);
		ce.setBackground(lightPink);
		ce.setToolTipText(lanth);
		ce.setActionCommand("Ce");
		ce.addActionListener(this);

		JButton pr = new JButton("Pr");
		pr.setOpaque(true);
		pr.setBorderPainted(false);
		pr.setBackground(lightPink);
		pr.setToolTipText(lanth);
		pr.setActionCommand("Pr");
		pr.addActionListener(this);

		JButton nd = new JButton("Nd");
		nd.setOpaque(true);
		nd.setBorderPainted(false);
		nd.setBackground(lightPink);
		nd.setToolTipText(lanth);
		nd.setActionCommand("Nd");
		nd.addActionListener(this);

		JButton pm = new JButton("Pm");
		pm.setOpaque(true);
		pm.setBorderPainted(false);
		pm.setBackground(lightPink);
		pm.setToolTipText(lanth);
		pm.setActionCommand("Pm");
		pm.addActionListener(this);

		JButton sm = new JButton("Sm");
		sm.setOpaque(true);
		sm.setBorderPainted(false);
		sm.setBackground(lightPink);
		sm.setToolTipText(lanth);
		sm.setActionCommand("Sm");
		sm.addActionListener(this);

		JButton eu = new JButton("Eu");
		eu.setOpaque(true);
		eu.setBorderPainted(false);
		eu.setBackground(lightPink);
		eu.setToolTipText(lanth);
		eu.setActionCommand("Eu");
		eu.addActionListener(this);

		JButton gd = new JButton("Gd");
		gd.setOpaque(true);
		gd.setBorderPainted(false);
		gd.setBackground(lightPink);
		gd.setToolTipText(lanth);
		gd.setActionCommand("Gd");
		gd.addActionListener(this);

		JButton tb = new JButton("Tb");
		tb.setOpaque(true);
		tb.setBorderPainted(false);
		tb.setBackground(lightPink);
		tb.setToolTipText(lanth);
		tb.setActionCommand("Tb");
		tb.addActionListener(this);

		JButton dy = new JButton("Dy");
		dy.setOpaque(true);
		dy.setBorderPainted(false);
		dy.setBackground(lightPink);
		dy.setToolTipText(lanth);
		dy.setActionCommand("Dy");
		dy.addActionListener(this);

		JButton ho = new JButton("Ho");
		ho.setOpaque(true);
		ho.setBorderPainted(false);
		ho.setBackground(lightPink);
		ho.setToolTipText(lanth);
		ho.setActionCommand("Ho");
		ho.addActionListener(this);

		JButton er = new JButton("Er");
		er.setOpaque(true);
		er.setBorderPainted(false);
		er.setBackground(lightPink);
		er.setToolTipText(lanth);
		er.setActionCommand("Er");
		er.addActionListener(this);

		JButton tm = new JButton("Tm");
		tm.setOpaque(true);
		tm.setBorderPainted(false);
		tm.setBackground(lightPink);
		tm.setToolTipText(lanth);
		tm.setActionCommand("Tm");
		tm.addActionListener(this);

		JButton yb = new JButton("Yb");
		yb.setOpaque(true);
		yb.setBorderPainted(false);
		yb.setBackground(lightPink);
		yb.setToolTipText(lanth);
		yb.setActionCommand("Yb");
		yb.addActionListener(this);

		JButton lu = new JButton("Lu");
		lu.setOpaque(true);
		lu.setBorderPainted(false);
		lu.setBackground(lightPink);
		lu.setToolTipText(lanth);
		lu.setActionCommand("Lu");
		lu.addActionListener(this);

		List<JButton> rowNine = new ArrayList<>();
		rowNine.add(la);
		rowNine.add(ce);
		rowNine.add(pr);
		rowNine.add(nd);
		rowNine.add(pm);
		rowNine.add(sm);
		rowNine.add(eu);
		rowNine.add(gd);
		rowNine.add(tb);
		rowNine.add(dy);
		rowNine.add(ho);
		rowNine.add(er);
		rowNine.add(tm);
		rowNine.add(yb);
		rowNine.add(lu);

		for (int i = 0; i < 18; i++) {
			if (i <= 1) {
				add(new JLabel());
			} else if (i == 2) {
				JLabel label = new JLabel("57 - 71");
				label.setToolTipText("Lanthanides");
				label.setForeground(Color.WHITE);
				add(label);
			} else {
				add(rowNine.get(i - 3));
			}
		}

	}

	public void makeRowTen() {
		JButton ac = new JButton("Ac");
		ac.setOpaque(true);
		ac.setBorderPainted(false);
		ac.setBackground(lightOrange);
		ac.setToolTipText(actin);
		ac.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
		ac.setActionCommand("Ac");
		ac.addActionListener(this);

		JButton th = new JButton("Th");
		th.setOpaque(true);
		th.setBorderPainted(false);
		th.setBackground(lightOrange);
		th.setToolTipText(actin);
		th.setActionCommand("Th");
		th.addActionListener(this);

		JButton pa = new JButton("Pa");
		pa.setOpaque(true);
		pa.setBorderPainted(false);
		pa.setBackground(lightOrange);
		pa.setToolTipText(actin);
		pa.setActionCommand("Pa");
		pa.addActionListener(this);

		JButton u = new JButton("U");
		u.setOpaque(true);
		u.setBorderPainted(false);
		u.setBackground(lightOrange);
		u.setToolTipText(actin);
		u.setActionCommand("U");
		u.addActionListener(this);

		JButton np = new JButton("Np");
		np.setOpaque(true);
		np.setBorderPainted(false);
		np.setBackground(lightOrange);
		np.setToolTipText(actin);
		np.setActionCommand("Np");
		np.addActionListener(this);

		JButton pu = new JButton("Pu");
		pu.setOpaque(true);
		pu.setBorderPainted(false);
		pu.setBackground(lightOrange);
		pu.setToolTipText(actin);
		pu.setActionCommand("Pu");
		pu.addActionListener(this);

		JButton am = new JButton("Am");
		am.setOpaque(true);
		am.setBorderPainted(false);
		am.setBackground(lightOrange);
		am.setToolTipText(actin);
		am.setActionCommand("Am");
		am.addActionListener(this);

		JButton cm = new JButton("Cm");
		cm.setOpaque(true);
		cm.setBorderPainted(false);
		cm.setBackground(lightOrange);
		cm.setToolTipText(actin);
		cm.setActionCommand("Cm");
		cm.addActionListener(this);

		JButton bk = new JButton("Bk");
		bk.setOpaque(true);
		bk.setBorderPainted(false);
		bk.setBackground(lightOrange);
		bk.setToolTipText(actin);
		bk.setActionCommand("Bk");
		bk.addActionListener(this);

		JButton cf = new JButton("Cf");
		cf.setOpaque(true);
		cf.setBorderPainted(false);
		cf.setBackground(lightOrange);
		cf.setToolTipText(actin);
		cf.setActionCommand("Cf");
		cf.addActionListener(this);

		JButton es = new JButton("Es");
		es.setOpaque(true);
		es.setBorderPainted(false);
		es.setBackground(lightOrange);
		es.setToolTipText(actin);
		es.setActionCommand("Es");
		es.addActionListener(this);

		JButton fm = new JButton("Fm");
		fm.setOpaque(true);
		fm.setBorderPainted(false);
		fm.setBackground(lightOrange);
		fm.setToolTipText(actin);
		fm.setActionCommand("Fm");
		fm.addActionListener(this);

		JButton md = new JButton("Md");
		md.setOpaque(true);
		md.setBorderPainted(false);
		md.setBackground(lightOrange);
		md.setToolTipText(actin);
		md.setActionCommand("Md");
		md.addActionListener(this);

		JButton no = new JButton("No");
		no.setOpaque(true);
		no.setBorderPainted(false);
		no.setBackground(lightOrange);
		no.setToolTipText(actin);
		no.setActionCommand("No");
		no.addActionListener(this);

		JButton lr = new JButton("Lr");
		lr.setOpaque(true);
		lr.setBorderPainted(false);
		lr.setBackground(lightOrange);
		lr.setToolTipText(actin);
		lr.setActionCommand("Lr");
		lr.addActionListener(this);

		for (int a = 0; a < 18; a++) {
			if (a == 0) {
				add(new JLabel());
			} else if (a == 1) {
				add(new JLabel());
			} else if (a == 2) {
				JLabel label = new JLabel("89-103");
				label.setToolTipText("Actinoids");
				label.setForeground(Color.WHITE);
				add(label);
			} else if (a == 3) {
				add(ac);
			} else if (a == 4) {
				add(th);
			} else if (a == 5) {
				add(pa);
			} else if (a == 6) {
				add(u);
			} else if (a == 7) {
				add(np);
			} else if (a == 8) {
				add(pu);
			} else if (a == 9) {
				add(am);
			} else if (a == 10) {
				add(cm);
			} else if (a == 11) {
				add(bk);
			} else if (a == 12) {
				add(cf);
			} else if (a == 13) {
				add(es);
			} else if (a == 14) {
				add(fm);
			} else if (a == 15) {
				add(md);
			} else if (a == 16) {
				add(no);
			} else if (a == 17) {
				add(lr);
			}
		}

	}

	public void makeRowEleven() {
		for (int i = 0; i < 18; i++) {
			add(new JLabel());
		}

	}

	public void actionPerformed(ActionEvent e) {
		String source = e.getActionCommand();
		
		
		if (e.getSource() == input) {
			MolarMassCalc calc = new MolarMassCalc(source);
			JOptionPane.showMessageDialog(null, calc.getMessage());
			message.setText(calc.getMessage());
			Driver.window.add(message);
			Driver.window.setVisible(true);
		} else if (e.getActionCommand().equals("H")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("He")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Li")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Be")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("B")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("C")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("N")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("O")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("F")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ne")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Na")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Mg")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Al")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Si")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("P")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("S")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Cl")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ar")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("K")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ca")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Sc")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ti")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("V")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Cr")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Mn")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Fe")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Co")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ni")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Cu")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Zn")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ga")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ge")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("As")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Se")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Br")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Kr")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Rb")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Sr")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Y")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Zr")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Nb")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Mo")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Tc")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ru")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Rh")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Pd")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ag")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Cd")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("In")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Sn")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Sb")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Te")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("I")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Xe")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Cs")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ba")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Hf")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ta")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("W")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Re")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Os")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ir")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Pt")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Au")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Hg")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("TI")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Pb")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Bi")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Po")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("At")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Rn")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Fr")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ra")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Rf")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Db")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Sg")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Bh")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Hs")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Mt")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ds")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Rg")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Cn")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Uut")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Fl")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Uup")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Lv")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Uus")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Uuo")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("La")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ce")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Pr")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Nd")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Pm")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Sm")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Eu")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Gd")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Tb")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Dy")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ho")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Er")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Tm")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Yb")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Lu")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Ac")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Th")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Pa")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("U")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Np")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Pu")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Am")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Cm")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Bk")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Cf")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Es")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Fm")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Md")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("No")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("Lr")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("0")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("1")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("2")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("3")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("4")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("5")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("6")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("7")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("8")) {
			input.setText(input.getText() + source);
		} else if (e.getActionCommand().equals("9")) {
			input.setText(input.getText() + source);
		}

	}

}
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class OnlineTest extends JFrame implements ActionListener {
   JLabel l = new JLabel();
   JRadioButton[] jb = new JRadioButton[5];
   JButton b1;
   JButton b2;
   ButtonGroup bg;
   int count = 0;
   int current = 0;
   int x = 1;
   int y = 1;
   int now = 0;
   int[] m = new int[10];

   OnlineTest(String var1) {
      super(var1);
      this.add(this.l);
      this.bg = new ButtonGroup();

      for(int var2 = 0; var2 < 5; ++var2) {
         this.jb[var2] = new JRadioButton();
         this.add(this.jb[var2]);
         this.bg.add(this.jb[var2]);
      }

      this.b1 = new JButton("Next");
      this.b2 = new JButton("Bookmark");
      this.b1.addActionListener(this);
      this.b2.addActionListener(this);
      this.add(this.b1);
      this.add(this.b2);
      this.set();
      this.l.setBounds(30, 40, 450, 20);
      this.jb[0].setBounds(50, 80, 100, 20);
      this.jb[1].setBounds(50, 110, 100, 20);
      this.jb[2].setBounds(50, 140, 100, 20);
      this.jb[3].setBounds(50, 170, 100, 20);
      this.b1.setBounds(100, 240, 100, 30);
      this.b2.setBounds(270, 240, 100, 30);
      this.setDefaultCloseOperation(3);
      this.setLayout((LayoutManager)null);
      this.setLocation(250, 100);
      this.setVisible(true);
      this.setSize(600, 350);
   }

   public void actionPerformed(ActionEvent var1) {
      if (var1.getSource() == this.b1) {
         if (this.check()) {
            ++this.count;
         }

         ++this.current;
         this.set();
         if (this.current == 9) {
            this.b1.setEnabled(false);
            this.b2.setText("Result");
         }
      }

      if (var1.getActionCommand().equals("Bookmark")) {
         JButton var2 = new JButton("Bookmark" + this.x);
         var2.setBounds(480, 20 + 30 * this.x, 100, 30);
         this.add(var2);
         var2.addActionListener(this);
         this.m[this.x] = this.current;
         ++this.x;
         ++this.current;
         this.set();
         if (this.current == 9) {
            this.b2.setText("Result");
         }

         this.setVisible(false);
         this.setVisible(true);
      }

      int var4 = 0;

      for(int var3 = 1; var4 < this.x; ++var3) {
         if (var1.getActionCommand().equals("Bookmark" + var3)) {
            if (this.check()) {
               ++this.count;
            }

            this.now = this.current;
            this.current = this.m[var3];
            this.set();
            ((JButton)var1.getSource()).setEnabled(false);
            this.current = this.now;
         }

         ++var4;
      }

      if (var1.getActionCommand().equals("Result")) {
         if (this.check()) {
            ++this.count;
         }

         ++this.current;
         JOptionPane.showMessageDialog(this, "correct ans=" + this.count);
         System.exit(0);
      }

   }

   void set() {
      this.jb[4].setSelected(true);
      if (this.current == 0) {
         this.l.setText("Que1: Which one among these is not a primitive datatype?");
         this.jb[0].setText("int");
         this.jb[1].setText("Float");
         this.jb[2].setText("boolean");
         this.jb[3].setText("char");
      }

      if (this.current == 1) {
         this.l.setText("Que2: Which class is available to all the class automatically?");
         this.jb[0].setText("Swing");
         this.jb[1].setText("Applet");
         this.jb[2].setText("Object");
         this.jb[3].setText("ActionEvent");
      }

      if (this.current == 2) {
         this.l.setText("Que3: Which package is directly available to our class without importing it?");
         this.jb[0].setText("swing");
         this.jb[1].setText("applet");
         this.jb[2].setText("net");
         this.jb[3].setText("lang");
      }

      if (this.current == 3) {
         this.l.setText("Que4: String class is defined in which package?");
         this.jb[0].setText("lang");
         this.jb[1].setText("Swing");
         this.jb[2].setText("Applet");
         this.jb[3].setText("awt");
      }

      if (this.current == 4) {
         this.l.setText("Que5: Which institute is best for java coaching?");
         this.jb[0].setText("Utek");
         this.jb[1].setText("Aptech");
         this.jb[2].setText("SSS IT");
         this.jb[3].setText("jtek");
      }

      if (this.current == 5) {
         this.l.setText("Que6: Which one among these is not a keyword?");
         this.jb[0].setText("class");
         this.jb[1].setText("int");
         this.jb[2].setText("get");
         this.jb[3].setText("if");
      }

      if (this.current == 6) {
         this.l.setText("Que7: Which one among these is not a class? ");
         this.jb[0].setText("Swing");
         this.jb[1].setText("Actionperformed");
         this.jb[2].setText("ActionEvent");
         this.jb[3].setText("Button");
      }

      if (this.current == 7) {
         this.l.setText("Que8: which one among these is not a function of Object class?");
         this.jb[0].setText("toString");
         this.jb[1].setText("finalize");
         this.jb[2].setText("equals");
         this.jb[3].setText("getDocumentBase");
      }

      if (this.current == 8) {
         this.l.setText("Que9: which function is not present in Applet class?");
         this.jb[0].setText("init");
         this.jb[1].setText("main");
         this.jb[2].setText("start");
         this.jb[3].setText("destroy");
      }

      if (this.current == 9) {
         this.l.setText("Que10: Which one among these is not a valid component?");
         this.jb[0].setText("JButton");
         this.jb[1].setText("JList");
         this.jb[2].setText("JButtonGroup");
         this.jb[3].setText("JTextArea");
      }

      this.l.setBounds(30, 40, 450, 20);
      int var1 = 0;

      for(int var2 = 0; var1 <= 90; ++var2) {
         this.jb[var2].setBounds(50, 80 + var1, 200, 20);
         var1 += 30;
      }

   }

   boolean check() {
      if (this.current == 0) {
         return this.jb[1].isSelected();
      } else if (this.current == 1) {
         return this.jb[2].isSelected();
      } else if (this.current == 2) {
         return this.jb[3].isSelected();
      } else if (this.current == 3) {
         return this.jb[0].isSelected();
      } else if (this.current == 4) {
         return this.jb[2].isSelected();
      } else if (this.current == 5) {
         return this.jb[2].isSelected();
      } else if (this.current == 6) {
         return this.jb[1].isSelected();
      } else if (this.current == 7) {
         return this.jb[3].isSelected();
      } else if (this.current == 8) {
         return this.jb[1].isSelected();
      } else {
         return this.current == 9 ? this.jb[2].isSelected() : false;
      }
   }

   public static void main(String[] var0) {
      new OnlineTest("Online Test Of Java");
   }
}

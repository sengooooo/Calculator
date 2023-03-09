//2091138 이세은 실행성공

import java.util.*;

import java.lang.*;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

import javax.swing.*;





class GStack<T> {

    private int tos;

    private Object[] stack;



    public GStack() {

        tos = 0;

        stack = new Object[10];

    }

    

    private void increase() {

        Object[] newStack = new Object[stack.length * 2];

        for (int i = 0; i < stack.length; i++)

            newStack[i]= stack[i];

        stack = newStack;

    }



    

    public void push(T item) {

        if (tos == stack.length)

            increase();

        stack[tos++] = item;

    }



    public T pop() {

        if (tos == 0)

            return null;

        return (T) stack[--tos];

    }



    public boolean isEmpty() {

        return tos == 0;

    }



    public void delete() {

        if (isEmpty())

            return;

        tos--;

    }



    public T peek() {

        if (this.tos == 0)

            return null;

        return (T) stack[tos - 1];

    }

}





public class Report6 extends JFrame {

   

   static int prec(String op) {

         switch(op) {

         case "(":

         case ")": return 0;

         case "+":

         case "-":return 1;

         case "*":

         case "/":return 2;

         }

         return -1;

         }

       //연산자 우선순위 반환

   public Report6() {

	      

	      setTitle("공학용 계산기");

	      setSize(400, 400);

	      setLocation(800, 300);

	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	   

	      Panel jp1 = new Panel();

	      Panel jp2 = new Panel();

	      Panel jp3 = new Panel();



	      this.add(jp1);

	      jp1.setLayout(new FlowLayout());



	      jp2.setLayout(new GridLayout(5,4));

	      jp2.setPreferredSize(new Dimension(300,200));

	      

	      //1번줄

	      JButton b1 = new JButton("1");

	      jp2.add(b1);

	      

	      JButton b2 = new JButton("2");

	      jp2.add(b2);

	      

	      JButton b3 = new JButton("3");

	      jp2.add(b3);



	      JButton bs = new JButton("<-");

	      jp2.add(bs);

	      

	      //2번줄

	      JButton b4 = new JButton("4");

	      jp2.add(b4);

	      

	      JButton b5 = new JButton("5");

	      jp2.add(b5);

	      

	      JButton b6 = new JButton("6");

	      jp2.add(b6);



	      JButton bplus = new JButton("+");

	      jp2.add(bplus);

	      

	      //3번줄

	      JButton b7 = new JButton("7");

	      jp2.add(b7);

	      

	      JButton b8 = new JButton("8");

	      jp2.add(b8);

	      

	      JButton b9 = new JButton("9");

	      jp2.add(b9);



	      JButton bminus = new JButton("-");

	      jp2.add(bminus);

	      

	      //4번줄

	      JButton bdot = new JButton(".");

	      jp2.add(bdot);

	      

	      JButton b0 = new JButton("0");

	      jp2.add(b0);

	      

	      JButton bgob = new JButton("*");

	      jp2.add(bgob);



	      JButton bna = new JButton("/");

	      jp2.add(bna);

	      

	      //5번줄

	      JButton bleft = new JButton("(");

	      jp2.add(bleft);

	      

	      JButton bright = new JButton(")");

	      jp2.add(bright);

	      

	      JButton bclear = new JButton("clear");

	      jp2.add(bclear);



	      JButton beq = new JButton("=");

	      jp2.add(beq);

	     

	      JLabel text1=new JLabel("2091138 이세은 공학용 계산기");

	      

	      jp3.add(text1);

	      

	      //전체내용

	      JLabel label=new JLabel("수식 입력");

	      jp1.add(label);

	      JTextField tf = new JTextField(29);

	      JTextField tf2=new JTextField(33);

	      jp1.add(tf);

	      jp1.add(jp2);      

	      jp1.add(tf2);

	      jp1.add(jp3);



	      this.setVisible(true);

	      

	      //숫자버튼 클릭

	      b1.addActionListener(new ActionListener() {

	    	  public void actionPerformed(ActionEvent e) {

	    		  tf.setText(tf.getText()+"1");

	    	  }

	      });

	      

	      b2.addActionListener(new ActionListener() {

	    	  public void actionPerformed(ActionEvent e) {

	    		  tf.setText(tf.getText()+"2");

	    	  }

	      });

	      

	      b3.addActionListener(new ActionListener() {

	    	  public void actionPerformed(ActionEvent e) {

	    		  tf.setText(tf.getText()+"3");

	    	  }

	      });

	      

	      b4.addActionListener(new ActionListener() {

	    	  public void actionPerformed(ActionEvent e) {

	    		  tf.setText(tf.getText()+"4");

	    	  }

	      });

	      

	      b5.addActionListener(new ActionListener() {

	    	  public void actionPerformed(ActionEvent e) {

	    		  tf.setText(tf.getText()+"5");

	    	  }

	      });

	      

	      b6.addActionListener(new ActionListener() {

	    	  public void actionPerformed(ActionEvent e) {

	    		  tf.setText(tf.getText()+"6");

	    	  }

	      });

	      

	      b7.addActionListener(new ActionListener() {

	    	  public void actionPerformed(ActionEvent e) {

	    		  tf.setText(tf.getText()+"7");

	    	  }

	      });

	      

	      b8.addActionListener(new ActionListener() {

	    	  public void actionPerformed(ActionEvent e) {

	    		  tf.setText(tf.getText()+"8");

	    	  }

	      });

	      

	      b9.addActionListener(new ActionListener() {

	    	  public void actionPerformed(ActionEvent e) {

	    		  tf.setText(tf.getText()+"9");

	    	  }

	      });

	      

	      b0.addActionListener(new ActionListener() {

	    	  public void actionPerformed(ActionEvent e) {

	    		  tf.setText(tf.getText()+"0");

	    	  }

	      });

	      

	      //기호

	      bplus.addActionListener(new ActionListener() {

	    	 public void actionPerformed(ActionEvent e) {

	    		 tf.setText(tf.getText()+"+");

	    		 }

	      });

	      

	      bminus.addActionListener(new ActionListener() {

		    	 public void actionPerformed(ActionEvent e) {

		    		 tf.setText(tf.getText()+"-");

		    		 }

		      });



	      bgob.addActionListener(new ActionListener() {

		    	 public void actionPerformed(ActionEvent e) {

		    		 tf.setText(tf.getText()+"*");

		    		 }

		      });

	      

	      bna.addActionListener(new ActionListener() {

		    	 public void actionPerformed(ActionEvent e) {

		    		 tf.setText(tf.getText()+"/");

		    		 }

		      });

	      

	      bright.addActionListener(new ActionListener() {

		    	 public void actionPerformed(ActionEvent e) {

		    		 tf.setText(tf.getText()+")");

		    		 }

		      });

	      

	      bleft.addActionListener(new ActionListener() {

		    	 public void actionPerformed(ActionEvent e) {

		    		 tf.setText(tf.getText()+"(");

		    		 }

		      });

	      

	      bdot.addActionListener(new ActionListener() {

		    	 public void actionPerformed(ActionEvent e) {

		    		 tf.setText(tf.getText()+".");

		    		 }

		      });

	      

	      //기타

	      bs.addActionListener(new ActionListener() {

		    	 public void actionPerformed(ActionEvent e) {

		    		 int t=tf.getText().length();

		    		 if(t!=0) {

		    			 String text=tf.getText().substring(0,t-1);

		    			 tf.setText(text);

		    		 	}

		    		 }

		      });





	      bclear.addActionListener(new ActionListener() {

		    	 public void actionPerformed(ActionEvent e) {

		    		 tf.setText("");

		    		 tf2.setText("");

		    		 }

		      });

	      

	      //결과 입력받기

	      tf.addActionListener(new ActionListener() {

	    	  public void actionPerformed(ActionEvent e) {

	    		  tf2.setText("");

	    		  	String exp="";

	    		  	exp+=tf.getText();

	    		  	exp+="=";

	    		  	String rst=String.valueOf(calcValue(exp));

	    		  	tf2.setText(rst);

	    		  	//out.println(calcValue(exp));

	    		  	tf.setText("");

	    		  	exp="";

	    	  		}

	      	});

	      

	      beq.addActionListener(new ActionListener() {

		    	 public void actionPerformed(ActionEvent e) {

		    		 tf2.setText("");

		    		 String exp="";

		    		  	exp+=tf.getText();

		    		    exp+="=";

		    		  	String rst=String.valueOf(calcValue(exp));

		    		  	tf2.setText(rst);

		    		  	tf.setText("");

		    		  	exp="";

		    	 } 

		    	 

	      });

   }

	      

   //결과 출력하기

   public double calcValue(String infix) {

	   double rst=0;

	   String exp=infix;

	   StringBuilder stringBuilder = new StringBuilder();

	   GStack<String>stringStack=new GStack<String>();//문자스택

	        

	   String token;

	   StringTokenizer st=new StringTokenizer(exp,"+-*/()=",true);

	   while(st.hasMoreTokens()) {

	        token=st.nextToken();

	        String str;

	        switch(token) {

	        case"(":

	           stringStack.push(token);

	           break;

	        case ")":

	           while(!stringStack.isEmpty()&&!stringStack.peek().equals("(")) {

	              str=stringStack.pop().toString();

	              stringBuilder.append(str+" ");

	              }

	           stringStack.delete();

	           break;

	        case "+":case"-":case"*":case"/":

	           while(!stringStack.isEmpty()&&prec(stringStack.peek())>=prec(token)) {

	              str=stringStack.pop().toString();

	              stringBuilder.append(str+" ");

	              }

	           stringStack.push(token);

	           break;

	        case "=":

	           while(!stringStack.isEmpty()) {

	              str=stringStack.pop().toString();

	              stringBuilder.append(str+" ");

	              }

	           stringBuilder.append(token+" ");

	           break;

	        default :

	           stringBuilder.append(token+" ");

	           break;

	        }

	            

	     }

	     String postfix=stringBuilder.toString();

	         

	//-------------------------계산----------------------------

	     GStack<Double>DoubleStack=new GStack<Double>();//실수스택

	     StringTokenizer eval=new StringTokenizer(postfix);

	     double op1;

	     double op2;

	     while(eval.hasMoreTokens()) {

	        token=eval.nextToken();

	        switch(token) {

	        case "+":

	           op2=DoubleStack.pop();

	           op1=DoubleStack.pop();

	           DoubleStack.push(op1+op2);

	           break;

	        case "-":

	           op2=DoubleStack.pop();

	           op1=DoubleStack.pop();

	           DoubleStack.push(op1-op2);

	           break;

	        case "*":

	           op2=DoubleStack.pop();

	           op1=DoubleStack.pop();

	           DoubleStack.push(op1*op2);

	           break;

	        case "/":

	           op2=DoubleStack.pop();

	           op1=DoubleStack.pop();

	           DoubleStack.push(op1/op2);

	           break;

	        case "=":

	           rst=DoubleStack.pop();

	           break;

	        default:

	           DoubleStack.push(Double.parseDouble(token));

	           break;

	        }

	   }

	     return rst;

   }

   

public static void main(String[] args) {

	  new Report6();

	}

}
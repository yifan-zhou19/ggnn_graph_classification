import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class dijkstra implements  MouseListener {
		int [][] path =new int [10][2];		
		int [] costs =new int [10];
		JTextField [] costBox=new JTextField[10];
		JLabel pathLabel =new JLabel();
		dijkstra(int node){
			
			JFrame frame;
			JFrame.setDefaultLookAndFeelDecorated(true);
			frame = new JFrame("Djikstra");
			
			JPanel GUI = new JPanel();
			GUI.setLayout(null);
			
			JTextField [] textBox=new JTextField[10];
			JPanel buttons =new JPanel();
			buttons.setLayout(null);
			buttons.setLocation(10,10);
			buttons.setSize(500,60);
			GUI.add(buttons);
			int [] visited=new int [10];			
			int visitCounter=0;
			int nodeCounter=0;
			
		
			
			visited[visitCounter]=node;
			visitCounter++;
			
			for(int i=0;i<10;i++){
				if(Main.matrix[node][i]!=0){
					costs[i]=Main.matrix[node][i];
					path[i][0]=node;
					path[i][1]=1;
					visited[visitCounter]=i;
					visitCounter++;
				}
				else{
					costs[i]=100;
				}
			}
			nodeCounter++;
			
			while(nodeCounter<10){
				if(nodeCounter<visitCounter){
					for(int i=0;i<10;i++){
						if(Main.matrix[visited[nodeCounter]][i]!=0){
							if(costs[i] > Main.matrix[visited[nodeCounter]][i]+costs[visited[nodeCounter]]){
								costs[i]= Main.matrix[visited[nodeCounter]][i]+costs[visited[nodeCounter]];
								path[i][0]=visited[nodeCounter];
								path[i][1]=path[visited[nodeCounter]][1]+1;
							}
							boolean flag=true;
								for(int j=0;j<visitCounter;j++){
									if(visited[j]==i){
										flag=false;
									}
								}
								if(flag){
									visited[visitCounter]=i;
									visitCounter++;
								}
						}
					}
				}
				nodeCounter++;
			}
			int x=100;
			for(int i=0;i<10;i++){				
				costBox[i] =new JTextField();
				if(costs[i]==100){
					costBox[i].setText("-");
				}
				else{
					costBox[i].setText(""+costs[i]);
				}
				costBox[i].setEditable(false);
				costBox[i].setHorizontalAlignment(0);
				costBox[i].setSize(40,20);
				costBox[i].setLocation(x,20);
				costBox[i].setVisible(true);
				costBox[i].setBackground(Color.WHITE);
				costBox[i].addMouseListener(this);
				x+=40;
				buttons.add(costBox[i]);
			}
						
			String [] a= new String[10];
			a[0]="A";a[1]="B";a[2]="C";a[3]="D";a[4]="E";a[5]="F";a[6]="G";a[7]="H";a[8]="J";a[9]="K";
					
			JTextField text=new JTextField();
			text.setText(a[node]);
			text.setEditable(false);
			text.setHorizontalAlignment(0);
			text.setSize(40,20);
			text.setLocation(60,20);
			text.setVisible(true);
			text.setBackground(Color.WHITE);
			buttons.add(text);
			
			x=100;		
			for(int i=0;i<10;i++){				
				textBox[i] =new JTextField();
				textBox[i].setText(a[i]);
				textBox[i].setEditable(false);
				textBox[i].setHorizontalAlignment(0);
				textBox[i].setSize(40,20);
				textBox[i].setLocation(x,0);
				textBox[i].setVisible(true);
				textBox[i].setBackground(Color.WHITE);
				x+=40;
				buttons.add(textBox[i]);
			}
			String label=pathh(6);
			pathLabel.setText("");
			JPanel p=new JPanel();
			p.setLayout(new FlowLayout());
			p.setLocation(0,65);
			p.setSize(500,100);
			p.add(pathLabel);
			GUI.add(p);
			frame.setSize(600,130);
			frame.setContentPane(GUI);
			frame.setResizable(false);
			frame.setVisible(true);
		
		}
		public String pathh(int destination){
			String [] a= new String[10];
			a[0]="A";a[1]="B";a[2]="C";a[3]="D";a[4]="E";a[5]="F";a[6]="G";a[7]="H";a[8]="J";a[9]="K";
			int temp=destination;
			String p="";
			int [] truePath=new int[10];
			truePath[0]=destination;
			int counter=0;
			int i=0;
			
			while(i < path[destination][1]){
				counter++;
				truePath[counter]=path[temp][0];
				temp=path[temp][0];
				i++;
			}
			p+="Path->";
			boolean flag=true;
			for(int j=counter;j>0;j--){
				flag=false;
				p+=a[truePath[j]]+"-->>"+Main.matrix[truePath[j]][truePath[j-1]]+"-->>";
			}
			if(flag){
				p="NoWay";
			}
			else{
				p+=a[truePath[0]];
			}
			return p;
		}
		@Override
	
		
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent evt) {
			// TODO Auto-generated method stub
			Object src=evt.getSource();
			if(src==costBox[0]){
				pathLabel.setText(pathh(0));
			}else if(src==costBox[1]){
				pathLabel.setText(pathh(1));
			}else if(src==costBox[2]){
				pathLabel.setText(pathh(2));
			}else if(src==costBox[3]){
				pathLabel.setText(pathh(3));
			}else if(src==costBox[4]){
				pathLabel.setText(pathh(4));
			}else if(src==costBox[5]){
				pathLabel.setText(pathh(5));
			}else if(src==costBox[6]){
				pathLabel.setText(pathh(6));
			}else if(src==costBox[7]){
				pathLabel.setText(pathh(7));
			}else if(src==costBox[8]){
				pathLabel.setText(pathh(8));
			}else if(src==costBox[9]){
				pathLabel.setText(pathh(9));
			}
		}
		@Override
		public void mouseExited(MouseEvent evt) {
			pathLabel.setText("");
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
			
}

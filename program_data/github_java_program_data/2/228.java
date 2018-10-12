
import java.util.Random;
/**
 *
 * @author Zeeshan
 */
public class Slist {
    

Node head,tail;

int Nelements;
int height;
Random R;


public Slist()
{

Node Inf1;
Node Inf2;

Inf1 = new Node(-1);
Inf2 = new Node(+1);

head=Inf1;
tail=Inf2;       


Inf1.right=Inf2;
Inf2.left=Inf1;


Nelements=0;
height=0;
R = new Random();

}


public Node Find(int Val)
{
Node current = head;
 
while (true)
{

while(current.right.Key!=1 && current.right.Key < Val)
                {
                    current = current.right;
                }

                if (current.down != null)
                {
                    current = current.down;

                }
                else
                    break;
                
            }
            return current;
}



public boolean Search(int Val)
{

Node Temp;
Temp=Find(Val);
if(Temp.right.Key==Val)
{

return true;
}
else
{


return  false;
}
}


public Node Insert(int Val)
 
{
int i=1;
Node current,previous,Temp;
current=head;
Temp = new Node(Val);

if(current.down == null && current.right.Key==1) //If List is Empty
{
tail.left=Temp;
Temp.right=tail;
head.right=Temp;
Temp.left=head;
Nelements++;
}

else
{
previous=Find(Val);
if(previous.right.Key==Val)
{
return current;

}


else
{
    while(current.down != null)
    {
    current=current.down;
    }
    
previous.right.left=Temp;
Temp.right=previous.right;
previous.right=Temp;
Temp.left=previous;
Nelements++;
}

while(R.nextFloat() < 0.5)
{

if(i>height)
{
Node Neg,Pos;
Neg = new Node(-1);
Pos = new Node(+1);


Neg.right=Pos;
Pos.left=Neg;
Neg.down=head;
Pos.down=tail;
head.up=Neg;
tail.up=Pos;
head = Neg;
tail=Pos;
height++;
}

Node TempN = new Node(Val);
if(head.right.Key==1)
{
    TempN.down = Temp;
     Temp.up =TempN;       
head.right.left = TempN;
TempN.right=tail;
head.right=TempN;
TempN.left=head;
Temp=Temp.up;
i++;
}

else if(head.right.Key != 1)
{

Node last = head;
while(i < height)
{
last=last.down;
i++;
}
TempN.down=Temp;
Temp.up=TempN;
last.right.left=TempN;
TempN.right=last.right;
last.right=TempN;
TempN.left=last;
Temp=Temp.up;
i++;
}
    
    
    
    }


return  current;

}
return  current;

}



public String display()
        {
            String Output = ""; 
            Node current = head;

            while (current.down != null)
            {
                current = current.down;
            }

            current = current.right;

            while (current.Key != 1)
            {
               Output = Output +  show(current);
                Output = Output + "\n";
                current = current.right;
            }
            Output = Output + "\n";
            return Output;
        }

public String show(Node levelNode)
        { String S=" ";
            while (levelNode != null)
            {
                S = S + levelNode.Key + "--";
                levelNode= levelNode.up;

            }
            return S;
        }













public Node  delete(int numTodel)
        {
            Node deleteNode = Find(numTodel);
            Node extra = deleteNode.right;
            Node Temp = deleteNode;

            if (extra.Key == numTodel)
            {


                while (extra != null)
                {
                    extra.left.right = extra.right;
                    extra.right.left = extra.left;

                    extra = extra.up;


                }

                return Temp;
            }
            else
                
                return  null;
        }
    
public static Slist EnterRandom()
{
   Slist S = new Slist();
    S.Insert(50);
    S.Insert(30);
    S.Insert(10);
    S.Insert(20);
    S.Insert(40);
    S.Insert(60);
    S.Insert(100);
    S.Insert(80);
    S.Insert(70);
    S.Insert(90); 
    S.Insert(500);
    S.Insert(300);
    S.Insert(100);
    S.Insert(200);
    S.Insert(400);
    S.Insert(600);
    S.Insert(1000);
    S.Insert(800);
    S.Insert(700);
    S.Insert(900); 
      S.Insert(500);
    S.Insert(30);
    S.Insert(100);
    S.Insert(20);
    S.Insert(400);
    S.Insert(60);
    S.Insert(100);
    S.Insert(800);
    S.Insert(70);
    S.Insert(900); 
       S.Insert(501);
    S.Insert(301);
    S.Insert(1001);
    S.Insert(201);
    S.Insert(4001);
    S.Insert(601);
    S.Insert(1001);
    S.Insert(8001);
    S.Insert(701);
    S.Insert(9001); 
    S.Insert(4080);
    S.Insert(606);
    S.Insert(1560);
    S.Insert(8360);
    S.Insert(7270);
    S.Insert(9008); 
       S.Insert(5000);
    S.Insert(3000);
    S.Insert(10000);
    S.Insert(209);
    S.Insert(4080);
    S.Insert(606);
    S.Insert(1060);
    S.Insert(8060);
    S.Insert(7770);
    S.Insert(9008); 
    S.Insert(10101);
    S.Insert(80101);
    S.Insert(72301);
    S.Insert(92218);
       S.Insert(123);
    S.Insert(1234);
    S.Insert(12345);
    S.Insert(123456);
    S.Insert(45643);
    S.Insert(34343);
    S.Insert(1010);
    S.Insert(8010);
    S.Insert(7230);
    S.Insert(9118);
    
    
    rn S;

}
}

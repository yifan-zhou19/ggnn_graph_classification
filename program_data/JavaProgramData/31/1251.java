public class student
{

public String num = new String(new char[20]);

public String name = new String(new char[100]);

public char sex;

public int age;

public String score = new String(new char[10]);

public String address = new String(new char[20]);

public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student print()
	{

	student head = null;
	student node;

	do

	{


	node = new student();


	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		node.num = tempVar.charAt(0);
	}


	if (strcmp(node.num,"end") == 0)
	{



	break;
	}


	else


	{



	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		node.name = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar3 != null)
	{
		node.sex = tempVar3.charAt(0);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		node.age = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		node.score = tempVar5.charAt(0);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		node.address = tempVar6.charAt(0);
	}



	node.next = head;


	head = node;


	}



	} while (1 != 0);



	return head;
	}
	public static void Main()
	{

	student p;

	p = print();

	do

	{


	System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.address);


	p = p.next;

	} while (p.next != null);


	System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.address);
	}


}


//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public String name = new String(new char[20]);
	public float score1;
	public float score2;
	public char c1;
	public char c2;
	public int paper;
	public int money;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int N;
	public static void mon(student p)
	{
			p.money = 0;
		   if (p.score1 > 80F && p.paper > 0)
		   {
				p.money += 8000;
		   }
			if (p.score1 > 85F && p.score2 > 80F)
			{
				p.money += 4000;
			}
			if (p.score1 > 90F)
			{
				p.money += 2000;
			}
			if (p.score1 > 85F && p.c2 == 'Y')
			{
				p.money += 1000;
			}
			if (p.score2 > 80F && p.c1 == 'Y')
			{
				p.money += 850;
			}
	}

	public static student creat()
	{
		int i = 1;
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.name = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.score1 = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.score2 = Float.parseFloat(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar4 != null)
		{
			p1.c1 = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.c2 = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.paper = Integer.parseInt(tempVar6);
		}
		mon(p1);
		p1.next = null;
		head = p1;
		p2 = p1;
		do
		{
			if (i >= N)
			{
				break;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.name = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p1.score1 = Float.parseFloat(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.score2 = Float.parseFloat(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar10 != null)
			{
				p1.c1 = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.c2 = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.paper = Integer.parseInt(tempVar12);
			}
			mon(p1);
			p1.next = null;
			p2.next = p1;
			p2 = p1;
			i++;
			}
		}while (1 != 0);
		return (head);
	}
	public static void print(student head)
	{
		int total = 0;
		int max = 0;
		student p;
		student pmax;
		p = head;
		do
		{
			total += p.money;
			if (p.money > max)
			{
				pmax = p;
				max = p.money;
			}
			p = p.next;
		}while (p != null);
		System.out.printf("%s\n%d\n",pmax.name,max);
		System.out.printf("%d",total);
	}
	public static int Main()
	{
		int total;
		student head;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public String name = new String(new char[20]);
	public int qimo;
	public int banpin;
	public char ganbu;
	public char xibu;
	public int lunwen;
	public double sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static double total = 0;
	public static student create()
	{
		student p1;
		student p2;
		student head;
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
			p1.qimo = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.banpin = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar4 != null)
		{
			p1.ganbu = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.xibu = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.lunwen = Integer.parseInt(tempVar6);
		}
		p1.sum = 0;
		if (p1.qimo > 80 && p1.lunwen > 0)
		{
			p1.sum = p1.sum + 8000;
		}
		if (p1.qimo > 85 && p1.banpin > 80)
		{
			p1.sum = p1.sum + 4000;
		}
		if (p1.qimo > 90)
		{
			p1.sum = p1.sum + 2000;
		}
		if (p1.xibu == 'Y' && p1.qimo > 85)
		{
			p1.sum = p1.sum + 1000;
		}
		if (p1.ganbu == 'Y' && p1.banpin > 80)
		{
			p1.sum = p1.sum + 850;
		}
		total = total + p1.sum;

		head = p1;
		p2 = p1;
		p1.next = null;
		int i = 1;
		do
		{
			if (i == n)
			{
				break;
			}
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
					p1.qimo = Integer.parseInt(tempVar8);
				}
				String tempVar9 = ConsoleInput.scanfRead(" ");
				if (tempVar9 != null)
				{
					p1.banpin = Integer.parseInt(tempVar9);
				}
				String tempVar10 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar10 != null)
				{
					p1.ganbu = tempVar10.charAt(0);
				}
				String tempVar11 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar11 != null)
				{
					p1.xibu = tempVar11.charAt(0);
				}
				String tempVar12 = ConsoleInput.scanfRead(" ");
				if (tempVar12 != null)
				{
					p1.lunwen = Integer.parseInt(tempVar12);
				}
				p1.sum = 0;
				if (p1.qimo > 80 && p1.lunwen > 0)
				{
					p1.sum = p1.sum + 8000;
				}
				if (p1.qimo > 85 && p1.banpin > 80)
				{
					p1.sum = p1.sum + 4000;
				}
				if (p1.qimo > 90)
				{
					p1.sum = p1.sum + 2000;
				}
				if (p1.xibu == 'Y' && p1.qimo > 85)
				{
					p1.sum = p1.sum + 1000;
				}
				if (p1.ganbu == 'Y' && p1.banpin > 80)
				{
					p1.sum = p1.sum + 850;
				}
				total = total + p1.sum;

				p2.next = p1;
				p2 = p1;
				p1.next = null;
				i++;

		}while (1 != 0);
			return (head);
	}
	public static student findmax(student head)
	{
		student p;
		student max;
		p = head.next;
		max = head;
		while (p != null)
		{
			if (p.sum > max.sum)
			{
				max = p;
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



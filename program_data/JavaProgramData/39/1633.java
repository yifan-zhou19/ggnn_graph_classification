//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class stu
{
	public String name = new String(new char[25]);
	public int s1;
	public int s2;
	public char y1;
	public char y2;
	public int t;
	public int sum;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu creat(int n)
	{
		int i;
		stu head;
		stu p1;
		stu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.name = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.s1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.s2 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar4 != null)
		{
			p1.y1 = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.y2 = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.t = Integer.parseInt(tempVar6);
		}
		head = null;

		for (i = 0;i < n - 1;i++)
		{

			if (i == 0)
			{
				head = p1;
			}
			p1 = new stu();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.name = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p1.s1 = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.s2 = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar10 != null)
			{
				p1.y1 = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.y2 = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.t = Integer.parseInt(tempVar12);
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return (head);
	}
	public static void print(stu head)
	{
		stu p;
		p = head;
		if (head != null)
		{
			do
			{
				System.out.printf("%s %d %d %c %c %d\n",p.name,p.s1,p.s2,p.y1,p.y2,p.t);
				p = p.next;
			}while (p != null);
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int s;
		int max;
		stu head;
		stu p1;
		stu p2;
		stu p3;
		stu p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		p3 = p2 = p1 = head;
		for (i = 0;i < n;i++)
		{
			p1.sum = 0;
			if ((p1.t > 0) && (p1.s1 > 80))
			{
				p1.sum = p1.sum + 8000;
			}
			if ((p1.s2 > 80) && (p1.s1 > 85))
			{
				p1.sum = p1.sum + 4000;
			}
			if (p1.s1 > 90)
			{
				p1.sum = p1.sum + 2000;
			}
			if ((p1.y2 == 'Y') && (p1.s1 > 85))
			{
				p1.sum = p1.sum + 1000;
			}
			if ((p1.y1 == 'Y') && (p1.s2 > 80))
			{
				p1.sum = p1.sum + 850;
			}
			p1 = p1.next;
		}
		max = 0;
		p1 = head;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



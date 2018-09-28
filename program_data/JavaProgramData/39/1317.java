//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public String name = new String(new char[25]);
	public int s1;
	public int s2;
	public char yn1;
	public char yn2;
	public int t;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(int n)
	{
		student head;
		student p1;
		student p2;
		int i;
		p1 = p2 = new student();
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
			p1.yn1 = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.yn2 = tempVar5.charAt(0);
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
			p1 = new student();
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
				p1.yn1 = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.yn2 = tempVar11.charAt(0);
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

	public static void print(student head)
	{
		student p;
		p = head;
		if (head != null)
		{
			do
			{
				System.out.printf("%s %d %d %c %c %d\n",p.name,p.s1,p.s2,p.yn1,p.yn2,p.t);
				p = p.next;
			}while (p != null);
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int s;
		int max;
		int r = 0;
		student p1;
		student p2;
		student p3;
		student p;
		student g = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = creat(n);
		//print(p);
		p1 = p;
		p2 = p;
		p3 = p;
		for (i = 0;i < n;i++)
		{
			p1.sum = 0;
			if ((p1.s1 > 80) && (p1.t >= 1))
			{
				p1.sum = p1.sum + 8000;
			}
			if ((p1.s1 > 85) && (p1.s2 > 80))
			{
				p1.sum = p1.sum + 4000;
			}
			if (p1.s1 > 90)
			{
				p1.sum = p1.sum + 2000;
			}
			if ((p1.yn2 == 'Y') && (p1.s1 > 85))
			{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



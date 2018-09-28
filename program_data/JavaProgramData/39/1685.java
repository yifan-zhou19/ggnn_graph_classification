//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public String name = new String(new char[20]);
	public int score1;
	public int score2;
	public char lead;
	public char west;
	public int paper;
	public int sch;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p0;
		student p1;
		student p2;
		student head;
		int n;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p1 = new student();
		p1.sch = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.score1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.score2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.lead = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p1.west = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p1.paper = Integer.parseInt(tempVar7);
		}
		if ((p1.score1 > 80) && (p1.paper > 0))
		{
			p1.sch = p1.sch + 8000;
		}
		if ((p1.score1 > 85) && (p1.score2 > 80))
		{
			p1.sch = p1.sch + 4000;
		}
		if (p1.score1 > 90)
		{
			p1.sch = p1.sch + 2000;
		}
		if ((p1.score1 > 85) && (p1.west == 'Y'))
		{
			p1.sch = p1.sch + 1000;
		}
		if ((p1.score2 > 80) && (p1.lead == 'Y'))
		{
			p1.sch = p1.sch + 850;
		}
		head = p1;
		p1.next = null;
		for (i = 1;i < n;i++)
		{
			p1 = head;
			p0 = new student();
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p0.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p0.score1 = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p0.score2 = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p0.lead = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar12 != null)
			{
				p0.west = tempVar12.charAt(0);
			}
			String tempVar13 = ConsoleInput.scanfRead(" ");
			if (tempVar13 != null)
			{
				p0.paper = Integer.parseInt(tempVar13);
			}
			p0.sch = 0;
			if ((p0.score1 > 80) && (p0.paper > 0))
			{
				p0.sch = p0.sch + 8000;
			}
			if ((p0.score1 > 85) && (p0.score2 > 80))
			{
				p0.sch = p0.sch + 4000;
			}
			if (p0.score1 > 90)
			{
				p0.sch = p0.sch + 2000;
			}
			if ((p0.score1 > 85) && (p0.west == 'Y'))
			{
				p0.sch = p0.sch + 1000;
			}
			if ((p0.score2 > 80) && (p0.lead == 'Y'))
			{
				p0.sch = p0.sch + 850;
			}
			while ((p0.sch <= p1.sch) && (p1.next != null))
			{
				p2 = p1;
				p1 = p1.next;
			}
			if (p0.sch > p1.sch)
			{
				if (head == p1)
				{
					head = p0;
				}
				else
				{
					p2.next = p0;
				}
				p0.next = p1;
			}
			else
			{
				p1.next = p0;
				p0.next = null;
			}
		}
		k = 0;
		p1 = head;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



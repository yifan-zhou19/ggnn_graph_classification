//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class info
{
	public String name = new String(new char[20]);
	public int final;
	public int ass;
	public char gan;
	public char west;
	public int paper;
	public info next;
}

package <missing>;

public class GlobalMembers
{
	public static info create(int n)
	{
		info p1;
		info p2;
		info head;
		int i;
		p1 = new info();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.name = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.final = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.ass = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar4 != null)
		{
			p1.gan = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.west = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.paper = Integer.parseInt(tempVar6);
		}
		p1.next = null;
		head = p1;
		p2 = p1;
		for (i = 1;i < n;i++)
		{
			p1 = new info();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.name = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p1.final = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.ass = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar10 != null)
			{
				p1.gan = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.west = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.paper = Integer.parseInt(tempVar12);
			}
			p1.next = null;
			p2.next = p1;
			p2 = p1;
		}
		return head;
	}
	public static int Main()
	{
		int n;
		info head;
		info p1;
		int i;
		int m;
		int sum;
		int max;
		String namemax = new String(new char[22]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create(n);

		p1 = head;
		sum = 0;
		max = 0;

		for (i = 0;i < n;i++)
		{
		m = 0;
		if (p1.final > 80 && p1.paper >= 1)
		{
			m += 8000;
		}
		if (p1.final > 85 && p1.ass > 80)
		{
			m += 4000;
		}
		if (p1.final > 90)
		{
			m += 2000;
		}
		if (p1.final > 85 && p1.west == 'Y')
		{
			m += 1000;
		}
		if (p1.ass > 80 && p1.gan == 'Y')
		{
			m += 850;
		}
		if (m > max)
		{
			max = m;
			namemax = p1.name;
		}
		p1 = p1.next;
		}
		p1 = head;
		for (m = 0,i = 0;i < n;i++)
		{
		if (p1.final > 80 && p1.paper >= 1)
		{
			m += 8000;
		}
		if (p1.final > 85 && p1.ass > 80)
		{
			m += 4000;
		}
		if (p1.final > 90)
		{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



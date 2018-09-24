//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class list
{
	public String name = new String(new char[30]);
	public int final;
	public int ave;
	public int article;
	public char member;
	public char west;
	public int sum;
	public list next;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int num;
	public static int total = 0;
	public static String namemax = new String(new char[30]);
	public static int max = 0;

	public static list creat(int n)
	{
		list p1;
		list p2;
		list head;
		int i;
		head = new list();
		p1 = new list();
		head.next = p1;
		p1.next = null;
		p1.sum = 0;
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
			p1.ave = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar4 != null)
		{
			p1.member = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.west = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.article = Integer.parseInt(tempVar6);
		}
		if (p1.final > 80 && p1.article >= 1)
		{
			p1.sum += 8000;
		}
		if (p1.final > 85 && p1.ave > 80)
		{
			p1.sum += 4000;
		}
		if (p1.final > 90)
		{
			p1.sum += 2000;
		}
		if (p1.final > 85 && p1.west == 'Y')
		{
			p1.sum += 1000;
		}
		if (p1.ave > 80 && p1.member == 'Y')
		{
			p1.sum += 850;
		}
		total = total + p1.sum;
		max = p1.sum;
		for (i = 1;i < n;i++)
		{
			p2 = p1;
			p1 = new list();
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
				p1.ave = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar10 != null)
			{
				p1.member = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.west = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.article = Integer.parseInt(tempVar12);
			}
			if (p1.final > 80 && p1.article >= 1)
			{
				p1.sum += 8000;
			}
			if (p1.final > 85 && p1.ave > 80)
			{
				p1.sum += 4000;
			}
			if (p1.final > 90)
			{
				p1.sum += 2000;
			}
			if (p1.final > 85 && p1.west == 'Y')
			{
				p1.sum += 1000;
			}
			if (p1.ave > 80 && p1.member == 'Y')
			{
				p1.sum += 850;
			}
			total = total + p1.sum;
			if (p1.sum > max)
			{
				max = p1.sum;
				namemax = p1.name;
			}
			p2.next = p1;
		}
		p1.next = null;
		return head;
	}

	public static int Main()
	{
		list head;
		list p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



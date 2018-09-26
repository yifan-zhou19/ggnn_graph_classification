//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public String name = new String(new char[20]);
	public int score;
	public int ping;
	public char zhiwu;
	public char xibu;
	public int lun;
	public int money;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat(int n)
	{
		student head;
		student p1;
		student p2;
		int i = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.name = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.score = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.ping = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar4 != null)
		{
			p1.zhiwu = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.xibu = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.lun = Integer.parseInt(tempVar6);
		}

		p1.money = 0;
		if (p1.score > 80 && p1.lun >= 1)
		{
			p1.money = p1.money + 8000;
		}
		if (p1.score > 85 && p1.ping > 80)
		{
			p1.money = p1.money + 4000;
		}
		if (p1.score > 90)
		{
			p1.money = p1.money + 2000;
		}
		if (p1.score > 85 && p1.xibu == 'Y')
		{
			p1.money = p1.money + 1000;
		}
		if (p1.zhiwu == 'Y' && p1.ping > 80)
		{
			p1.money = p1.money + 850;
		}
		head = p1;
		while (i <= n - 1)
		{
			i = i + 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p2.name = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p2.score = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p2.ping = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar10 != null)
			{
				p2.zhiwu = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p2.xibu = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p2.lun = Integer.parseInt(tempVar12);
			}
			p2.money = 0;
			if (p2.score > 80 && p2.lun >= 1)
			{
				p2.money = p2.money + 8000;
			}
			if (p2.score > 85 && p2.ping > 80)
			{
				p2.money = p2.money + 4000;
			}
			if (p2.score > 90)
			{
				p2.money = p2.money + 2000;
			}
			if (p2.score > 85 && p2.xibu == 'Y')
			{
				p2.money = p2.money + 1000;
			}
			if (p2.zhiwu == 'Y' && p2.ping > 80)
			{
				p2.money = p2.money + 850;
			}
			p1.next = p2;
			p1 = p2;
		}
		p1.next = null;
		return (head);
	}
	public static void Main()
	{
		student head;
		student p;
		student t;
		int n;
		int i;
		int max = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		p = head;
		for (i = 1;i <= n;i++)
		{
			sum = sum + p.money;
			if (p.money > max)
			{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



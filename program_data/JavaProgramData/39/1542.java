//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public String name = new String(new char[20]);
	public int qimo;
	public int pingyi;
	public char ganbu;
	public char xibu;
	public int lunwen;
	public int zong;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student head;
	public static student p1;
	public static student p2;
	public static student max;

	public static int zong(student p1)
	{
		int zong = 0;
		student p;
		p = p1;
		if (p.qimo > 80 && p.lunwen >= 1)
		{
			zong += 8000;
		}
		if (p.qimo > 85 && p.pingyi > 80)
		{
			zong += 4000;
		}
		if (p.qimo > 90)
		{
			zong += 2000;
		}
		if (p.qimo > 85 && p.xibu == 'Y')
		{
			zong += 1000;
		}
		if (p.pingyi > 80 && p.ganbu == 'Y')
		{
			zong += 850;
		}
		return zong;
	}

	public static student find(student head)
	{
		student p;
		student max;
		p = head.next;
		max = head;
		while (p != null)
		{
			if (p.zong > max.zong)
			{
				max = p;
			}
			p = p.next;
		}
		return max;
	}


	public static int Main()
	{
		int zong = struct student * p1;
		student find = new student(struct student * head);

		int n;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(Len);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.qimo = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.pingyi = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.ganbu = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p1.xibu = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p1.lunwen = Integer.parseInt(tempVar7);
		}
		p1.zong = zong(p1);
		m += p1.zong;
		n--;
		p1.next = null;

		head = p1;
		p2 = p1;

		while (n != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(Len);
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.qimo = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.pingyi = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.ganbu = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar12 != null)
			{
				p1.xibu = tempVar12.charAt(0);
			}
			String tempVar13 = ConsoleInput.scanfRead(" ");
			if (tempVar13 != null)
			{
				p1.lunwen = Integer.parseInt(tempVar13);
			}
			p1.zong = zong(p1);
			m += p1.zong;
			p1.next = null;
			p2.next = p1;
			p2 = p1;
			n--;
		}

		max = find(head);


//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



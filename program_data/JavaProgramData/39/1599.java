//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class stu
{
 public String id = new String(new char[111]);
 public int qm;
 public int bj;
 public String ganbu = new String(new char[2]);
 public String xibu = new String(new char[2]);
 public int lun;
 public float total;
 public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static stu creat(int h)
	{
		stu head;
		stu p1;
		stu p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(L);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.qm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.bj = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.ganbu = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.xibu = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.lun = Integer.parseInt(tempVar6);
		}
		head = null;
		while (n < h - 1)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(L);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.id = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p1.qm = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.bj = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.ganbu = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				p1.xibu = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.lun = Integer.parseInt(tempVar12);
			}
		}
		p1.next = null;
		p2.next = p1;
		return (head);
	}
	public static void Main()
	{
		int m;
		float s;
		float all = 0F;
		stu f = new stu();
		stu p;
		stu q;
		stu l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		p = creat(m);
		l = p;
		while (p != null)
		{
			p.total = 0F;
			if (p.qm > 80 && p.lun >= 1)
			{
				p.total = p.total + 8000;
			}
			if (p.qm > 85 && p.bj > 80)
			{
				p.total = p.total + 4000;
			}
			if (p.qm > 90)
			{
				p.total = p.total + 2000;
			}
			if (p.qm > 85 && strcmp(p.xibu,"Y") == 0)
			{
				p.total = p.total + 1000;
			}
			if (p.bj > 80 && strcmp(p.ganbu,"Y") == 0)
			{
				p.total = p.total + 850;
			}
			all = all + p.total;
			p = p.next;
		}
		p = l;
		f.total = 0F;
		while (p != null)
		{
			if (p.total > f.total)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: f=*p;
				f.copyFrom(p);
			}
			p = p.next;
		}
		s = f.total;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



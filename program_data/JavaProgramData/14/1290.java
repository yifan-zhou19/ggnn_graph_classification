//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public int id;
	public int yuwen;
	public int shuxue;
	public int total;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static int Main()
	{
		student p0;
		student p1;
		student p2;
		student head;
		student p;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p0 = new student();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p0.id = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p0.yuwen = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p0.shuxue = Integer.parseInt(tempVar4);
		}
		p0.total = p0.yuwen + p0.shuxue;
		head = p0;
		p1 = p0;
		p0 = new student();
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p0.id = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p0.yuwen = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p0.shuxue = Integer.parseInt(tempVar7);
		}
		p0.total = p0.yuwen + p0.shuxue;
		if (p0.total <= p1.total)
		{
			p1.next = p0;
			p1 = p0;
		}
		else
		{
			head = p0;
			p0.next = p1;
		}
		p0 = new student();
		String tempVar8 = ConsoleInput.scanfRead();
		if (tempVar8 != null)
		{
			p0.id = Integer.parseInt(tempVar8);
		}
		String tempVar9 = ConsoleInput.scanfRead(" ");
		if (tempVar9 != null)
		{
			p0.yuwen = Integer.parseInt(tempVar9);
		}
		String tempVar10 = ConsoleInput.scanfRead(" ");
		if (tempVar10 != null)
		{
			p0.shuxue = Integer.parseInt(tempVar10);
		}
		p0.total = p0.yuwen + p0.shuxue;
		if (p0.total <= p1.total)
		{
			p1.next = p0;
			p2 = p0;
		}
		else if (p0.total > p1.total && p0.total <= head.total)
		{
			head.next = p0;
			p0.next = p1;
			p2 = p1;
			p1 = p0;
		}
		else if (p0.total > head.total)
		{
			p0.next = head;
			p2 = p1;
			p1 = head;
			head = p0;
		}
		p2.next = null;
		for (i = 3;i < n;i++)
		{
			p0 = new student();
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				p0.id = Integer.parseInt(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p0.yuwen = Integer.parseInt(tempVar12);
			}
			String tempVar13 = ConsoleInput.scanfRead(" ");
			if (tempVar13 != null)
			{
				p0.shuxue = Integer.parseInt(tempVar13);
			}
			p0.total = p0.yuwen + p0.shuxue;
			if (p0.total > p2.total)
			{
				if (p0.total <= p1.total)
				{
					p1.next = p0;
					p0.next = null;
					p2 = p0;
				}
				else if (p0.total > p1.total && p0.total <= head.total)
				{
					head.next = p0;
					p0.next = p1;
					p1.next = null;
					p1 = p2;
					p0 = p1;
				}
				else if (p0.total > head.total)
				{
					p0.next = head;
					p1.next = null;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



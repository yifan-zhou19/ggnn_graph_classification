//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public int num;
	public int scorec;
	public int scorem;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p0;
		student p1;
		student p2;
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (student)malloc(len);
		head.next = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			head.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			head.scorec = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			head.scorem = Integer.parseInt(tempVar3);
		}
		while (i < 2)
		{
			p1 = head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p0 = (student)malloc(len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p0.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p0.scorec = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p0.scorem = Integer.parseInt(tempVar6);
			}
			while ((p0.scorec + p0.scorem) <= (p1.scorec + p1.scorem) && (p1.next != null))
			{
				p2 = p1;
				p1 = p1.next;
			}
			if ((p0.scorec + p0.scorem) > (p1.scorec + p1.scorem))
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
			i++;
		}
		return (head);
	}
	public static student sort(student head, int n)
	{
		student p0;
		student p1;
		student p2;
		int i = 3;
		while (i < n)
		{
			p1 = head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p0 = (student)malloc(len);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p0.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p0.scorec = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p0.scorem = Integer.parseInt(tempVar3);
			}
			while ((p0.scorec + p0.scorem) <= (p1.scorec + p1.scorem) && (p1.next != null))
			{
				p1 = p1.next;
			}
			if ((p0.scorec + p0.scorem) > (p1.scorec + p1.scorem))
			{

				if (head == p1)
				{
					p2 = p1.next;
					p2.next.num = p2.num;
					p2.next.scorec = p2.scorec;
					p2.next.scorem = p2.scorem;
					p2.num = p1.num;
					p2.scorec = p1.scorec;
					p2.scorem = p1.scorem;
					p1.num = p0.num;
					p1.scorec = p0.scorec;
					p1.scorem = p0.scorem;
				}
				else if (p1 == head.next)
				{
					p1.next.num = p1.num;
					p1.next.scorec = p1.scorec;
					p1.next.scorem = p1.scorem;
					p1.num = p0.num;
					p1.scorec = p0.scorec;
					p1.scorem = p0.scorem;
				}
				else
				{
					p1.num = p0.num;
					p1.scorec = p0.scorec;
					p1.scorem = p0.scorem;
				}
			}
			p0 = null;
			i++;
		}
		return (head);
	}

	public static void Main()
	{
		student head;
		student p1;
		student p2;
		int n;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



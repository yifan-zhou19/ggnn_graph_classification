//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public String a = new String(new char[20]);
	public int chengji;
	public int pingyi;
	public char x;
	public char y;
	public int h;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		n = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.chengji = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.pingyi = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.x = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p1.y = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p1.h = Integer.parseInt(tempVar7);
		}
		head = null;
		do
		{

			if (n == 1)
			{
				head = p1;
				p2 = p1;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (student)malloc(LEN);
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					p1.a = tempVar8.charAt(0);
				}
				String tempVar9 = ConsoleInput.scanfRead(" ");
				if (tempVar9 != null)
				{
					p1.chengji = Integer.parseInt(tempVar9);
				}
				String tempVar10 = ConsoleInput.scanfRead(" ");
				if (tempVar10 != null)
				{
					p1.pingyi = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar11 != null)
				{
					p1.x = tempVar11.charAt(0);
				}
				String tempVar12 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar12 != null)
				{
					p1.y = tempVar12.charAt(0);
				}
				String tempVar13 = ConsoleInput.scanfRead(" ");
				if (tempVar13 != null)
				{
					p1.h = Integer.parseInt(tempVar13);
				}
				p2.next = p1;
				p2 = p1;
			}
			n = n + 1;


		}while (n <= m);
		p2.next = null;
		return (head);
	}
	public static void Main()

	{
		student q;
		student head;
		student p;

		int max;
		int s;
		int sum;
		sum = 0;

		head = creat();
		q = head;

		max = 0;
		while (q != null)
		{
			s = 0;
			if (q.chengji > 80 && (q.h) >= 1)
			{
				s = s + 8000;
			}
			if (q.chengji > 85 && q.pingyi > 80)
			{
				s = s + 4000;
			}
			if (q.chengji > 90)
			{
				s = s + 2000;
			}
			if (q.chengji > 85 && q.y == 'Y')
			{
				s = s + 1000;
			}
			if (q.pingyi > 80 && q.x == 'Y')
			{
				s = s + 850;
			}


			if (s > max)
			{
				max = s;
			}
			sum = sum + s;
			q = q.next;
		}

		p = head;
	 while (p != null)
	 {

			s = 0;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



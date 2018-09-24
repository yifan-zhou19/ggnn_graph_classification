//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public String name = new String(new char[20]);
	public int num1;
	public int num2;
	public char a;
	public char b;
	public int c;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{

		student head;
		student p1;
		student p2;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		int i = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.num1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.num2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.a = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p1.b = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p1.c = Integer.parseInt(tempVar7);
		}
		i = i + 1;
		head = null;
		while (i < n)
		{
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.num1 = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.num2 = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.a = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar12 != null)
			{
				p1.b = tempVar12.charAt(0);
			}
			String tempVar13 = ConsoleInput.scanfRead(" ");
			if (tempVar13 != null)
			{
				p1.c = Integer.parseInt(tempVar13);
			}
			i = i + 1;
		}
		p2.next = p1;
		p1.next = null;

		return (head);
	}



	public static void print(student head)
	{
		student p;
		student max;
		int d = 0;
		p = head;

		if (head != null)
		{
		   while (p != null)
		   {
				p.sum = 0;
			  if (p.num1 > 80 && p.c != 0)
			  {
				  p.sum += 8000;
			  }
			  else
			  {
				  p.sum += 0;
			  }
			  if (p.num1 > 85 && p.num2 > 80)
			  {
				p.sum += 4000;
			  }
			  else
			  {
				  p.sum += 0;
			  }
			  if (p.num1 > 90)
			  {
				p.sum += 2000;
			  }
			  else
			  {
				  p.sum += 0;
			  }
			  if (p.num1 > 85 && p.b == 'Y')
			  {
				p.sum += 1000;
			  }
			  else
			  {
				  p.sum += 0;
			  }
			  if (p.num2 > 80 && p.a == 'Y')
			  {
				p.sum += 850;
			  }
			  else
			  {
				  p.sum += 0;
			  }


			  d += p.sum;
			  p = p.next;
		   }
		}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



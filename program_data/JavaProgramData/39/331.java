//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public String name = new String(new char[20]);
	public int grade_1;
	public int grade_2;
	public char a;
	public char b;
	public int paper;
	public int sum; //the money one get
	public int flag; //1 means the most abudant one
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int j;

	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int i;
		j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.name = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.grade_1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.grade_2 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar4 != null)
		{
			p1.a = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.b = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.paper = Integer.parseInt(tempVar6);
		}

		p1.sum = 0;
		p1.flag = 0;
		if (p1.grade_1 > 80 && p1.paper > 0)
		{
			p1.sum += 8000;
		}
		if (p1.grade_1 > 85 && p1.grade_2 > 80)
		{
			p1.sum += 4000;
		}
		if (p1.grade_1 > 90)
		{
			p1.sum += 2000;
		}
		if (p1.grade_1 > 85 && p1.b == 'Y')
		{
			p1.sum += 1000;
		}
		if (p1.grade_2 > 80 && p1.a == 'Y')
		{
			p1.sum += 850;
		}
	//	printf("%s %d %d %c %c %d %d",p1->name,p1->grade_1,p1->grade_2,p1->a,p1->b,p1->paper,p1->sum);
		head = null;

		for (i = 0;;i++)
		{
			//printf("i = %d\n",i);
			j = j + 1;
			if (j == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			if (i >= n - 1)
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.name = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p1.grade_1 = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.grade_2 = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar10 != null)
			{
				p1.a = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.b = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.paper = Integer.parseInt(tempVar12);
			}

			p1.sum = 0;
			p1.flag = 0;
			if (p1.grade_1 > 80 && p1.paper > 0)
			{
				p1.sum += 8000;
			}
			if (p1.grade_1 > 85 && p1.grade_2 > 80)
			{
				p1.sum += 4000;
			}
			  if (p1.grade_1 > 90)
			  {
				p1.sum += 2000;
			  }
			  if (p1.grade_1 > 85 && p1.b == 'Y')
			  {
				p1.sum += 1000;
			  }
			if (p1.grade_2 > 80 && p1.a == 'Y')
			{
				 p1.sum += 850;
			}
	//    	printf("%s %d %d %c %c %d %d",p1->name,p1->grade_1,p1->grade_2,p1->a,p1->b,p1->paper,p1->sum);
		}
		p2.next = null;
		return (head);
	}


	public static void output(student p)
	{
		int total; // total is all they get
		int i; // max is the most one -> flag ==1
		int max;
		student tmp;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================



public class student
{
	public String xuehao = new String(new char[20]);
	public String name = new String(new char[50]);
	public char sex;
	public int age;
	public float score;
	public String addr = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p1;
		student p2;
		student head;
		student newhead;
		student p3;
		int i = 1;
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		head = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.xuehao = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p1.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.score = Float.parseFloat(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.addr = tempVar6.charAt(0);
		}
		while (i != 0)
		{
			if (n == 0)
			{
				head = p2 = p1;
				n++;
			}
			else
			{
			p2.next = p1;
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			   String tempVar7 = ConsoleInput.scanfRead();
			   if (tempVar7 != null)
			   {
				   p1.xuehao = tempVar7.charAt(0);
			   }
			if (strcmp(p1.xuehao,"end") == 0)
			{
				i = 0;
				p2.next = null;
			}
			else
			{
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					p1.name = tempVar8.charAt(0);
				}
				String tempVar9 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar9 != null)
				{
					p1.sex = tempVar9.charAt(0);
				}
				String tempVar10 = ConsoleInput.scanfRead(" ");
				if (tempVar10 != null)
				{
					p1.age = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead();
				if (tempVar11 != null)
				{
					p1.score = Float.parseFloat(tempVar11);
				}
				String tempVar12 = ConsoleInput.scanfRead(" ");
				if (tempVar12 != null)
				{
					p1.addr = tempVar12.charAt(0);
				}
				n++;
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			p2 = p1 = head;
			 while (p1.next != null)
			 {
				 p2 = p1;
			  p1 = p1.next;
			 }
			 if (i == 0)
			 {
				 newhead = p3 = p1;
			 }
			 else
			 {
				 p3 = p3.next = p1;
			 }
			 p2.next = null;
		}

		p2 = newhead;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s %s %c %d ",p2.xuehao,p2.name,p2.sex,p2.age);
			if (p2.score == (int)(p2.score))
			{
				System.out.printf("%d ",(int)p2.score);
			}
			else
			{
				System.out.printf("%.1f ",p2.score);
			}
			System.out.printf("%s\n",p2.addr);
			p2 = p2.next;
		}
	}





}


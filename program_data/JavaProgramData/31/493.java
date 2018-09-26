public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[20]);
	public String age = new String(new char[20]);
	public String score = new String(new char[20]);
	public String add = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static void Main()
	{
		int i;
		student head;
		student p1;
		student p2;
		student newhead;
		student new;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		} while(strcmp(p1.num,"end")!=0) //built link;
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.age = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
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
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
	}
		p2.next = null;
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
				newhead = new = p1;
			}
			else
			{
				new = new.next = p1;
			}
			p2.next = null;
		}
		p1 = newhead;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s %s %s %s %s %s",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.add);
			p1 = p1.next;
			System.out.print("\n");
		}

	}









}


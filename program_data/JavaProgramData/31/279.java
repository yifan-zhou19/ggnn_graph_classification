public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[2]);
	public String age = new String(new char[20]);
	public String score = new String(new char[10]);
	public String add = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student head;
	public static student p;
	public static void input()
	{
		head = null;
		int n = 0;
		do
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (student)malloc(LEN);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.num = tempVar.charAt(0);
			}
			if (p.num.charAt(0) == 'e')
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.age = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p.add = tempVar6.charAt(0);
			}
			n++;
			if (n == 1)
			{
				p.next = null;
			}
			else
			{
				p.next = head;
			}
			head = p;
		}while (1 != 0);
		p = head;
	}
	public static void output()
	{
			if (head != null)
			{
			do
			{
				System.out.printf("%s %s %s %s %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.add);
				p = p.next;
			}while (p != null);
			}
	}
	public static void Main()
	{
		input();
		output();
	}

}


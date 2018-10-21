public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[50]);
	public String add = new String(new char[20]);
	public student before;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(len);
		p1.before = null;
		p2 = p1;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (p1.num.charAt(0) == 'e')
			{
				head = p2;
				p1 = null;
				return (head);
			}
			else
			{
				String tempVar2 = ConsoleInput.scanfRead();
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
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					p1.score = tempVar5.charAt(0);
				}
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					p1.add = tempVar6.charAt(0);
				}
				p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (student)malloc(len);
				p1.before = p2;
			}
		} while (1 != 0);
	}
	public static void Main()
	{
		student head1 = creat();
		student q = head1;
		while (q != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",q.num,q.name,q.sex,q.age,q.score,q.add);
			q = q.before;
		}
	}

}


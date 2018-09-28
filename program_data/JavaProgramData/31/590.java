public class Student
{
	public String num = new String(new char[10]);
	public String name = new String(new char[25]);
	public char sex;
	public int age;
	public float score;
	public String add = new String(new char[15]);
	public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Student creat = new Student();
		Student head;
		Student p;
		head = creat();
		p = head;
		while (p.next != null)
		{
			System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.score,p.add);
			p = p.next;
		}
		System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.score,p.add);
	}
	public static Student creat()
	{
		Student head;
		Student news;
		int i;
		head = null;
		for (i = 0;;i++)
		{
			news = new Student();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				news.num = tempVar.charAt(0);
			}
			if (news.num.charAt(0) == 'e')
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				news.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				news.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				news.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				news.score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				news.add = tempVar6.charAt(0);
			}
			news.next = head;
			head = news;
		}
		return (head);
	}
}


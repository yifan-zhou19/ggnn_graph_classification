public class stu
{
		public String xh = new String(new char[10]);
		public String name = new String(new char[20]);
		public char xb;
		public int age;
		public String score = new String(new char[20]);
		public String add = new String(new char[20]);
		public stu next;
}

package <missing>;

public class GlobalMembers
{
		public static stu creat()
		{
		stu head;
		stu p1;
		stu p2;
		int n = 0;
		p1 = p2 = new stu();
		head = null;
		while (strcmp(p1.xh,"end") != 0)
		{
			n++;
			if (n == 1)
			{
				p1.next = null;
				head = p1;
			}
			else
			{
				p2 = p1;
				p1 = new stu();
				p1.next = p2;
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.xh = tempVar.charAt(0);
			}
			if (strcmp(p1.xh,"end") == 0)
			{
				head = p2;
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.xb = tempVar3.charAt(0);
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
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
		}
		return (head);
		}
	public static void print(stu head)
	{
		stu p;
		p = head;
		while (p != 0)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.xh,p.name,p.xb,p.age,p.score,p.add);
			p = p.next;
		}
	}
		public static void Main()
		{
			stu head;
			head = creat();
			print(head);
		}

}


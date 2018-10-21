public class Student
{
		public String num = new String(new char[10]);
		public String nam = new String(new char[20]);
		public String sex = new String(new char[2]);
		public String age = new String(new char[3]);
		public String sco = new String(new char[6]);
		public String add = new String(new char[12]);
		public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static Student creat()
	{
		Student head;
		Student p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (Student)malloc(LEN);
		head = null;
		n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.num = tempVar.charAt(0);
		}
		while (strcmp(p.num,"end") != 0)
		{
			n = n + 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.nam = tempVar2.charAt(0);
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
				p.sco = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p.add = tempVar6.charAt(0);
			}
			if (n == 1)
			{
				head = p;
			}
			else
			{
				p.next = head;
				head = p;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (Student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p.num = tempVar7.charAt(0);
			}
		}

		return (head);
	}
	public static int Main()
	{
		Student pt;
		pt = creat();
		while (pt != null)
		{
			System.out.printf("%s %s %s %s %s %s\n",pt.num,pt.nam,pt.sex,pt.age,pt.sco,pt.add);
			pt = pt.next;
		}
		return 0;
	}

}


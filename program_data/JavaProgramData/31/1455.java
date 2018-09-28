public class info
{
	public String id = new String(new char[30]);
	public String name = new String(new char[30]);
	public char gen;
	public int age;
	public float grade;
	public String add = new String(new char[30]);
	public info next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static info creat()
	{
		info head;
		info p1;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = (info)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.id = tempVar.charAt(0);
		}
		while (strcmp(p1.id,"end"))
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.gen = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.grade = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
			n = n + 1;
			if (n == 1)
			{
				head = p1;
				p1.next = null;
			}
			else
			{
				p1.next = head;
			}
			head = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (info)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.id = tempVar7.charAt(0);
			}
		};
		return (head);
	}

	public static void print(info head)
	{
		info p;
		p = head;
		if (head != null)
		{
			do
			{
				System.out.printf("%s %s %c %d %g %s\n",p.id,p.name,p.gen,p.age,p.grade,p.add);
				p = p.next;
			}while (p != null);
		}
	}

	public static void Main()
	{
		info head;
		head = creat();
		print(head);
	}
}


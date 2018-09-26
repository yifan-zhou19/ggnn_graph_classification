public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char gender;
	public int age;
	public String score = new String(new char[20]);
	public String add = new String(new char[200]);
	public student prev;
	public student next; //????????????
}

package <missing>;

public class GlobalMembers
{
	public static student head = null;
	public static student tail = null;
	public static void add_node(tangible.RefObject<String> a, tangible.RefObject<String> b, char c, int d, tangible.RefObject<String> e, tangible.RefObject<String> f)
	{
		if (head == 0)
		{
			head = tail = new student(); //???????
			tail.next = tail.prev = null;
		}

		else
		{
			student tmp = tail;
			tail = tail.next = new student();
			tail.prev = tmp;
			tail.next = null;
		}

		tail.num = a.argValue;
		tail.name = b.argValue;
		tail.add = f.argValue;
		tail.score = e.argValue;
		tail.gender = c;
		tail.age = d;
	}

	public static void print() //????????
	{
		while (tail != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",tail.num,tail.name,tail.gender,tail.age,tail.score,tail.add);
			tail = tail.prev;
		}
	}

	public static int Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		char c;
		int d;
		String e = new String(new char[20]);
		String f = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		while (strcmp(a,"end"))
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				c = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				d = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				e = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				f = tempVar6.charAt(0);
			}
		tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		tangible.RefObject<String> tempRef_e = new tangible.RefObject<String>(e);
		tangible.RefObject<String> tempRef_f = new tangible.RefObject<String>(f);
			add_node(tempRef_a, tempRef_b, c, d, tempRef_e, tempRef_f);
			f = tempRef_f.argValue;
			e = tempRef_e.argValue;
			b = tempRef_b.argValue;
			a = tempRef_a.argValue;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a = tempVar7.charAt(0);
			}
		}
		print();
		return 0;
	}
}


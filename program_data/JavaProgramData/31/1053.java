public class node
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char gender;
	public int age;
	public String score = new String(new char[10]);
	public String addr = new String(new char[20]);
	public node next;
	public node back;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String scan = new String(new char[100]);
		final String constant = "end";
		node beginning = new node();
		node head;
		node p;
		node ending;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		node * t = new node();
		int count = 1;
		int i;
		head = beginning;
		beginning.next = null;
		beginning.back = null;
		p = head;
		ending = p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			beginning.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			beginning.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			beginning.gender = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			beginning.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			beginning.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			beginning.addr = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			scan = tempVar7.charAt(0);
		}
		while (strcmp(scan,constant) != 0)
		{
			p.next = new node();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=p;
			t.copyFrom(p);
			p = p.next;
			p.num = scan;
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				p.gender = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				p.score = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p.addr = tempVar12.charAt(0);
			}
			p.back = t;
			ending = p;
			String tempVar13 = ConsoleInput.scanfRead();
			if (tempVar13 != null)
			{
				scan = tempVar13.charAt(0);
			}
			count++;
		}
		p = ending;
		for (i = 1;i <= count;i++)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.gender,p.age,p.score,p.addr);
			p = p.back;
		}
	}

}


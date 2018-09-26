public class student
{
	public String id = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[20]);
	public String address = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static student creat()
	{
	student head;
	student pf;
	student ps;
	pf =  new student();
	ps = pf;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		pf.id = tempVar.charAt(0);
	}
	while (pf.id.charAt(0) != 'e')
	{
		n++;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			pf.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			pf.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			pf.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			pf.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			pf.address = tempVar6.charAt(0);
		}
		if (n != 1)
		{
			pf.next = ps;
			ps = pf;
		}
		else
		{
			pf.next = null;
		}
		pf = new student();
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			pf.id = tempVar7.charAt(0);
		}
	}
	head = ps;
	return head;
	}
	public static void print(student head)
	{
		int i;
		student p;
		p = head;
		if (head != null)
		{
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.id,p.name,p.sex,p.age,p.score,p.address);
			p = p.next;
		}
		}
	}
	public static void Main()
	{
	student head;
	head = creat();
	print(head);
	}

}


public class student
{
	public String number = new String(new char[100]);
	public String name = new String(new char[100]);
	public char sex;
	public int age;
	public String score = new String(new char[100]);
	public String address = new String(new char[100]);
	public student prev;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student phead;
		student p;
		student q;
		String m = new String(new char[10]);
		phead = new student();
		phead.prev = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = tempVar.charAt(0);
		}
		q = phead;
		do
		{
			p = new student();
			p.number = m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p.address = tempVar6.charAt(0);
			}
			p.prev = q;
			q.next = p;
			q = q.next;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				m = tempVar7.charAt(0);
			}
		} while (strcmp(m,"end") != 0);
		q.next = null;
		p = phead;
		while (p.next != null)
		{
			p = p.next;
		}
		while (p != phead)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.number,p.name,p.sex,p.age,p.score,p.address);
			p = p.prev;
		}
	}

}


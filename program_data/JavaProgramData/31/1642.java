public class student
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[20]);
	public String address = new String(new char[50]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student head;
		student p;
		student q;
		student t;
		t = new student();
		t.next = null;
		head = new student();
		head.next = null;
		int i;
		for (i = 0;;i++)
		{
			p = head.next;
			q = new student();
			q.next = null;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				q.num = tempVar.charAt(0);
			}
			if (q.num.charAt(0) == 'e')
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				q.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				q.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				q.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				q.address = tempVar6.charAt(0);
			}
			t.next = p;
			head.next = q;
			q.next = p;
		}
		head.next = p;
		while (p != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.address);
			p = p.next;
		}
	}

}


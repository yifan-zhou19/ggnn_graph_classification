public class student
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public String gender = new String(new char[2]);
	public int year;
	public String score = new String(new char[10]);
	public String ad = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int count = 0;
		student head;
		student p1;
		student p2;
		student p;
		student q;
		student temp;
		for (i = 1;i <= 10000;i++)
		{
			p1 = new student();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (strcmp(p1.num,"end") == 0)
			{
				head = temp;
				break;
			}
			else if (i == 1)
			{
				p1.next = null;
				p2 = p1;
				temp = p1;
			}
			else
			{
				p1.next = p2;
				p2 = p1;
				temp = p1;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.gender = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.year = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.ad = tempVar6.charAt(0);
			}
			count = count + 1;
		}
		for (i = 1;i <= count;i++)
		{
			if (i == 1)
			{
				p = head;
			}
			System.out.printf("%s %s %s %d %s %s\n",p.num,p.name,p.gender,p.year,p.score,p.ad);
			p = p.next;
			if (p == null)
			{
				break;
			}
		}


		return 0;
	}

}


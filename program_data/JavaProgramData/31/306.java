public class student
{
	public String num = new String(new char[20]);
	public String na = new String(new char[30]);
	public String sex = new String(new char[2]);
	public String sc = new String(new char[10]);
	public String old = new String(new char[3]);
	public String ad = new String(new char[20]);

	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static void Main()
	{
		student head;
		student p1;
		student p2;
		student p;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		head = null;
		while (scanf("%s",p1.num),p1.num.charAt(0) != 'e')
		{

			n = n + 1;
			head = p1;
			if (n > 1)
			{
			   p1.next = p2;
			}
			else
			{
			   p1.next = null;
			}
			p2 = p1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.na = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.old = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.sc = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.ad = tempVar5.charAt(0);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);

		}

		p = head;
		while (p != null)
		{
			System.out.printf("%s %s %s %s %s %s\n",p.num,p.na,p.sex,p.old,p.sc,p.ad);
			p = p.next;
		};
	}
}


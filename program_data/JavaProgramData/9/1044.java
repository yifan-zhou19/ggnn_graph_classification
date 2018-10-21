public class stu
{
	public String num = new String(new char[20]);
public int score;
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void sort(stu head, stu q)
	{
		stu pre = head;
		stu p = pre.next;
		stu s;
		s = new stu();
		s.score = q.score;
		s.num = q.num;
		s.next = null;
		if (s.score >= 60)
		{
		while ((p != null) && (q.score <= p.score))
		{
			pre = p;
			p = p.next;
		}
		pre.next = s;
		s.next = p;
		}
		else
		{
			while ((p != null))
			{
			pre = p;
			p = p.next;
			}
		pre.next = s;
		s.next = p;
		}
	}
	public static void print(stu head)
	{
		stu p;
		int i = 0;
		p = head;
		while (p != null)
		{


			System.out.printf("%s\n",p.num);
			p = p.next;
		}

	}
	public static int Main()
	{
		int n;
		int k;
		int i;
		stu head;
		stu p;
		head = new stu();
		head.next = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			 p = new stu();
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 p.num = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 p.score = Integer.parseInt(tempVar3);
			 }
			 sort(head, p);
		}
		print(head.next);

	}

}


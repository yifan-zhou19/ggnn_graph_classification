public class integ
{
	public char num;
	public integ next;
}

package <missing>;

public class GlobalMembers
{
	public static integ head;
	public static integ p1;
	public static integ p2;
	public static integ p3;
	public static integ newhead;
	public static void Main()
	{
		int i;
		int n = 0;
		p1 = p2 = new integ();
		head = null;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (p1.num < 48 || p1.num>57)
			{
				break;
			}
			n++;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			p1 = new integ();
		}
		p2.next = null;
		for (i = 0;i < n;i++)
		{
			p1 = head;
			while (p1.next != null)
			{
				p2 = p1;
				p1 = p1.next;
			}
			if (i == 0)
			{
				p3 = newhead = p1;
			}
			else
			{
				p3 = p3.next = p1;
			}
			p2.next = null;
		}
		for (p1 = newhead;p1 != null;p1 = p1.next)
		{
			System.out.printf("%c",p1.num);
		}
	}
}


public class stu
{
	public String xinxi = new String(new char[100]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int len = 1;
		int i;
		stu p1;
		stu p2;
		stu head;
		stu new1;
		stu newhead;
		p1 = p2 = head = new stu();
		p1.xinxi = new Scanner(System.in).nextLine();
		while (strcmp(p1.xinxi,"end") != 0)
		{
			p1 = new stu();
			p1.xinxi = new Scanner(System.in).nextLine();
			if (strcmp(p1.xinxi,"end") == 0)
			{
				p2.next = null;
			}
			else
			{
				p2.next = p1;
				p2 = p1;
				len++;
			}
		}
		p1 = head;
		for (i = 0;i < len;i++)
		{
			p2 = p1 = head;
			while (p1.next != '\0')
			{
				p2 = p1;
				p1 = p1.next;
			}
			if (i == 0)
			{
				newhead = new1 = p1;
			}
			else
			{
				new1 = new1.next = p1;
			}
			p2.next = null;
		}
		p1 = newhead;
		for (i = 0;i < len;i++)
		{
			System.out.printf("%s\n",p1.xinxi);
			p1 = p1.next;
		}
	}
}

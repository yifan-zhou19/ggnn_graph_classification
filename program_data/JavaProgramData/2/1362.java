public class books
{
	public int num;
	public String writer = new String(new char[26]);
	public books next;
}

package <missing>;

public class GlobalMembers
{
	public static int m;

	public static books creat()
	{
		books head;
		books p1;
		books p2;
		int i;
		p2 = p1 = new books();
		for (i = 1;i <= m;i++)
		{
			if (i == 1)
			{
				head = p1;
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.writer = tempVar2.charAt(0);
			}
			p2 = p1;
			if (i != m)
			{
				p1 = new books();
				p2.next = p1;
			}
			else
			{
				p2.next = null;
			}
		}
		return head;
	}

	public static void Main()
	{
		int[] character = new int[26];
		books head;
		books p;
		int i;
		int max = 0;
		int imax;
		for (i = 0;i < 26;i++)
		{
			character[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = creat();
		p = head;
		while (true)
		{
			i = 0;
			while (*(p.writer.Substring(i)))
			{
				character[*(p.writer.Substring(i)) - 'A']++;
				i++;
			}
			p = p.next;
			if (p == null)
			{
				break;
			}
		}

		for (i = 0;i < 26;i++)
		{
			if (character[i] > max)
			{
				max = character[i];
				imax = i;
			}
		}

		System.out.printf("%c\n%d\n",imax + 'A',max);

		p = head;
		while (true)
		{
			i = 0;
			while (*(p.writer.Substring(i)))
			{
				if (*(p.writer.Substring(i)) == imax + 'A')
				{
					System.out.printf("%d\n",p.num);
					break;
				}
				i++;
			}
			p = p.next;
			if (p == null)
			{
				break;
			}
		}
	}








}


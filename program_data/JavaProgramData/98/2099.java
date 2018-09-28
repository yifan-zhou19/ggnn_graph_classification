public class word
{
	public String vol = new String(new char[40]);
	public int len;
	public word next;
}

package <missing>;

public class GlobalMembers
{
	public static word create(int n)
	{
		word p1;
		word p2;
		word head;
		int i;
		for (i = 0;i < n;i++)
		{
			p1 = new word();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.vol = tempVar.charAt(0);
			}
			p1.len = p1.vol.length() + 1;
			if (i == 0)
			{
				head = p1;
				p2 = p1;
			}
			else
			{
				p2.next = p1;
				p2 = p1;
			}
		}
		p1.next = null;
		return head;
	}
	public static void print(word head, int n)
	{
		word pa;
		int count = 0;
		pa = head;
		while (n != 0)
		{
			if (count == 0)
			{
				System.out.printf("%s",pa.vol);
				count += pa.len;
				pa = pa.next;
				if (pa != null)
				{
				count += pa.len;
				}
			}
			else if (count <= 81 && count != 0)
			{
				System.out.printf(" %s",pa.vol);
				pa = pa.next;
				if (pa != null)
				{
				count += pa.len;
				}
			}
			else if (count > 81)
			{
				System.out.printf("\n%s",pa.vol);
				count = pa.len;
				pa = pa.next;
				if (pa != null)
				{
				count += pa.len;
				}
			}
			n--;
		}
	}
	public static int Main()
	{
		int n;
		word head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create(n);
		print(head, n);
		return 0;
	}
}


public class book
{
	public int num;
	public String aut = new String(new char[27]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static book creat(int amount)
	{
		book head;
		book p1;
		book p2;
		n = 0;
		p1 = new book();
		p2 = p1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.aut = tempVar2.charAt(0);
		}
		while (n < amount - 1)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			p1 = new book();
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.aut = tempVar4.charAt(0);
			}
		}
		p2.next = p1,p1.next = null;
		return (head);
	}
	public static int Main()
	{
		int amount;
		int i;
		int[] a = new int[26];
		int max;
		int maxn;
		book p;
		book headp;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * auth;
		char[] name = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			amount = Integer.parseInt(tempVar);
		}
		p = creat(amount);
		headp = p;
		for (p = headp;p != null;p = p.next)
		{
			for (auth = p.aut; * auth != '\0';auth++)
			{
				for (i = 0;i < 26;i++)
				{
					if (name[i] == *auth)
					{
						break;
					}
				}
				a[i] = a[i] + 1;
			}
		}
		for (i = 0,max = a[0],maxn = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i],maxn = i;
			}
		}
		System.out.printf("%c\n%d\n",name[maxn],max);
		for (p = headp;p != null;p = p.next)
		{
			for (auth = p.aut; * auth != '\0';auth++)
			{
				if (*auth == name[maxn])
				{
					break;
				}
			}
			if (*auth == '\0')
			{
				;
			}
			else
			{
				System.out.printf("%d\n",p.num);
			}
		}
	}
}


public class st
{
	public String name = new String(new char[27]);
	public int num;
	public st next;
}

package <missing>;

public class GlobalMembers
{
	public static int[] pp = new int[26];

	public static st creat(int m)
	{
		st head;
		st p1;
		st p2;
		int i;
		int j;
		p1 = new st();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		for (j = 0;;j++)
		{
			if (Character.isUpperCase(p1.name.charAt(j)))
			{
				pp[p1.name.charAt(j) - 65]++;
			}
				else
				{
					break;
				}
		}
		p2 = p1;
		head = p1;
		for (i = 1;i < m;i++)
		{
			p1 = new st();
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.name = tempVar4.charAt(0);
			}
			for (j = 0;;j++)
			{
				if (Character.isUpperCase(p1.name.charAt(j)))
				{
					pp[p1.name.charAt(j) - 65]++;
				}
					else
					{
						break;
					}
			}
			p1.next = null;
			p2.next = p1;
			p2 = p1;
		}
		return (head);
	}


	public static void Main()
	{
		st creat = new st();
		st head;
		st p;
		int n;
		int i;
		int max;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		p = head;
		max = 0;
		for (i = 1;i < 26;i++)
		{
			if (pp[i] > pp[max])
			{
				max = i;
			}
		}
		System.out.printf("%c\n%d\n",max + 65,pp[max]);
		while (p != null)
		{
			for (j = 0;;j++)
			{
				if (Character.isUpperCase(p.name.charAt(j)))
				{
					if (p.name.charAt(j) == (max + 65))
					{
						System.out.printf("%d\n",p.num);
					}
				}
				else
				{
					break;
				}
			}
			p = p.next;
		}


	}
}


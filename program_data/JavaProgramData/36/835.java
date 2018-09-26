package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int check = new int(char a1[],char a2[]);
		String a1 = new String(new char[100]);
		String a2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a2 = tempVar2.charAt(0);
		}
		int m;
		int n;
		int re;
		m = a1.length();
		n = a2.length();
		if (m != n)
		{
			System.out.print("NO\n");
		}
		else
		{
			re = check(a1, a2);
		}
		if (re == 1)
		{
			System.out.print("YES\n");
		}
		else if (re == 0)
		{
			System.out.print("NO\n");
		}
	}
	public static int check(String a1, String a2)
	{
		int i = 0;
		int j = 0;
		int re;
		int[] c1 = new int[100];
		int[] c2 = new int[100];
		int m;
		int p = 0;
		m = a1.length();
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (a1[i].equals(a1[j]))
				{
					c1[i]++;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (a2[i].equals(a2[j]))
				{
					c2[i]++;
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (a1[i].equals(a2[j]))
				{
					if (c1[i] == c2[j])
					{
						p++;
						break;
					}
				}
			}
		}
		if (p >= m)
		{
			re = 1;
		}
		else
		{
			re = 0;
		}
		return (re);
	}





}


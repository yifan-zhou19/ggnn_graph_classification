package <missing>;

public class GlobalMembers
{
	public static void minus(String p, String a)
	{
		int m;
		int n;
		int i;
		int j;
		m = p.length();
		n = a.length();
		for (i = n - 1;i >= 0;i--)
		{
			if (p[m - n + i].compareTo(a[i]) >= 0)
			{
				p[m - n + i] = p[m - n + i] - a[i].Substring(48);
			}
			else
			{
				for (j = m - n + i - 1;j >= 0;j--)
				{
					if (p[j].equals(48))
					{
						p[j] = 57;
					}
					else
					{
						p[j] -= 1;
						break;
					}
				}
				p[m - n + i] = p[m - n + i] - a[i].Substring(58);
			}
		}
		for (i = 0;i < m;i++)
		{
			if (!p[i].equals(48))
			{
				break;
			}
		}
		for (j = 0;j < m - i;j++)
		{
			p[j] = p[j + i];
		}
	}

	public static void Main()
	{
		int n;
		int i;
		String pass = new String(new char[110]);
		String act = new String(new char[110]);
		char[][] res = new char[100][110];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pass = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				act = tempVar3.charAt(0);
			}
			minus(pass, act);
			res[i] = pass;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",res[i]);
		}
	}


}


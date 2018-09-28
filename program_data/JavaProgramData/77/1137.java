package <missing>;

public class GlobalMembers
{
	public static int f(String s, int l)
	{
		int u;
		for (u = 0;u < l;u++)
		{
			if (!s[u].equals(' '))
			{
				return 1;
			}
		}
		return 0;
	}

	public static void peidui(String s, int l, int[] a, int[] b, char boy)
	{
		int u;
		int flag;
		int k;
		int ii;
		for (u = 0;u < l;u++)
		{
			if (s[u].equals(boy) && !s[u + 1].equals(boy)) //?????????????
			{
				for (k = u + 1;k < l;k++)
				{
					if (s[k].equals(boy))
					{
						flag = 0;
						break;
					} //????????
					if (!s[k].equals(boy) && !s[k].equals(' ')) //??????
					{
						s[u] = ' ';
						s[k] = ' ';
						for (ii = 0;;ii++)
						{
							if (a[ii] == -1)
							{
							a[ii] = u;
							b[ii] = k;
							break;
							} //????????????a?b?
						}
							break;
					}
				}
			}
		}

	}

	public static void Main()
	{
		String s = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int l;
		char boy;
		boy = s.charAt(0);
		l = s.length(); //?????
		int[] a = new int[51];
		int[] b = new int[51];
		int i;
		for (i = 0;i < 51;i++)
		{
			a[i] = b[i] = -1;
		}
		while (f(s, l) != 0) //?????????
		{
			peidui(s, l, a, b, boy);
		}
		int pp;
		int x;
		int y;
		int z;
		for (x = 1;x <= l / 2 - 1;x++)
		{
			for (y = 0;y <= l / 2 - 1 - x;y++)
			{
				if (b[y] > b[y + 1])
				{
					z = b[y];
					b[y] = b[y + 1];
					b[y + 1] = z;
					z = a[y];
					a[y] = a[y + 1];
					a[y + 1] = z;
				}
			}
		}
		for (pp = 0;;pp++)
		{
			if (a[pp] == -1)
			{
				break;
			}
			else
			{
				System.out.printf("%d %d\n",a[pp],b[pp]);
			}
		}
	}




}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int min;
		int get;
		String a = new String(new char[100010]);
		int[] b = new int[26];
		int[] c = new int[26];
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
				a = tempVar2.charAt(0);
			}
			for (j = 0;j < 26;j++)
			{
				b[j] = 0;
			}
			for (j = 0;j < 26;j++)
			{
				c[j] = 0;
			}
			for (j = 0;;j++)
			{
				if (a.charAt(j) == '\0')
				{
					break;
				}
				b[a.charAt(j) - 'a'] += 1;
			}
			for (j = 0;j < 26;j++)
			{
				if (b[j] == 1)
				{
					for (k = 0;;k++)
					{
						if ((a.charAt(k) - 'a') == j)
						{
							c[j] = k;
							break;
						}
					}
				}
				else
				{
					c[j] = -1;
				}
			}
			get = 0;
			for (j = 0;j < 26;j++)
			{
				if (c[j] != -1)
				{
					min = j;
					break;
				}
			}
			for (j = 0;j < 26;j++)
			{
				if (c[j] == -1)
				{
					continue;
				}
				else
				{
					get = 1;
					if (c[j] < c[min])
					{
						min = j;
					}
				}
			}
			if (get == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.printf("%c\n",min + 'a');
			}
		}
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[100];
		int l = 0;
		char[][] s =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[] m = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char p;
		int i = 0;
		int j = 0;
		int k = 0;
		int t = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i] = tempVar3.charAt(0);
			}
		}
		for (i = 'A';i <= 'Z';i++)
		{
			m[j] = i;
			for (t = 0;t < n;t++)
			{
				for (k = 0;s[t][k] != '\0';k++)
				{
					if (s[t][k] == m[j])
					{
					  c[j]++;
					  break;
					}
				}
			}
			j++;
		}
		l = 0;
		for (i = 0;i < 26;i++)
		{
			if (c[i] > l)
			{
				l = c[i];
				p = m[i];
			}
		}
		System.out.printf("%c\n",p);
		System.out.printf("%d\n",l);
		for (i = 0;i < n;i++)
		{
			k = 0;
			for (j = 0;s[i][j] != '\0';j++)
			{
				if (s[i][j] == p)
				{
					k = 1;
					break;
				}
			}
			if (k == 1)
			{
				System.out.printf("%d\n",a[i]);
			}
		}
		return 0;
	}
}


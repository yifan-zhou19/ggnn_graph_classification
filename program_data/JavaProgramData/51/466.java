package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[502]);
		final String z = "";
		int[] b = new int[502];
		int i;
		int j;
		int k;
		int l;
		int n;
		int p;
		int f;
		int m = 1;
		int S = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		l = s.length();

	for (i = 0;i <= l - n;i++)
	{
		if (b[i] != 0)
		{
			continue;
		}
		p = 0;
		for (j = 0;j <= l - n;j++)
		{
			if (b[j] != 0)
			{
				continue;
			}
			f = 1;
			for (k = 0;k < n;k++)
			{
				if (s.charAt(i + k) != s.charAt(j + k))
				{
				f = 0;
				break;
				}
			}
			if (f != 0)
			{
				p++;
				b[j] = 1;
			}
		}
	if (p > m)
	{
		m = p;
		for (k = 0;k < n;k++)
		{
			z.charAt(1)[k] = s.charAt(i + k);
		}
		z.charAt(1)[n] = '\0';
		S = 2;
	}
	else if (p == m)
	{
		for (k = 0;k < n;k++)
		{
			z.charAt(S)[k] = s.charAt(i + k);
		}
		z.charAt(S)[n] = '\0';
		S++;
	}
	}
	if (m == 1)
	{
		System.out.print("NO\n");
	}
	else
	{
	System.out.printf("%d\n",m);
	for (i = 1;i < S;i++)
	{
		System.out.printf("%s\n",z.charAt(i));
	}
	}
	}
}


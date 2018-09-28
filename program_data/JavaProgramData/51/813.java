package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[400]);
		char[][] b = new char[400][6];
		int k;
		int i;
		int j = 0;
		int n;
		int m = 1;
		int q = 0;
		String p;
		String w = new String(new char[6]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		n = a.length();
		p = a;
		w = b;
		for (i = 0;i < n - k + 1;i++)
		{
			for (j = 0;j < k;j++)
			{
				*(*(w.Substring(i)) + j) = *(p.Substring(i) + j);

			}
			*(*(w.Substring(i)) + j) = '\0';
		}
		for (j = 0;j < n - k;j++)
		{
			m = 0;
			for (i = j;i < n - k + 1;i++)
			{
				if (strcmp(*(w.Substring(j)),*(w.Substring(i))) == 0)
				{
					m = m + 1;
				}
			}
			if (m > q)
			{
				q = m;
			}


		}
		if (q == 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",q);
		for (j = 0;j < n - k;j++)
		{
			m = 0;
			for (i = j;i < n - k + 1;i++)
			{
				if (strcmp(*(w.Substring(j)),*(w.Substring(i))) == 0)
				{
					m = m + 1;
				}
			}
			if (m == q)
			{
				System.out.printf("%s\n",*(w.Substring(j)));
			}

		}
		}
	}
}


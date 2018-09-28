package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int k = 0;
		String s = new String(new char[600]);
		char[][] a = new char[500][6];
		int[] b = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[k][j] = s.charAt(i + j);
			}
			k++;

		}
		for (i = 0;i < l - n;i++)
		{
			int p = 1;
			for (j = i + 1;j < l - n + 1;j++)
			{
				if (strcmp(a[i],a[j]) == 0)
				{
					p++;
				}
			}
			b[i] = p;
		}
		int m = 0;
		for (i = 0;i < l - n;i++)
		{
			if (b[i] > m)
			{
				m = b[i];
			}
		}
		if (m == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",m);
			for (i = 0;i < l - n;i++)
			{
				if (b[i] == m)
				{
					System.out.println(a[i]);
					System.out.print("\n");
				}

			}
		}
		return 0;
	}
}


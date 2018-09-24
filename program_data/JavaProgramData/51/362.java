package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String str = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		str = new Scanner(System.in).nextLine();
		char[][] ste = new char[500][500];
		int[] a = new int[500];
		int i;
		int j;
		int m;
		int k = 0;
		m = str.length();
		for (i = 0;i <= m - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				ste[i][j] = str.charAt(j + i);
			}
			ste[i][n] = '\0';
		}
		int max = 0;
		for (i = 0;i <= m - n;i++)
		{
			for (j = i;j <= m - n;j++)
			{
				if (strcmp(ste[i],ste[j]) == 0)
				{
					a[i] += 1;
				}
				if (a[i] > max)
				{
					max = a[i];
				}
			}
		}
			if (max == 1)
			{
				System.out.print("NO");
			}
			else
			{
				System.out.printf("%d\n",max);


	for (i = 0;i <= m - n;i++)
	{
		if (a[i] == max)
		{
			System.out.println(ste[i]);
		}
	}
			}
	return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static String x = new String(new char[5]);
	public static int Main()
	{
		void copy(char x.charAt(5),char a);
		int n;
		int l;
		int i;
		int j;
		int max;
		String a = new String(new char[600]);
		int[] count = new int[500];
		int[] alo = new int[500];
		char[][] com = new char[500][5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		l = a.length() - 1;
		for (i = 0;i <= 499;i++)
		{
			alo[i] = i;
		}
		for (i = 0;i + n - 1 <= l;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				*(*(com + i) + j) = *(a.Substring(i) + j);
			}
			*(*(com + i) + j) = '\0';
		}
		for (i = 0;i + n - 1 <= l;i++)
		{
			for (j = i;j + n - 1 <= l;j++)
			{
				if (strcmp(*(com + j),*(com + i)) == 0)
				{
					(count[i])++;
				}
			}
		}
		max = (count + 0);
		for (i = 0;i + n - 1 < l;i++)
		{
			if (max < count[i])
			{
				max = (count + i);
			}
		}
		if (max != 1)
		{
		System.out.printf("%d\n",max);
		}
		else
		{
			System.out.print("NO");
			return 0;
		}
		for (i = 0;i + n - 1 < l;i++)
		{
			if (count[i] == max)
			{
				System.out.printf("%s\n",*(com + i));
			}
		}
		return 0;
	}

}


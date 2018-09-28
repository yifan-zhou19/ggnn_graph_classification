package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		char[][] b = new char[500][5];

		int i;
		int n;
		int k = 0;
		int m;
		int j;
		int[] count = new int[500];
		int[] mark = new int[500];
		int max = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n - m + 1;i++)
		{
			for (j = 0;j < m;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
			b[i][j] = 0;
		}
		for (i = 0;i < n - m + 1;i++)
		{
			count[i] = 1;
			for (j = i + 1;j < n - m + 1;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					count[i]++;
				}
			}
		}
		for (i = 0;i < n - m + 1;i++)
		{
			if (count[i] == max && max != 1)
			{
				mark[k] = i;
				k++;
			}
			else if (count[i] > max)
			{
				max = count[i];
				k = 0;
				mark[k] = i;
				k++;
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d",max);
			for (i = 0;i < k;i++)
			{
				System.out.printf("\n%s",b[mark[i]]);
			}
		}

		return 0;
	}
}


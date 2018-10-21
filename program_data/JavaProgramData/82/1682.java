package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[][] sz = new int[100][2];
		int[] s = new int[100];
		int i;
		int j = 0;
		int k = 1;
		int b = 0;
		int[] a = new int[50];
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
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
			if (sz[i][0] >= 90 && sz[i][0] <= 140 && sz[i][1] >= 60 && sz[i][1] <= 90)
			{
				s[j] = i;
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("0\n");
		}
		if (j != 0)
		{
		s[j] = -1;
		for (i = 0;i < j;i++)
		{
			if (s[i + 1] == s[i] + 1)
			{
				k++;
			}
			if (s[i + 1] != s[i] + 1)
			{
				a[b] = k;
				b++;
				k = 1;
			}
		}
		for (i = 0;i < b - 1;i++)
		{
			if (a[i] > a[i + 1])
			{
				k = a[i + 1];
				a[i + 1] = a[i];
				a[i] = k;
			}
		}
		System.out.printf("%d\n",a[b - 1]);
		}

	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String s = new String(new char[510]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		int i;
		int j;
		int k;
		k = 0;
		char[][] a = new char[500][5];
		int[] count = new int[500];
		for (i = 0;i < 500;i++)
		{
			count[i] = 1;
		}
		int x;
		int max = 0;
		for (i = 0;s.charAt(i + n - 1) != 0;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[k][j] = s.charAt(i + j);
			}
			a[k][j] = 0;
			k++;
		}
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				x = strcmp(a[i],a[j]);
				if (x == 0)
				{
					count[i]++;
				}
			}
			if (count[i] >= max)
			{
				max = count[i];
			}
		}
		if (max != 1)
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < k;i++)
			{
				if (count[i] == max)
				{
					System.out.printf("%s\n",a[i]);
				}
			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}


}


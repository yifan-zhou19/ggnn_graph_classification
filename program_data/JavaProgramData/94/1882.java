package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[502];
		int[] b = new int[502];
		int N;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		j = 1;
		for (i = 1;i <= N;i++)
		{
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		N = j - 1;
		for (i = 1;i <= N;i++)
		{
			for (j = 1;j < N;j++)
			{
				if (b[j] > b[j + 1])
				{
					int temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (i = 1;i <= N;i++)
		{
			if (i == 1)
			{
				System.out.printf("%d",b[i]);
			}
			else
			{
				System.out.printf(",%d",b[i]);
			}
		}
	}

}


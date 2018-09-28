package <missing>;

public class GlobalMembers
{
	public static void guochen(int[] array, int n)
	{
		int a;
		int i;
		int j;
		for (a = 0;a < n;a++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				array[a] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (array[j] < array[i])
				{
					int k;
					k = array[i];
					array[i] = array[j];
					array[j] = k;
				}
			}
		}
	}
	public static void shuchu(int[] one, int n, int[] two, int m)
	{
		int i;
		int j;
		System.out.printf("%d",one[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",one[i]);
		}
		for (j = 0;j < m;j++)
		{
			System.out.printf(" %d",two[j]);
		}
	}
	public static void Main()
	{
		int n;
		int m;
		int[] one = new int[100];
		int[] two = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		guochen(one, n);
		guochen(two, m);
		shuchu(one, n, two, m);
	}
}


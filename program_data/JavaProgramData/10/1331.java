package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[25];
	public static int n;

	public static void Main()
	{

		int i;
		int max = int;
		int num = 0;

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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			num = max(i) > num != 0?max(i):num;
		}
		System.out.printf("%d",num);

	}


	public static int max(int chu)
	{
		int z = 1;
		int tempj;
		int i;
		int j;
		int k;

		if (chu == n - 1)
		{
			z = 1;
		}
		else
		{
				for (j = chu + 1;j < n;j++)
				{
					if (a[j] > a[chu])
					{
						continue;
					}
					tempj = 1 + max(j);
					z = tempj > z != 0?tempj:z;
					tempj = 0;

				}

		}

		return z;
	}
}


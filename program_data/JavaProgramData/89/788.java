package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[1000000][2];
		int i = 0;
		int j;
		int p;
		int renshi;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			if (a[i][0] == 0 && a[i][1] == 0)
			{
			break;
			}
			i++;
		}
		for (p = 0;p < n;p++)
		{
			renshi = 0;
			for (j = 0;j < i;j++)
			{
				if (a[j][0] == p)
				{
					break;
				}
				if (a[j][1] == p)
				{
				renshi++;
				}
			}
			if (renshi == (n - 1))
			{
				System.out.printf("%d\n",p);
				sum++;
			}
		}
		if (sum == 0)
		{
		System.out.print("NOT FOUND");
		}
		return 0;

	}
}


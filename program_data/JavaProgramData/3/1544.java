package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int n;
		int k;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (m = i + 1;m < n;m++)
			{
				if (a[i] + a[m] == k)
				{

					System.out.print("yes");
					break;
				}
					if (i == n - 2 && m == n - 1)
					{
				System.out.print("no");
				break;
					}



			}
			if (a[i] + a[m] == k)
			{
				break;
			}
			if (i == n - 2 && m == n - 1)
			{
				break;
			}


		}
		return 0;

	}
}


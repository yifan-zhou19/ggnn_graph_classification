package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int[] arr = new int[1001];
		int i;
		int j;
		int bb;

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
				arr[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			bb = k - arr[i];
			for (j = i + 1;j < n;j++)
			{
				if (bb == arr[j])
				{
					System.out.print("yes\n");
					return 0;
				}
			}
		}
		if (i == n - 1)
		{
			System.out.print("no\n");
		}
	}
}


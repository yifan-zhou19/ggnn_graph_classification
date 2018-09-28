package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int d;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] arr = new int[100];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				arr[i] = Integer.parseInt(tempVar2);
			}
		}
		d = 0;
		x = 0;
		for (int k = 0;k < n;k++)
		{
			if (arr[k] > d)
			{
				d = arr[k];
			}
		}
		for (int j = 0;j < n;j++)
		{
				if (x <= arr[j] != 0 && arr[j] < d)
				{
					x = arr[j];
				}
		}
		System.out.printf("%d\n%d\n",d,x);
		return 0;
	}

}


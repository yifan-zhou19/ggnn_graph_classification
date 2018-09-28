package <missing>;

public class GlobalMembers
{
	public static int reserve(int[] self, int start, int end)
	{
		int temp;
		if (end - start > 0)
		{
			temp = self[start];
			self[start] = self[end];
			self[end] = temp;
			reserve(self, start + 1, end - 1);
		}
	}

	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] num = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
		}
		reserve(num, 0, n - 1);
		reserve(num, 0, m - 1);
		reserve(num, m, n - 1);
		System.out.printf("%d",num[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",num[i]);
		}
	}


}


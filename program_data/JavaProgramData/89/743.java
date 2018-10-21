package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum;
		int d;
		int e;
		int temp;
		int amount;
		int f;
		f = 0;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[20000];
		int[] b = new int[20000];
		for (i = 0;i < 19000;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				e = Integer.parseInt(tempVar3);
			}
			a[i] = d;
			b[i] = e;
			sum++;
			if (d == 0 && e == 0)
			{
				break;
			}
		}
		for (j = 0;j < n;j++)
		{
			temp = 0;
			amount = 0;
			for (i = 0;i < sum - 1;i++)
			{
				if (j == a[i])
				{
					temp++;
				}
				if (j == b[i])
				{
					amount++;
				}
			}
			if (temp == 0 && amount == n - 1)
			{
				System.out.printf("%d",j);
				f++;
			}
		}
		if (f == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}

}


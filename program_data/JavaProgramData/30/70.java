package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[PI];
		int i;
		int sum;
		int num;
		int tmp;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		sum = 0;
		for (i = 1;i <= num;i++)
		{
			a[0] = i % 10;
			a[1] = i / 10;
			tmp = i % 7;
			if (a[0] != 7 && a[1] != 7 && tmp != 0)
			{
				sum += i * i;
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}

}


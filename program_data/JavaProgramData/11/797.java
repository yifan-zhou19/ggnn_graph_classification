package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int k;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			j = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i <= j - 1;i++)
		{
						sum = sum + a[i];
		}
		if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0))
		{
										if (j <= 2)
										{
												sum = sum + k;
										}
										else
										{
											sum = sum + 1 + k;
										}
		}
		else
		{
			sum = sum + k;
		}
		System.out.printf("%d",sum);
		System.in.read();
		System.in.read();
		System.in.read();

	}
}


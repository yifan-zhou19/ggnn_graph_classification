package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			if ((7 * Math.floor(i / 7) != i) && (i % 10 != 7) && (i / 10 != 7))
			{

				sum = sum + i * i;
			}


		}
		System.out.printf("%d\n",sum);
	}

}


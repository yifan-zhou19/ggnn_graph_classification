package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 3;i++)
		{
			j = 2 * i + 1;
			if (n % j == 0)
			{
				if (t > 0)
				{
					System.out.print(" ");
				}
				System.out.printf("%d",j);
				t++;
			}
		}
		if (t == 0)
		{
		System.out.print("n");
		}
		System.out.print("\n");
	}

}


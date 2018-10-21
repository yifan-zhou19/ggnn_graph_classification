package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int out;
		int[] A = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;1 <= 5;i++)
		{
			if (n < 1)
			{
				break;
			}
			 System.out.printf("%d",n % 10);
			 n = n / 10;

		}
	 return 0;
	}
}


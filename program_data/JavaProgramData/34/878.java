package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= 100;j++)
		{
			if (n % 2 == 0)
			{
				i = n / 2;
				System.out.printf("%d/2=%d\n",n,i);
				n = i;
			}
			if (n % 2 == 1 && n != 1)
			{
				i = 3 * n + 1;
				System.out.printf("%d*3+1=%d\n",n,i);
				n = i;
			}
			if (n == 1)
			{
				System.out.print("End\n");
				break;
			}
			j = j;
		}
		return 0;
	}
}


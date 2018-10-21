package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] b = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int i;
		b[0] = a % 10;
		b[1] = ((a % 100) - b[0]) / 10;
		b[2] = ((a % 1000) - (a % 100)) / 100;
		b[3] = ((a % 10000) - (a % 1000)) / 1000;
		b[4] = a / 10000;
		for (i = 0;i < 5;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%d", b[i]);
			}
		}
	   return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		if (b == 10000)
		{
			System.out.print("00001");
		}
		else
		{
			for (i = 0; i <= 3; i++)
			{
				a[i] = b % (int)Math.pow(10, i + 1) / (int)Math.pow(10, i);
			}
			for (i = 0; i <= 3; i++)
			{
				if (b >= Math.pow(10, i))
				{
					System.out.printf("%d", a[i]);
				}
			}
		}
		return 0;
	}

}


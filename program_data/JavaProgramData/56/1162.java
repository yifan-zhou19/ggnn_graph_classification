package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[5];
		int i;
		int m;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 5;i++)
		{
			a[i] = n % 10;
			System.out.printf("%d", a[i]);
			b = (int)n / 10;
			n = b;
			if (n == 0)
			{
				break;
			}
		}
		return 0;
	}




}


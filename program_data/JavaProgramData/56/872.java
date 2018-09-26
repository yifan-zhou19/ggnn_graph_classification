package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[5];
		int b;
		int k = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (i = 0;;i++)
		{
			a[i] = b % 10;
			b = b / 10;
			k = k + 1;
			if (b < 1)
			{
				break;
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d",a[i]);
		}
	}
}


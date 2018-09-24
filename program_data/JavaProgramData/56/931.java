package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[5];
		int b;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 5;i++)
		{
			a[i] = b % 10;
			b = (b - (b % 10)) / 10;
		}
		for (n = 4;;n--)
		{
			if (a[n] == 0)
			{
				continue;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i <= n;i++)
		{
			System.out.printf("%d",a[i]);
		}
		System.out.print("\n");
	}


}


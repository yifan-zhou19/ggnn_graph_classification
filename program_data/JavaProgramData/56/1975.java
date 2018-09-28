package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int[] a = new int[5];
		int i;
		int w = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 4;i >= 0;i--)
		{
			a[i] = x % 10;
			x = x / 10;
		}
		for (i = 0;a[i] == 0;i++)
		{
			w++;
		}
		for (i = 4;i >= w;i--)
		{
			System.out.printf("%d",a[i]);
		}
		System.out.print("\n");
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int fan = int x;
		int[] a = new int[6];
		int[] b = new int[6];
		int i = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			b[i] = fan(a[i]);
			i = i + 1;
		} while (i < 6);
		i = 0;
		do
		{
			System.out.printf("%d\n",b[i]);
			i = i + 1;
		} while (i < 6);
	}
	public static int fan(int x)
	{
		int y;
		y = 0;
		do
		{
			y = x % 10 + 10 * y;
			x = x / 10;
		} while (x != 0);
		return (y);
	}

}


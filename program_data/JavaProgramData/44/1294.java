package <missing>;

public class GlobalMembers
{
	public static int change(int x)
	{
		int t;
		int i;

		t = 0;
		i = 0;
		while (x != 0)
		{
			t = t * 10 + x % 10;
			x = x / 10;
			i++;
		}
		return (t);
	}
	public static void Main()
	{
		int i;
		int[] a = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",change(a[i]));
		}
	}

}


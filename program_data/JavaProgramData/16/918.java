package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10];

	public static int Main()
	{
		int x;
		int k = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x == 0)
		{
			System.out.print(x);
			System.out.print("\n");
		}
		else
		{
		while (x > 0)
		{
				  a[k++] = x % 10;
				  x = x / 10;
		}
		for (int i = 0;i < k;i++)
		{
		  System.out.print(a[i]);
		}
		System.out.print("\n");
		}
		return 0;
	}

}


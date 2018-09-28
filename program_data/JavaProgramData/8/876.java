package <missing>;

public class GlobalMembers
{
	/*
	 *???mode.cpp
	 *???????????
	 *????: 2012-11-27
	 *?????1200012825
	 */

	public static int l1;
	public static int l2;
	public static int[] a = new int[2000];
	public static int[] b = new int[1000];
	public static int temp;
	public static void cins() //????
	{
		l1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= l1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1;i <= l2;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sorts() //????
	{
		for (int i = 1;i < l1;i++)
		{
			for (int j = 1;j <= l1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 1;i < l2;i++)
		{
				for (int j = 1;j <= l2 - i;j++)
				{
					if (b[j] > b[j + 1])
					{
						temp = b[j];
						b[j] = b[j + 1];
						b[j + 1] = temp;
					}
				}
		}
	}
	public static void together() //????
	{
		for (int i = l1 + 1;i <= l1 + l2;i++)
		{
			a[i] = b[i - l1];
		}
	}
	public static void couts() //????
	{
		System.out.print(a[1]);
		for (int i = 2;i <= l1 + l2;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);

		}
		System.out.print("\n");
	}
	public static int Main()
	{
		cins();
		sorts();
		together();
		couts(); //????
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	/**
	 *???5.cpp
	 *????7???????
	 *??????
	 *???2010?10?29?
	 */
	public static int Main()
	{
		int n;
		int i;
		int c = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int[] b = new int[100];
		for (i = 0;i < n;i++)
		{
			c++;
			a[i] = c % 10;
			b[i] = c / 10;
			if (c % 7 != 0 && a[i] != 7 && b[i] != 7)
			{
				sum = sum + c * c;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
	return 0;
	}
}


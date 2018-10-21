package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b = 0;
		int n;
		int c;
		int i;
		int[] a = new int[5];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print('0');
			System.out.print("\n");
		}
		else
		{
		for (i = 0;n > 0;i++)
		{
				c = n % 10;
			a[i] = c;
			n = n / 10;
			b += 1;
		} //???n?10????????,??n?10???????n
		for (i = 0;i < b;i++)
		{
		   System.out.print(a[i]);
		}
		System.out.print("\n");
		}
		return 0;
	}

}


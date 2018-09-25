package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int m;
		int[] a = {0, 0, 0, 0, 0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n >= 10)
		{
		do
		{
		   a[i] = n % 10;
		   n = n / 10;
		   i = i + 1;
		}while (n >= 10); //????????
		m = i - 1;
		for (i = 1;i <= m;i++)
		{
		System.out.print(a[i]);
		}
		System.out.print(n);
		}
		else
		{
			System.out.print(n);
		}
		return 0;
	}



}


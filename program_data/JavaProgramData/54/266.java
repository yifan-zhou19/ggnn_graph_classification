package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int a0;
		int count = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a0 = n + k;
		m = a0;
		while (count <= n - 1)
		{
					   if (m % (n - 1) != 0)
					   {
						   m = (a0 += n);
						   count = 1;
					   }
					   else
					   {
						   m = m / (n - 1) * n + k;
						   count++;
					   }
		}
	System.out.print(m);

	}

}


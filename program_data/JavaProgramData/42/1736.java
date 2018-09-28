package <missing>;

public class GlobalMembers
{
	/*???1300062804*/
	public static int Main()
	{
		int i;
		int n;
		int k;
		int b = 0;
		int[] f = new int[100000]; //????????????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		for (i = 1;i <= n;i++)
		{
		f[i - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print("\n");
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (f[i] != k)
			{
	b = b + 1;
				   if (b != 1)
				   {
	 System.out.print(" ");
	 System.out.print(f[i]);
				   }
	else
	{
		System.out.print(f[i]);
	}

			}
		}
	return 0;
	}

}


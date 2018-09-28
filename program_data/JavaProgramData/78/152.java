package <missing>;

public class GlobalMembers
{
	//****************************
	//**???????          **
	//**?????? 1100012914 **
	//**???2011?10?26?    **
	//****************************


	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		int[] a = new int[4];

		for (z = 10; z <= 50; z = z + 10)
		{
			for (q = 10; q <= 50; q = q + 10)
			{
				for (s = 10; s <= 50; s = s + 10)
				{
					for (l = 10; l <= 50; l = l + 10)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							a[0] = z;
							a[1] = q;
							a[2] = s;
							a[3] = l;
						}
					}
				}
			}
		}
		for (i = 50; i >= 10; i = i - 10)
		{
			if (a[0] == i)
			{
				System.out.print("z");
				System.out.print(" ");
				System.out.print(a[0]);
				System.out.print("\n");
			}
			if (a[1] == i)
			{
				System.out.print("q");
				System.out.print(" ");
				System.out.print(a[1]);
				System.out.print("\n");
			}
			if (a[2] == i)
			{
				System.out.print("s");
				System.out.print(" ");
				System.out.print(a[2]);
				System.out.print("\n");
			}
			if (a[3] == i)
			{
				System.out.print("l");
				System.out.print(" ");
				System.out.print(a[3]);
				System.out.print("\n");
			}
		}
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}


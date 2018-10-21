package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //???????
		int[] a = new int[4];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 10000)
	{
		System.out.print("00001");
		System.out.print("\n");
	}
	else
	{
		a[1] = n / 1000; //???
	a[2] = (n - 1000 * a[1]) / 100; //???
	a[3] = (n - 1000 * a[1] - 100 * a[2]) / 10; //???
	a[4] = (n - 1000 * a[1] - 100 * a[2] - 10 * a[3]);
	} //???
	if (a[1] != 0)
	{
		System.out.print(a[4]);
		System.out.print(a[3]);
		System.out.print(a[2]);
		System.out.print(a[1]);
		System.out.print("\n");
	}
	else
	{
		if (a[2] != 0)
		{
			System.out.print(a[4]);
			System.out.print(a[3]);
			System.out.print(a[2]);
			System.out.print("\n");
		}
		 else
		 {
			   if (a[3] != 0)
			   {
				   System.out.print(a[4]);
				   System.out.print(a[3]);
				   System.out.print("\n");
			   }
			else
			{
				System.out.print(a[4]);
				System.out.print("\n");
			}
		 }
	}
	return 0;
	}
}


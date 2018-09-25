package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5];
		int[] b = new int[5];
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 10000)
		{
			System.out.print(00001);
			System.out.print("\n");
		}
		else
		{
			b[0] = n;
			for (i = 0;i < 4;i++)
			{
				a[i] = b[i] / Math.pow(10.0,(double)(3 - i));
				b[i + 1] = b[i] % (int)(Math.pow(10.0,(double)(3 - i)));
			}
			if (a[0] != 0)
			{
				System.out.print(a[3]);
				System.out.print(a[2]);
				System.out.print(a[1]);
				System.out.print(a[0]);
				System.out.print("\n");
			}
			else if (a[1] != 0)
			{
				System.out.print(a[3]);
				System.out.print(a[2]);
				System.out.print(a[1]);
				System.out.print("\n");
			}
			else if (a[2] != 0)
			{
				System.out.print(a[3]);
				System.out.print(a[2]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(a[3]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}


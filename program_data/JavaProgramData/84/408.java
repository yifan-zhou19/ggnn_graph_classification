package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int m1 = 0;
		int m2 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
						 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 if (a[i] > m1)
						 {
									 m2 = m1;
									 m1 = a[i];

						 }
						 else if (m1 > a[i] && a[i] > m2)
						 {
							 m2 = a[i];
						 }
		}
		System.out.print(m1);
		System.out.print("\n");
		System.out.print(m2);
		System.out.print("\n");
		return 0;
	}

}


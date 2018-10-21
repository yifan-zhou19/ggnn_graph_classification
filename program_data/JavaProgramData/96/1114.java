package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
		int i;
		int m;
		int n;
		int r;
		String A = new String(new char[200]);
		A = new Scanner(System.in).nextLine();
		n = A.length();
		r = A.charAt(0) - '0';
		if (n == 1)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.printf("%d",r);
		}

		else
		{
		for (i = 0;i < n;i++)
		{
		   a[i] = A.charAt(i) - '0';
		}
		m = a[0] * 10 + a[1];
		for (i = 0;i < n - 1;i++)
		{

			b[i] = m / 13;
			c[i] = m % 13;
			m = c[i] * 10 + a[i + 2];
		}
		if (b[0] == 0 && n == 2)
		{
		System.out.print("0");
		}
		if (b[0] == 0)
		{
		for (i = 1;i < n - 1;i++)
		{
		System.out.printf("%d",b[i]);
		}
		}
		else
		{
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%d",b[i]);
		}
		}
		System.out.print("\n");
		System.out.printf("%d",c[n - 2]);
		}


	}



}

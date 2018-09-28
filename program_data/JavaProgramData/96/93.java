package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String d = new String(new char[100]);
		int[] b = new int[100];
		int[] c = new int[99];
		int m;
		int i;
		int k;
		a = new Scanner(System.in).nextLine();
		m = a.length();
		for (i = 0;i < m;i++)
		{
		b[i] = a.charAt(i) - '0';
		}
		if (m == 1)
		{
			System.out.print("0");
		}
		if (m == 2 && b[0] < 2 && b[1] < 3)
		{
			System.out.print("0");
		}
		for (i = 0;i < m - 1;i++)
		{
						 c[i] = (b[i] * 10 + b[i + 1]) / 13;
						 k = (b[i] * 10 + b[i + 1]) % 13;
						 b[i + 1] = k;
		}
		if (c[0] == 0)
		{
				   for (k = 1;k < m - 1;k++)
				   {
				   System.out.printf("%d",c[k]);
				   }
		}
		else
		{
			for (k = 0;k < m - 1;k++)
			{
			System.out.printf("%d",c[k]);
			}
		}
		System.out.print("\n");
		System.out.printf("%d",b[m - 1]);
		System.in.read();
		System.in.read();
	}
}

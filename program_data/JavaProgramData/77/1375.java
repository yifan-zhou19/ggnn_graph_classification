package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[200]);
		int n;
		int i;
		int p;
		int[] x = new int[100];
		int[] y = new int[100];
		int q;
		int j;
		int t;
		int m;
		String = new Scanner(System.in).nextLine();
		n = String.length();
		char c1;
		char c2;
		c1 = string.charAt(0);
		for (i = 1;i < n;i++)
		{
						if (String[i] != c1)
						{
										   c2 = string.charAt(i);
										   break;
						}
		}

		p = 1;
		q = 1;
		for (p = 1;p < n;p = p + 2)
		{
						for (i = 0;i < n;i++)
						{

								  if (String[i] == c1 && string.charAt(i + p) == c2)
								  {

								  String[i] = 'a';
								  String[i + p] = 'a';
								  x[q] = i;
								  y[q] = i + p;
								  q++;
								  }
						}
		}




		for (q = 1;q <= n / 2;q++)
		{
						   for (j = 1;j <= n / 2 - q;j++)
						   {
												if (y[j] > y[j + 1])
												{
															   t = y[j];
															   y[j] = y[j + 1];
															   y[j + 1] = t;
															   m = x[j];
															   x[j] = x[j + 1];
															   x[j + 1] = m;
												}
						   }
		}

		for (q = 1;q <= n / 2;q++)
		{
						   System.out.printf("%d %d\n", x[q], y[q]);
		}

		return 0;
	}
}

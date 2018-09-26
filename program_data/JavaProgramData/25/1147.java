package <missing>;

public class GlobalMembers
{
	public static void f(int n, int[] a)
	{
		if (n == 0)
		{
			return;
		}
	   else
	   {
			 int[] b = new int[100];
			int i;
			for (i = 1;i < 100;i++)
			{
				  b[i] = (2 * a[i]) / 10;
				 a[i] = (2 * a[i]) % 10 + b[i - 1];
			}
			f(n - 1, a);
	   }
	}

	public static int Main()
	{
		int n;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[] a = new int[100];
	   a[1] = 1;
	   f(n, a);
	   int i;
	   int t = 0;
	   for (i = 99;i >= 1;i--)
	   {
			 if (a[i] != 0)
			 {
				 t = 1;
			 }
			if (t == 1)
			{
				System.out.print(a[i]);
			}
	   }
	   return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int f(int[] a) //???????�??�?�2?�
	{
		int i;
		int[] b = new int[40];
		for (i = 1;i <= 39;i++)
		{
			   b[i] = 2 * a[i];
			  a[i] = b[i] % 10 + b[i - 1];
			  b[i] = b[i] / 10;
		}
		return 0;
	}
	public static int Main()
	{
		int[] a = new int[40];
		a[1] = 1;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 1;i <= n;i++) //??N?2?
		{
			   f(a);
		}
		int t = 0;
		for (i = 39;i >= 1;i--) //??
		{
			   if (t == 1)
			   {
					  System.out.print(a[i]);
					 continue;
			   }
			   if (a[i] != 0)
			   {
					  t = 1;
					  System.out.print(a[i]);
			   }
		}
		return 0;
	}
}


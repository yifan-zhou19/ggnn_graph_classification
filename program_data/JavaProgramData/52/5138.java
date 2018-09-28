package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = a + n - m;
		for (; p < a + n ; p++)
		{
			System.out.print(p);
			System.out.print(' ');
		}
		int[] q = a;
		for (; q < a + n - m ; q++)
		{
			if (q != a + n - m - 1)
			{
				System.out.print(q);
				System.out.print(' ');
			}
			else
			{
				System.out.print(q);
				System.out.print("\n");
			}
		}


		return 0;
	}



}


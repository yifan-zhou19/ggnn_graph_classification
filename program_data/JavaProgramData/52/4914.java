package <missing>;

public class GlobalMembers
{
	/*????*/
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] p = a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		/*???m??*/
		for (i = n - m + 1;i <= n;i++)
		{
			q = (p + i);
			System.out.print(q);
			System.out.print(" ");
		}
		/*???n-m??*/
		for (i = 1;i < n - m;i++)
		{
			q = (p + i);
			System.out.print(q);
			System.out.print(" ");
		}
		System.out.print(a[n - m]);
		return 0;
	}

}


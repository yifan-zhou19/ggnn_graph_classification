package <missing>;

public class GlobalMembers
{
	/************************/
	/*     ??????     */
	/*    ??? pyyaoer    */
	/*   ??  2011.12.4    */
	/************************/
	public static int Main()
	{
		int[] c = new int[1000];
		int n;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = c;
		for (;p <= c + n - 1;p++) //?????
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = c + n - 1;p >= c;p--) //???????m?
		{
			*(p + m) = *p;
		}
		for (p = c;p <= c + m - 1;p++) //?m???????n?
		{
			*p = (p + n);
		}
		p = c + 1;
		System.out.print(c);
		while (p <= c + n - 1) //????
		{
			System.out.print(" ");
			System.out.print(p++);
		}
		System.out.print("\n");
		return 0;
	}
}


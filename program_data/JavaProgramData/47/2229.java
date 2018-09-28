package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int r;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = a;p < a + n;p++)
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = a,q = a + n - 1;p < q;p++,q--)
		{
			r = p;
			*p = q;
			q = r;
		}
		for (p = a;p < a + n - 1;p++)
		{
			System.out.print(p);
			System.out.print(" ");
		}
		System.out.print(p);
		return 0;
	}
}


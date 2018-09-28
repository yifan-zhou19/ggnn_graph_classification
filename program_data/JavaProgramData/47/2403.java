package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q=null;
		int q = null;
		int n;
		int[] a = new int[110];
		p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			*p++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //????
		for (p = a,q = a + n - 1;p < q;q--,p++)
		{
			int t;
			t = p;
			*p = q;
			q = t; //????
		}
		for (p = a;p < a + n - 1;)
		{
			System.out.print(p++);
			System.out.print(" ");
		}
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}
}


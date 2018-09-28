package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		int[] a = new int[100];
		int temp = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null; //??????p?q?????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = null;
		for (p = a;p < a + n;++p) //??????
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = a,q = a + n - 1;p < q;++p,--q) //????
		{
			temp = p;
			*p = q;
			*q = temp;
		}
		p = a;
		System.out.print(p);
		for (p = a + 1;p < a + n;++p)
		{
			System.out.print(' ');
			System.out.print(p);
		}
		return 0;
	}

}


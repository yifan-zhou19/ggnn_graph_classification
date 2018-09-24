package <missing>;

public class GlobalMembers
{
	//????????

	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[300];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int t;
		for (p = a + n - 1;p >= a;p--)
		{
			*(p + m) = *p;
		}
		for (p = a;p < a + m;p++)
		{
			*p = (p + n);
		}
		p = a;
		System.out.print(p);
		for (p = a + 1;p < a + n;p++)
		{
			System.out.print(" ");
			System.out.print(p);
		}
		System.out.print("\n");
		return 0;
	}
}


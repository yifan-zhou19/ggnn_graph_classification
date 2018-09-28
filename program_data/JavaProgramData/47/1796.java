package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = n;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
		int b;
		p = a;
		while (i > 0)
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p++;
			i--;
		}
		p = a;
		for (i = 0;i < n / 2;i++) //?
		{
			b = (p + i);
			*(p + i) = *(p + n - i - 1);
			*(p + n - i - 1) = b;
		}
		i = n - 1;
		System.out.print(p);
		p++;
		while (i > 0)
		{
			System.out.print(" ");
			System.out.print(p);
			p++;
			i--;
		}

		return 0;
	}
}


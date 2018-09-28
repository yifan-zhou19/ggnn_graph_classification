package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static int * p = null;
	public static void rearrange(int[] str, int n)
	{
		int t;
		t = str[n - 1];
		for (p = str[n - 2];p >= str[0];p--)
		{
			*(p + 1) = *p;
		}
		str[0] = t;
	}
	public static int Main()
	{

		int[] number = new int[100];
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0;i < n;i++)
		{
			number[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		while (m-- != 0)
		{
			rearrange(number, n);
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(number[i]);
			System.out.print(" ");
		}
		System.out.print(number[n - 1]);
		return 0;
	}

}


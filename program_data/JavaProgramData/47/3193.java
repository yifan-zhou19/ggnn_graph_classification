package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[100];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
		s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = s[n];
		while (n > 1)
		{
				   p--;
				   n--;
				   System.out.print(p);
				   System.out.print(' ');
		}
		p--;
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}

}


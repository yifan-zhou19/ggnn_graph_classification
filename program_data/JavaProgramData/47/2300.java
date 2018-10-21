package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] num = new int[50];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		p = num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = num + 0;p < num + n;p++)
		{
			*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = num + n - 1;
		System.out.print(p);
		for (p = num + n - 2;p >= num + 0;p--)
		{
			System.out.print(" ");
			System.out.print(p);
		}
		System.out.print("\n");
		return 0;
	}


}


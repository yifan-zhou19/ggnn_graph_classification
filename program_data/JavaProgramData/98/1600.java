package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[41]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = c;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int num = 0;
		for (i = 1;i <= n;i++)
		{
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (; * p != 0;p++)
			{
				;
			}
			j = p - c;
			if (num == 0)
			{
				System.out.print(c);
				num = j;
			}
			else
			{
			if ((num + j + 1) > 80)
			{
				System.out.print("\n");
				System.out.print(c);
				num = j;
			}
			else if ((num + j + 1) == 80)
			{
				System.out.print(' ');
				System.out.print(c);
				System.out.print("\n");
				num = 0;
			}
			else
			{
				System.out.print(' ');
				System.out.print(c);
				num += (j + 1);
			}
			}
			p = c;
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[120]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = str;
		int[] boy = new int[100];
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int m = 0;
		int bo = 0;
		while (*p != 0)
		{
			if (*p == str.charAt(0))
			{
				bo++;
				boy[bo] = m;
			}
			else
			{
				System.out.print(boy[bo]);
				System.out.print(" ");
				System.out.print(m);
				System.out.print("\n");
				bo--;
			}
			p++;
			m++;
		}
	}

}


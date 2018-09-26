package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count = 0;
		int j = 1;
		int l;
		String a = new String(new char[41]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			p = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = 0;
			for (*p; * p != '\0'; * p++)
			{
				l++;
			}
			count = count + l;
			p = a;
			if (count < 80 && count != l)
			{
				System.out.print(" ");
				System.out.print(p);
				count++;
			}
			else if (count < 80 && count == l)
			{
				System.out.print(p);
			}
			else
			{
				System.out.print("\n");
				System.out.print(p);
				count = l;
			}
		}
		return 0;
	}


}


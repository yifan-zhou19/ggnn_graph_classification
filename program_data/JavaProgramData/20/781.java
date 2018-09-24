package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String sub = new String(new char[4]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String max;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			max = str;
			sub = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (p = str.Substring(1); * p;p++)
			{
				if (max < *p)
				{
					max = p;
				}
			}
			for (p = str;p <= max;p++)
			{
				System.out.print(p);
			}
			System.out.print(sub);
			System.out.print(max.Substring(1));
			System.out.print("\n");
		}
		return 0;
	}

}


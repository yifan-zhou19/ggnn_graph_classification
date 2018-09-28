package <missing>;

public class GlobalMembers
{
	 //******************************//
	 //*     ?????				*//
	 //*     ???1000012711		*//
	 //*     ??????????	*//
	 //*     ???2010.12.08		*//
	 //******************************//
	public static int Main()
	{
		String str = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pointer = str;
		char l;
		char g;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		g = 1;
		for (; pointer < str + l; pointer++)
		{
			if (g == 1 && *pointer == ' ')
			{
				g = 0;
				System.out.print(pointer);
			}
			if (g == 0 && *pointer == ' ')
			{
				continue;
			}
			System.out.print(pointer);
			if (*pointer != ' ')
			{
				g = 1;
			}
		}
		System.out.print("\n");
		return 0;
	}

}

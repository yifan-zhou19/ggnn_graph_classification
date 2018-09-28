package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		cin.get(str,300);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		int l;
		l = str.length();
		int i;
		int q = 0;
		for (i = 0;i < l;i++,p++)
		{
		   if ((*p >= 48) && (*p <= 57))
		   {
			   if ((*(p + 1) >= 48) && (*(p + 1) <= 57))
			   {
				   System.out.print(p);
			   }
				if ((*(p + 1) < 48) || (*(p + 1)>57))
				{
				   System.out.print(p);
				   System.out.print("\n");
				}
		   }
		}



		return 0;

	}

}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			int[] times = new int[256];
			str = new Scanner(System.in).nextLine();
			p = str;
			while ('\0' != *p)
			{
				 times[*p]++;
				 p++;
			}
			p = str;
			while ('\0' != *p)
			{
				 if (1 == times[*p])
				 {
					System.out.printf("%c\n",*p);
					break;
				 }
				 p++;
			}
			if ('\0' == *p)
			{
			   System.out.print("no\n");
			}
		}
		 return 0;
	}
}


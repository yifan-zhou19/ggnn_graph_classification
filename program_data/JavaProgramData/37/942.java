package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int pd = 0;
		int l;
		int j;
		int no = 0;
		String zf = new String(new char[100000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ptr;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf = tempVar2.charAt(0);
			}
			l = zf.length();
			ptr = zf.charAt(0);
			for (; * ptr != '\0';ptr++)
			{
				for (j = 0;j < l;j++)
				{
					if (*ptr == zf.charAt(j))
					{
						pd++;
					}
				}
				if (pd == 1)
				{
					System.out.printf("%c\n",*ptr);
					no = 1;
					pd = 0;
					break;
				}
				pd = 0;
			}
			if (no == 0)
			{
				System.out.print("no\n");
			}
			no = 0;
		}
	}
}


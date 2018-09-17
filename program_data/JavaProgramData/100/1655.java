package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		int count;
		int zimushu = 0;
		for (char ZM = 'A';ZM <= 'Z';ZM++)
		{
			count = 0;
			for (ps = zfc; * ps != '\0';ps++)
			{
				if (*ps == ZM)
				{
					count++;
				}
			}
			if (count != 0)
			{
				System.out.printf("%c=%d\n",ZM,count);
				zimushu++;

			}

		}
		for (char zm = 'a';zm <= 'z';zm++)
		{
			count = 0;
			for (ps = zfc; * ps != '\0';ps++)
			{
				if (*ps == zm)
				{
					count++;
				}
			}
			if (count != 0)
			{
				System.out.printf("%c=%d\n",zm,count);
				zimushu++;

			}

		}

		if (zimushu == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}


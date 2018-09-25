package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[301]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		int i;
		int j;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 65,j = 0;i < 91;i++)
		{
			for (ps = a; * ps != '\0';ps++)
			{
				if (*ps == i)
				{
					j++;
					s++;

				}

			}
			if (j != 0)
			{
				System.out.printf("%c=%d\n",i,j);
				j = 0;
			}


		}
		for (i = 97,j = 0;i < 123;i++)
		{
			for (ps = a; * ps != '\0';ps++)
			{
				if (*ps == i)
				{
					j++;
					s++;

				}

			}
			if (j != 0)
			{
				System.out.printf("%c=%d\n",i,j);
				j = 0;
			}



		}
		if (s == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}


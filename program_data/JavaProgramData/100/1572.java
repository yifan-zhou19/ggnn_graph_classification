package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[3000]);
		final String b = "abcdefghijklmnopqrstuvwxyz";
		final String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa = a;
		int i;
		int n = 0;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}


		for (i = 0;i < 26;i++)
		{
			for (pa = a; * pa != '\0';pa++)
			{
				if (*pa == c.charAt(i))
				{
					n++;
				}
			}
			if (n > 0)
			{
				System.out.printf("%c=%d\n",c.charAt(i),n);
				e++;
			}
			n = 0;
		}

		for (i = 0;i < 26;i++)
		{
			for (pa = a; * pa != '\0';pa++)
			{

				if (*pa == b.charAt(i))
				{
					n++;
				}

			}

			if (n > 0)
			{
				System.out.printf("%c=%d\n",b.charAt(i),n);
				e++;
			}
			n = 0;
		}
		if (e == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}

}


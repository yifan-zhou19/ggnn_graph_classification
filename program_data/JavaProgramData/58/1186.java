package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = 0;
		int b = 0;
		int n;
		String a = new String(new char[81]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();

		while (n > 0)
		{
			a = new Scanner(System.in).nextLine();
			p = a;
			if ((*p == '_') || (*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z'))
			{
				b = 1;
			}
			else
			{
				b = 0;
			}

			while (*p != '\0')
			{
				if ((*p == '_') || (*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || (*p >= '0' && *p <= '9'))
				{
					f = 1;
				}
				else
				{
					f = 0;
					break;
				}

				p++;
			}

			if (f == 1 && b == 1)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}

			n--;
		}
	 return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sign = new String(new char[81]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int n;
		int i;
		int count = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sign = new Scanner(System.in).nextLine();

			p = sign;
			if (*p == '_' || *p >= 'A' && *p <= 'Z' || *p >= 'a' && *p <= 'z')
			{
			p++;
			count++;

			for (;;p++)
			{
				if (*p == '\0')
				{
					break;
				}
				if (*p == '_' || (*p >= 'A' && *p <= 'Z') || (*p >= 'a' && *p <= 'z') || *p >= '0' && *p <= '9')
				{
					count++;
				}
			}
			if (count == sign.length())
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
			}
			else
			{
			System.out.print("0\n");
			}
			count = 0;
		}

		return 0;
	}
}


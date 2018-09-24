package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static int fit(char * p)
	{
		if ((*p >= 65 && *p <= 90) || (*p >= 97 && *p <= 122) || *p == 95)
		{
			p = p.Substring(1);
		}
		else
		{
			return 0;
		}
		for (; * p != '\0';p++)
		{
			if ((*p >= 65 && *p <= 90) || (*p >= 97 && *p <= 122) || *p == 95 || (*p >= 48 && *p <= 57))
			{
				continue;
			}
			else
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main(String[] args)
	{
		int n;
		int i;
		String sz = new String(new char[81]);
		String p;
		p = sz;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			p = new Scanner(System.in).nextLine();
			if (fit(p) != 0)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}

}


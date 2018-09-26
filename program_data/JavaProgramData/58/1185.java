package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int pd = 0;
		String zf = new String(new char[82]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ptr;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			zf = new Scanner(System.in).nextLine();
			ptr = zf.charAt(0);
			if ((*ptr >= 'a' && *ptr <= 'z') || (*ptr >= 'A' && *ptr <= 'Z') || *ptr == '_')
			{
				pd = pd;
			}
			else
			{
				pd++;
			}
			ptr++;
			for (; * ptr != '\0';ptr++)
			{
				if ((*ptr >= 'a' && *ptr <= 'z') || (*ptr >= 'A' && *ptr <= 'Z') || *ptr == '_' || (*ptr >= '0' && *ptr <= '9'))
				{
					pd = pd;
				}
				else
				{
					pd++;
				}
			}
			if (pd != 0)
			{
				System.out.print("0\n");
			}
			else
			{
				System.out.print("1\n");
			}
			pd = 0;
		}
	}

}


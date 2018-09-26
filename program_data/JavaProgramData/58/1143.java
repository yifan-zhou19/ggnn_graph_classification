package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static int pd(char * p)
	{
		if ((*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || *p == '_')
		{
			for (p = p.Substring(1); * p != '\0';p++)
			{
				if (*p >= 'a' && *p <= 'z' || (*p >= 'A' && *p <= 'Z') || (*p >= '0' && *p <= '9') || *p == '_')
				{
					;
				}
				else
				{
					break;
				}
			}
			if (*p == '\0')
			{
				return (1);
			}
			else
			{
				return (0);
			}
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int i;
		int n;
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
			p = new Scanner(System.in).nextLine();
			System.out.printf("%d\n",pd(p));
		}
	}

}


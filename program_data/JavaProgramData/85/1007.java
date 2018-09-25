package <missing>;

public class GlobalMembers
{
	public static int judge(tangible.RefObject<String> zfc)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = zfc.argValue;
		for (; * p != '\0';p++)
		{
			if (*p == '_' || ('A' <= *p && *p <= 'Z') || ('a' <= *p && *p <= 'z') || ('0' <= *p && *p <= '9' && p != zfc.argValue))
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
	public static int Main()
	{
		int i;
		String z = new String(new char[3]);
		z = new Scanner(System.in).nextLine();
		int n = Integer.parseInt(z);
		for (i = 0;i < n;i++)
		{
			String zfc = new String(new char[81]);
			zfc = new Scanner(System.in).nextLine();
		tangible.RefObject<String> tempRef_zfc = new tangible.RefObject<String>(zfc);
			if (judge(tempRef_zfc) != 0)
			{
				zfc = tempRef_zfc.argValue;
				System.out.print("yes\n");
			}
			else
			{
				zfc = tempRef_zfc.argValue;
				System.out.print("no\n");
			}
		}
		return 0;
	}

}


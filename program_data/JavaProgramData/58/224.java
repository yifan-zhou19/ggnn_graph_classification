package <missing>;

public class GlobalMembers
{
	public static int judge;
	public static String zfc = new String(new char[81]);

	public static void judge1(tangible.RefObject<String> p)
	{
		if (!((p.argValue > 64 && p.argValue < 91) || (p.argValue>96 && p.argValue < 123) || p.argValue == 95))
		{
			judge = 0;
		}
		return;
	}

	public static void judge2(tangible.RefObject<String> p)
	{
		int len;
		len = zfc.length();
		int i;
		for (i = 0;i < len;i++)
		{
			if (!((*(p.argValue.Substring(i)) > 64 && *(p.argValue.Substring(i)) < 91) || (*(p.argValue.Substring(i))>96 && *(p.argValue.Substring(i)) < 123) || *(p.argValue.Substring(i)) == 95 || (*(p.argValue.Substring(i))>47 && *(p.argValue.Substring(i)) < 58)))
			{
				judge = 0;
				break;
			}
		}
		return;
	}

	public static int Main()
	{
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}

		int i;
		String p = new String(new char[30]);
		for (i = 0;i < num;i++)
		{
			judge = 1;
			if (i == 0)
			{
				System.in.read();
			}
			zfc = new Scanner(System.in).nextLine();
			p = zfc;
			judge1(*p);
			judge2(*p);
			if (judge == 0)
			{
				System.out.print("0\n");
			}
			if (judge == 1)
			{
				System.out.print("1\n");
			}
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[100]);
		String in = new String(new char[30]);
		String out = new String(new char[30]);
		String x = new String(new char[100]);
		String y = new String(new char[100]);
		int len;
		int i;
		int t = 1;
		int lenall;
		int judge = 1;
		zfc = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			in = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			out = tempVar2.charAt(0);
		}
		len = in.length();
		lenall = zfc.length();
		for (i = 0;i <= lenall - len;i++)
		{
			x = zfc;
			x = x.substring(0, i + len);
			if (i != 0)
			{
				x = x.substring(0, i - 1);
			}
			if (strcmp(x.charAt(i), in) == 0)
			{
				if (i != 0)
				{
					y = zfc;
					y = y.substring(0, i);
					y = y.substring(0, i + len - 1);
					y = y.substring(0, lenall);
					System.out.printf("%s%s%s", y.charAt(0), out, y.charAt(i + len));
					judge = 0;
					break;
				}
				else
				{
					System.out.printf("%s%c%s", out, zfc.charAt(i + len), x.charAt(i + len + 1));
					judge = 0;
					break;
				}
			}
		}
		if (judge != 0)
		{
			System.out.printf("%s", zfc);
		}
		return 0;
	}
}


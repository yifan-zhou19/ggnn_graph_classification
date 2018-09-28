package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int num;
	int im;
	int jm;
	int tm;
	int len;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		num = Integer.parseInt(tempVar);
	}
	char[][] zfc = new char[num][21];
		for (im = 0;im < num;im++)
		{
			tm = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[im] = tempVar2.charAt(0);
			}
			len = String.valueOf(zfc[im]).length();
			if ((zfc[im][0] >= 'a' && zfc[im][0] <= 'z') || (zfc[im][0] >= 'A' && zfc[im][0] <= 'Z') || (zfc[im][0] == '_'))
			{
			for (jm = 1;jm < len;jm++)
			{
				if ((zfc[im][jm] >= 'a' && zfc[im][jm] <= 'z') || (zfc[im][jm] >= 'A' && zfc[im][jm] <= 'Z') || (zfc[im][jm] >= '0' && zfc[im][jm] <= '9') || (zfc[im][jm] == '_'))
				{
				}
				else
				{
					tm++;
					break;
				}
			}
			if (tm == 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
			}
			else
			{
				System.out.print("no\n");
			}
		}
	return 0;
	}



}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		String zfc = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int j;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			len = zfc.length();
			if ((zfc.charAt(len - 2) == 'e') && (zfc.charAt(len - 1) == 'r'))
			{
				for (j = 0;j < len - 3;j++)
				{
					System.out.printf("%c",zfc.charAt(j));
				}
				for (j = len - 3;j < len - 2;j++)
				{
					System.out.printf("%c\n",zfc.charAt(j));
				}
			}
			else if ((zfc.charAt(len - 2) == 'l') && (zfc.charAt(len - 1) == 'y'))
			{
				for (j = 0;j < len - 3;j++)
				{
					System.out.printf("%c",zfc.charAt(j));
				}
				for (j = len - 3;j < len - 2;j++)
				{
					System.out.printf("%c\n",zfc.charAt(j));
				}
			}
			else if ((zfc.charAt(len - 3) == 'i') && (zfc.charAt(len - 2) == 'n') && (zfc.charAt(len - 1) == 'g'))
			{
				for (j = 0;j < len - 4;j++)
				{
					System.out.printf("%c",zfc.charAt(j));
				}
				for (j = len - 4;j < len - 3;j++)
				{
					System.out.printf("%c\n",zfc.charAt(j));
				}

			}
		}
		return 0;
	}
}


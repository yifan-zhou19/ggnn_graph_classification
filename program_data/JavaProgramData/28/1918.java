package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[10005]);
		int i;
		int j;
		int k;
		int l;
		j = 0;
		zfc = new Scanner(System.in).nextLine();
		l = 0;
		for (i = 0;i < zfc.length();i++)
		{
			if (zfc.charAt(i) == ' ' && zfc.charAt(i - 1) != ' ')
			{
				l++;
			}
		}
		for (i = 0;i <= zfc.length();i++)
		{
			if ((zfc.charAt(i) == ' ' && zfc.charAt(i - 1) != ' ') || i == zfc.length())
			{
				System.out.printf("%d",j);
				j = 0;
				l--;
				if (l >= 0)
				{
					System.out.print(",");
				}
			}
			if (zfc.charAt(i) != ' ')
			{
				j++;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		return 0;
	}
}


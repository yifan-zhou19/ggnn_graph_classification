package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int x;
	String zfc = new String(new char[256]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc = tempVar2.charAt(0);
		}
	x = zfc.length();
	if ((zfc.charAt(x - 1) == 'y') || (zfc.charAt(x - 1) == 'r'))
	{
			for (j = 0;j < x - 3;j++)
			{
				System.out.printf("%c",zfc.charAt(j));
			}
		System.out.printf("%c\n",zfc.charAt(x - 3));
	}
	else if (zfc.charAt(x - 1) == 'g')
	{
			for (j = 0;j < x - 4;j++)
			{
				System.out.printf("%c",zfc.charAt(j));
			}
		System.out.printf("%c\n",zfc.charAt(x - 4));
	}
	else
	{
		System.out.printf("%s\n",zfc);
	}
	}
	return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 1;i <= n;i++)
	{
	String zfc = new String(new char[21]);
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		zfc = tempVar2.charAt(0);
	}
	int s;
	if ((65 <= zfc.charAt(0) && zfc.charAt(0) <= 90) || (97 <= zfc.charAt(0) && zfc.charAt(0) <= 122) || (zfc.charAt(0) == 95))
	{
		s = 1;
	}
	else
	{
		s = 0;
	}
	for (int t = 1;t <= 20 && zfc.charAt(t - 1) != 0;t++)
	{
	if ((zfc.charAt(t - 1) < 48) || (57 < zfc.charAt(t - 1) && zfc.charAt(t - 1) < 65) || (90 < zfc.charAt(t - 1) && zfc.charAt(t - 1) < 95) || (zfc.charAt(t - 1) == 96) || (zfc.charAt(t - 1)>122))
	{
		s = 0;
	}
	}
	if (s == 0)
	{
		System.out.print("no\n");
	}
	else
	{
		System.out.print("yes\n");
	}
	}
	return 0;
	}


}


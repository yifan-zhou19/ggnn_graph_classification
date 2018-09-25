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
		char[][] zfc2 = new char[20][100];
		int len;
		int i;
		int t = 1;
		int lenall;
		int judge = 1;
		int[] num = new int[100];
		int k = 1;
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
		num[0] = 0;
		for (i = 0;i < lenall;i++)
		{
			if (zfc.charAt(i) == ' ')
			{
				num[k] = i + 1;
				zfc = zfc.substring(0, i);
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			zfc2[i] = zfc.charAt(num[i]);
		}
		for (i = 0;i < k;i++)
		{
			if (strcmp(zfc.charAt(num[i]), in) == 0)
			{
				zfc2[i] = out;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%s ", zfc2[i]);
		}
		System.out.printf("%s", zfc2[k - 1]);
		return 0;
	}

}


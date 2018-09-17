package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] sum = new int[30];
		int[] tot = new int[30];
		int x = 0;
		String zfc = new String(new char[305]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		for (i = 0;i < zfc.length();i++)
		{
			if (zfc.charAt(i) <= 'Z' && zfc.charAt(i) >= 'A')
			{
				sum[zfc.charAt(i) - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (sum[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'A',sum[i]);
				x = 1;
			}
		}
		for (i = 0;i < zfc.length();i++)
		{
			if (zfc.charAt(i) <= 'z' && zfc.charAt(i) >= 'a')
			{
				tot[zfc.charAt(i) - 'a']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (tot[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'a',tot[i]);
				x = 1;
			}
		}
		if (x == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}


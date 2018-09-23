package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len = 0;
		int i;
		int t = 0;
		int[] num = new int[26];
		String zfc = new String(new char[300]);
		char c;
		len = zfc.length();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		for (i = 0;zfc.charAt(i) != 0;i++)
		{
			if (zfc.charAt(i) >= 'a' && zfc.charAt(i) <= 'z')
			{
				num[zfc.charAt(i) - 'a']++;
			}
		}
		for (c = 'a'; c <= 'z'; c++)
		{
			if (num[c - 'a'] != 0)
			{
				System.out.printf("%c=%d\n",c,num[c - 'a']);
				t = 1;
			}
		}
			if (t == 0)
			{
			System.out.print("No");
			}
		return 0;
	}

}


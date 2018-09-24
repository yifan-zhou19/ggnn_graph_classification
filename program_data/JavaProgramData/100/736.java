package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
		final String zm = "abcdefghijklmnopqrstuvwxyz";
		int[] sz = new int[26];
		int i;
		int j;
		int len;
		int result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		len = zfc.length();
		for (i = 0;i < 26;i++)
		{
			sz[i] = 0;
			for (j = 0;j < len;j++)
			{
				if (zfc.charAt(j) == zm.charAt(i))
				{
				   sz[i]++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (sz[i] != 0)
			{
			   System.out.printf("%c=%d\n",zm.charAt(i),sz[i]);
			}
		}
		for (i = 0;i < 26;i++)
		{
			result += sz[i];
		}
		if (result == 0)
		{
		   System.out.print("No");
		}
		return 0;
	}

}


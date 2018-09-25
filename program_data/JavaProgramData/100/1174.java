package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
		final String zm = "abcdefghijklmnopqrstuvwxyz";
		int[] zms = new int[26];
		int i;
		int j;
		int n;
		int m = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		n = zfc.length();
		for (i = 0;i < 26;i++)
		{
			zms[i] = 0;
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (zfc.charAt(j) == zm.charAt(i))
				{
					zms[i]++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (zms[i] != 0)
			{
				m = 0;
						  System.out.printf("%c=%d\n",zm.charAt(i),zms[i]);
			}
		}
			 if (m == 1)
			 {
				 System.out.print("No");
			 }
		return 0;
	}

}


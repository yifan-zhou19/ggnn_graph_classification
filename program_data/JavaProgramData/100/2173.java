package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
		char i;
		int dec = 0;
		int tag;
		int[] cs = new int[26];
		int m = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		int n = zfc.length();
		for (i = 'A';i <= 'Z';i++)
		{
			tag = 0;
			for (j = 0;j < n;j++)
			{
				if (zfc.charAt(j) == i)
				{
					cs[m]++;
					dec = 1;
					tag = 1;
				}
			}
			if (tag != 0)
			{
				System.out.printf("%c=%d\n",i,cs[m]);
				m++;
			}
		}
		for (i = 'a';i <= 'z';i++)
		{
			tag = 0;
			for (j = 0;j < n;j++)
			{
				if (zfc.charAt(j) == i)
				{
					cs[m]++;
					dec = 1;
					tag = 1;
				}
			}
			if (tag != 0)
			{
				System.out.printf("%c=%d\n",i,cs[m]);
				m++;
			}
		}
		if (dec == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int len;
		int i;
		int j;
		int k;
		int w;
		int[] count = new int[26];
		len = s.length();
		w = 0;
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < len;j++)
			{
				if (s.charAt(j) == ('a' + i))
				{
					count[i]++;
				}
			}
			if (count[i] != 0)
			{
				w = 1;
			}
		}
		if (w == 0)
		{
			System.out.print("No");
		}
		if (w == 1)
		{
			for (i = 0;i < 26;i++)
			{
				if (count[i] != 0)
				{
					System.out.printf("%c=%d\n",'a' + i,count[i]);
				}
			}
		}
		return 0;
	}

}


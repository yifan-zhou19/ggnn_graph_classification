package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] count = new int[128];
		int i;
		int order;
		int c = 0;
		String s = new String(new char[301]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;s.charAt(i);i++)
		{
			if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
			{
			order = (int)s.charAt(i);
			count[order]++;
			}
		}
		for (i = 0;i < 128;i++)
		{
			if (count[i] != 0)
			{
				System.out.printf("%c=%d\n",i,count[i]);
				c++;
			}
		}
		if (c == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}


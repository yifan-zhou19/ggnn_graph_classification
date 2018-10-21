package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[N]);
		String w = new String(new char[N]);
		int dis_len;
		int i;
		int j;
		int sum = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		dis_len = w.length() - s.length() + 1;
		for (i = 0;i < dis_len;i++)
		{
			for (j = 0;j < s.length();j++)
			{
				if (s.charAt(j) != w.charAt(i + j))
				{
					sum = 0;
					break;
				}
			}
			if (sum == 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
			else
			{
				sum = 1;
			}
		}
		return 0;
	}
}


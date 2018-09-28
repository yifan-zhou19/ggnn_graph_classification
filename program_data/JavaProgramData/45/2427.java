package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int len;
		int fail = 0;
		String s = new String(new char[50]);
		String w = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		len = s.length();
		i = j = 0;
		while (true)
		{
			if (w.charAt(i) != s.charAt(0))
			{
				i++;
				continue;
			}
			for (j = 0;j < len;j++)
			{
				if (w.charAt(i + j) != s.charAt(j))
				{
					fail = 1;
					break;
				}
			}
			if (fail == 1)
			{
				i++;
				fail = 0;
				continue;
			}
			else
			{
				break;
			}
		}
		System.out.printf("%d\n",i);
	}
}


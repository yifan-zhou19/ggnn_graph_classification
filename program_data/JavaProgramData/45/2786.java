package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String w = new String(new char[100]);
		int i;
		int j;
		int l1;
		int l2;
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
		l1 = s.length();
		l2 = w.length();
		for (i = 0; i < l2 - l1 + 1; i++)
		{
			int flag = 1;
			for (j = 0; j < l1 - 1; j++)
			{
				if (w.charAt(i + j) != s.charAt(j))
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				System.out.printf("%d", i);
				break;
			}
		}
		System.out.print('\n');
		return 0;
	}
}


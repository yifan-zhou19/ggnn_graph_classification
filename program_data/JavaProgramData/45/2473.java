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
		int k;
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
		i = 0;
		for (j = 0;j < l2;j++)
		{
			if (w.charAt(j) == s.charAt(i))
			{
				if (i == 0)
				{
					k = j;
				}
				i++;
			}
			if (i == l1)
			{
				break;
			}
		}
		System.out.printf("%d",k);

		return 0;
	}


}


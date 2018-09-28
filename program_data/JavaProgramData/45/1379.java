package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int l1;
		int l2;
		int i;
		int j;
		int a;
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
		l1 = s.length();
		l2 = w.length();
		for (j = 0;j < (l2 - l1 + 1);j++)
		{
			a = 0;
			if (w.charAt(j) == s.charAt(0))
			{
				for (i = 1;i < l1;i++)
				{
					if (w.charAt(j + i) == s.charAt(i))
					{
						a = 1;
					}
					else
					{
						a = 0;
					}
				}
				if (a == 1)
				{
					System.out.printf("%d\n",j);
					break;
				}
				else
				{
					continue;
				}
			}
			else
			{
			continue;
			}
		}
	}
}


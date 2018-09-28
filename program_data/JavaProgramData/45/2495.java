package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int t;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
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
		for (j = 0;j < w.length() - s.length() + 1;j++)
		{
			t = 1;
			if (w.charAt(j) == s.charAt(0))
			{
				for (i = 0;i < s.length();i++)
				{
					if (w.charAt(j + i) != s.charAt(i))
					{
						t = 0;
						break;
					}
				}
				if (t == 1)
				{
					System.out.printf("%d",j);
					break;
				}
			}
		}
		return 0;
	}
}


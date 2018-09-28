package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int t;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
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
		for (i = 0;w.charAt(i) != '\0';i++)
		{
			t = 0;
			if (w.charAt(i) == s.charAt(0))
			{
				for (j = 1;s.charAt(j) != '\0';j++)
				{
					if (s.charAt(j) != w.charAt(i + j))
					{
						break;
					}
					else
					{
						t = t + 1;
					}
				}
				if (t == j - 1)
				{
					System.out.printf("%d",i);
					return 0;
				}
			}
		}
		return 0;
	}

}


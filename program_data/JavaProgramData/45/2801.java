package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int j;
		int s;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		s = a.length();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		w = b.length();
		for (j = 0;j < w;j++)
		{
			if (b.charAt(j) == a.charAt(0))
			{
				for (i = 1;i < s;i++)
				{
					if (b.charAt(j + i) != a.charAt(i))
					{
						break;
					}
				}
				if (i == s)
				{
					System.out.printf("%d",j);
					break;
				}
			}
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int len1;
		int len2;
		int c = 0;
		int d;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
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
		len1 = s.length();
		len2 = w.length();
		for (j = 0,i = 0;j < len2;j++)
		{
			c = 0;
			if (s.charAt(i) == w.charAt(j))
			{
				for (m = i + 1,n = j + 1;m < len1;m++,n++)
				{
					if (s.charAt(m) != w.charAt(n))
					{
						c = 1;
					}
				}
					if (c != 1)
					{
						d = j;
							break;

					}
			}
		}
		System.out.printf("%d",d);
		return 0;
	}

}


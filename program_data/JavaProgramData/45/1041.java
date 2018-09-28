package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		int i;
		int n;
		int j;
		int m = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}

		for (i = 0;s2.charAt(i) != '\0';i++)
		{
			m++;
			if (s2.charAt(i) == s1.charAt(0))
			{
				for (j = 0;s1.charAt(j) != '\0';j++)
				{
					if (s2.charAt(i + j) != s1.charAt(j))
					{
						n = 0;
						break;
					}
					n = 1;
				}
			}
			if (n == 1)
			{
				break;
			}
		}
		System.out.printf("%d",m);
	}
}


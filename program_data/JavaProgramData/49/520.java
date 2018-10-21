package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[102]);
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
		n = i;
		}
		n = i;
		for (i = 1;i <= n;i++)
		{
			for (j = 0;s.charAt(j + i) != '\0';j++)
			{
				for (k = j;k <= j + i;k++)
				{
					if (s.charAt(k) != s.charAt(2 * j + i - k))
					{
						break;
					}
				}
				if (k == j + i + 1)
				{
					for (k = j;k <= j + i;k++)
					{
						System.out.printf("%c",s.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
	}

}


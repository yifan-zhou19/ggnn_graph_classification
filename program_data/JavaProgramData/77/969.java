package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] k = new int[101];
		String a = new String(new char[101]);
		char b;
		char g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0;i < n;i++)
		{
			k[i] = i;
		}
		b = a.charAt(0);
		for (i = 0;;i++)
		{
			if (a.charAt(i) != b)
			{
				g = a.charAt(i);
				break;
			}
		}
		while (n > 0)
		{
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == g)
				{
					System.out.printf("%d %d\n",k[i - 1],k[i]);
					for (j = i - 1;j < n;j++)
					{
						k[j] = k[j + 2];
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 2));
					}
					n = n - 2;
					i = i - 2;
				}
			}
		}
		return 0;
	}

}


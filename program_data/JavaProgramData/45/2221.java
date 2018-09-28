package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		char[][] zfc = new char[256][256];
		String w = new String(new char[256]);
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
		int n = s.length();
		int m = w.length();
		int i = 0;
		int j = 0;
		for (;i <= m - n;)
		{
			for (j = 0;j < n;j++)
			{
				 zfc[i][j] = w.charAt(i + j);
			}
			zfc[i][j] = '\0';
			i++;
		}
		for (j = 0;j < i;j++)
		{
			if (strcmp(zfc[j],s) == 0)
			{
				System.out.printf("%d\n",j);
				break;
			}
		}
		return 0;
	}

}


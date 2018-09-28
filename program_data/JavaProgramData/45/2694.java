package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[20]);
		String w = new String(new char[50]);
		char[][] a = new char[50][20];
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
		int l1 = s.length();
		int l2 = w.length();
		int i;
		int j;
		for (i = 0;i <= l2 - l1;i++)
		{
			for (j = 0;j <= l1 - 1;j++)
			{
				a[i][j] = w.charAt(i + j);
			}
			a[i][l1] = '\0';
		}
		for (i = 0;i <= l2 - l1;i++)
		{
			if (strcmp(a[i],s) == 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}

	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int p;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		char[][] c = new char[50][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		p = a.length();
		for (i = 0;i < 50;i++)
		{
		 for (j = i;j < p + i;j++)
		 {
			c[i][j - i] = b.charAt(j);
		 }
		 c[i][p] = '\0';
		}
		for (i = 0;i < 50;i++)
		{
			if (strcmp(a,c[i]) == 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}

	}
}


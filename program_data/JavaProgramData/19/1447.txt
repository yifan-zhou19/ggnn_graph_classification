package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String re = new String(new char[100]);
		String x = new String(new char[100]);
		char[][] wd = new char[50][100];
		int n;
		int i;
		int a = 0;
		int j = 0;
		int k;
		int e;
		int l;
		int[] nc = new int[100];
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			re = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
		   if (s.charAt(i) != ' ')
		   {
			 wd[a][j] = s.charAt(i);
			 j++;
		   }
		   if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
		   {
			 nc[a] = i;
			 wd[a][j] = '\0';
			 a++;
			 j = 0;
		   }
		}
		l = s.length() - nc[a - 1];
		wd[a][l - 1] = '\0';
		for (i = 0;i <= a;i++)
		{
		   if (strcmp(re,wd[i]) == 0)
		   {
			 wd[i] = x;
		   }
		}
		for (i = 0;i < a;i++)
		{
		   System.out.printf("%s ",wd[i]);
		}
		System.out.printf("%s",wd[a]);
		int t;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}


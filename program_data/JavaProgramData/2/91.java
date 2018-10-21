package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int x;
		int maxnumber;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[1000];
		char[][] k = new char[1000][30];
		int[] author = new int[27];
		for (i = 1;i <= n;i++)
		{
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[i] = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  k[i] = tempVar3.charAt(0);
						  }
						  int m;
						  m = String.valueOf(k[i]).length();
						  for (l = 0;l < 30;l++)
						  {
											for (x = 1;x <= 26;x++)
											{
															  if (k[i][l] == x + 64)
															  {
															  author[x]++;
															  }
											}
						  }
		}
		int max = 0;
		for (i = 1;i <= 26;i++)
		{
						  if (author[i] > max)
						  {
						  max = author[i];
						  }
		}
		for (i = 1;i <= 26;i++)
		{
						  if (author[i] == max)
						  {
						  maxnumber = i;
						  }
		}
		String who = new String(new char[10]);
		who = tangible.StringFunctions.changeCharacter(who, 0, 'A' + maxnumber - 1);
		System.out.printf("%c\n",who.charAt(0));
		System.out.printf("%d\n",max);
		for (i = 1;i <= n;i++)
		{
						 for (l = 0;l <= String.valueOf(k[i]).length();l++)
						 {
						 if (k[i][l] == who.charAt(0))
						 {
						 System.out.printf("%d\n",a[i]);
						 }
						 }
		}
		return 0;
	}

}


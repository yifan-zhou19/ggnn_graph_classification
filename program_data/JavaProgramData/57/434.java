package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int change = new int(char a[],int j);
		int n;
		int i;
		int j = 0;
		int k;
		char[][] a = new char[50][32];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
		}
		for (i = 0;i < n;i++)
		{
			j = String.valueOf(a[i]).length();
			j = change(a[i], j);
		  for (k = 0;k < j;k++)
		  {
			  System.out.printf("%c",a[i][k]);
		  }
		  System.out.print("\n");
		}
	 return 0;
	}
	public static int change(String a, int j)
	{
		if (a[j - 1].equals('r') && a[j - 2].equals('e'))
		{
			 j = j - 2;
		}
	 if (a[j - 1].equals('y') && a[j - 2].equals('l'))
	 {
			 j = j - 2;
	 }
	 if (a[j - 1].equals('g') && a[j - 2].equals('n') && a[j - 3].equals('i'))
	 {
			 j = j - 3;
	 }
	 return (j);
	}
}


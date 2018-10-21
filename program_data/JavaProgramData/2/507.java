package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int k;
	 int l;
	 int m;
	 int n;
	 int[] g = new int[26];
	 int[][] s = new int[26][1000];
	 String a = new String(new char[50]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (m = 0;m < n;m++)
	 {
		 for (i = 0;i < 50;i++)
		 {
	   a = a.substring(0, i);
		 }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  l = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a = tempVar3.charAt(0);
	  }
	  for (i = 0;i < 26;i++)
	  {
	   for (j = 0;j < 26;j++)
	   {
		if (a.charAt(i) == 'A' + j)
		{
			s[j][g[j]] = l,g[j]++;
		 break;
		}
	   }
	  }
	 }
	 m = 0;
	 for (i = 0;i < 26;i++)
	 {
	  if (g[i] > m)
	  {
		  m = g[i],k = i;
	  }
	 }
	 System.out.printf("%c\n%d\n",'A' + k,m);
	 for (i = 0;i < m;i++)
	 {
	  System.out.printf("%d\n",s[k][i]);
	 }

	}
}


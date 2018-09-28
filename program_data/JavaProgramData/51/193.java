package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int[] a = new int[1001];
	 String str = new String(new char[1001]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 char[][] s = new char[1001][1001];
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 str = tempVar2.charAt(0);
	 }
	 int i;
	 int j;
	 int t = 0;
	 int m;
	 int p;
	 m = str.length() - n;
	 for (i = 0;i <= m;i++)
	 {
	  for (j = 0;j < n;j++)
	  {
	   s[i][j] = str.charAt(i + j);
	  }
	 }
	 for (i = 0;i <= m;i++)
	 {
	   a[i] = 0;
	   for (j = 0;j <= m;j++)
	   {
		if (strcmp(s[i],s[j]) == 0)
		{
			a[i]++;
		}
	   }
	 }
	 for (i = 0;i <= m;i++)
	 {
	  if (a[i] > t)
	  {
		  t = a[i];
	  }
	 }
	 if (t == 1)
	 {
		 System.out.print("NO\n");
	 }
	 else
	 {
	 System.out.printf("%d\n",t);
	 for (i = 0;i <= m;i++)
	 {
		 p = 0;
		 for (j = 0;j < i;j++)
		 {
			 if (strcmp(s[i],s[j]) == 0)
			 {
				 p = 1;
			 }
		 }
		 if (a[i] == t && p == 0)
		 {
			 System.out.printf("%s\n",s[i]);
		 }
	 }
	 }
	}
}


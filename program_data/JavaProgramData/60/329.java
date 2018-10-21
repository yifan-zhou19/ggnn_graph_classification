package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int c = 0;
		 int n;
		 int i;
		 int sq;
		 int k;
		 int j = 0;
		 int[] s = new int[100000];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 3;i < n + 1;i = i + 2)
		 {
		   j = 0;
		   sq = Math.sqrt(i);
		   for (k = 2;k <= sq;k++)
		   {
		   if (i % k == 0)
		   {
		   j++;
		   }
		   }
		   if (j == 0)
		   {
			   s[i] = i;
		   }
		 }
		   for (i = 3;i <= n;i = i + 2)
		   {
		   if (s[i] != 0 && s[i + 2] != 0)
		   {
		   System.out.printf("%d %d\n",s[i],s[i + 2]);
		   c++;
		   }
		   }
		   if (c == 0)
		   {
		   System.out.print("empty");
		   }
	}

}


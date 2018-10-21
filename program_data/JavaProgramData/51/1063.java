package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		   int n;
		   int m;
		   int i;
		   int j;
		   int[] a = new int[1000];
		   int[] b = new int[1000];
		   int k = 0;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   char[][] s = new char[1000][10];
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   str = tempVar2.charAt(0);
		   }
		   for (i = 0;i < str.length() - n + 1;i++)
		   {
			   for (j = 0;j < n;j++)
			   {
		   s[i][j] = str.charAt(i + j);
			   }
			s[i][n] = '\0';
		   }
		   for (i = 0;i < str.length() - n + 1;i++)
		   {

		   for (j = i;j < str.length() - n + 1;j++)
		   {

		   if (strcmp(s[i],s[j]) == 0)
		   {
		   a[i]++;
		   }
		   }
		   }
			for (i = 0;i < str.length() - n + 1;i++)
			{
			if (a[i] > k)
			{
				k = a[i];
			}
			}
			if (k > 1)
			{
				System.out.printf("%d\n",k);
			for (i = 0;i < str.length() - n + 1;i++)
			{
			if (a[i] == k)
			{
				System.out.printf("%s\n",s[i]);
			}
			}
			}
			else
			{
				System.out.print("NO");
			}

	}

}


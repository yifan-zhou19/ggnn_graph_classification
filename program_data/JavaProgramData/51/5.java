package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int y = 0;
		int k = 0;
		int[] b = new int[500];
		int max;
	 String s = new String(new char[500]);
	 char[][] a = new char[500][5];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 s = tempVar2.charAt(0);
	 }
	 m = s.length();
	 for (i = 0;i <= m - n;i++)
	 {
			 for (j = 0;j < n;j++)
			 {
					  a[i][j] = s.charAt(k);
					  k++;
			 }
				  k = k - n + 1;
	 }
		 for (i = 0;i <= m - n;i++)
		 {
			   b[i] = 1;
			   for (j = i + 1;j <= m - n;j++)
			   {
					   if (strcmp(a[i],a[j]) == 0)
					   {
						   b[i]++;
					   }
			   }
		 }
		   max = b[0];
		for (i = 0;i <= m - n;i++)
		{
				if (b[i] > max)
				{
					max = b[i];
				}
		}
	for (i = 0;i <= m - n;i++)
	{
			 if (b[i] == max)
			 {
				 y++;
			 }
	}
		if (max > 1)
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= m - n;i++)
			{
				   if (b[i] == max)
				   {
					   System.out.printf("%s\n",a[i]);
				   }
			}
		}
			   else
			   {
				   System.out.print("NO");
			   }
	}

}


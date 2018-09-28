package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   String c = new String(new char[500]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   c = tempVar2.charAt(0);
	   }
	   int[] m = new int[300];
	   int i;
	   int j;
	   int k;
	   for (i = 0;i < 300;i++)
	   {
		   m[i] = 0;
	   }
	   int t;
	   int p;
	   int q;
	   char[][] s =
	   {
		   {0, '\0', '\0', '\0', '\0'}
	   };
	   t = 0;
	   for (i = 0;i < c.length() - 1;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			   s[t][j] = c.charAt(i + j);
		   }
		   t++;
	   }
	   for (i = 0;i < t;i++)
	   {
			for (j = i + 1;j < t;j++)
			{
				if (strcmp(s[i],s[j]) == 0)
				{
					m[i]++;
				}
			}
	   }
	   k = 0;
	   for (i = 0;i < t;i++)
	   {
		   if (m[i] > k)
		   {
			   k = m[i];
		   }
	   }
	   if (k > 0)
	   {
		   System.out.printf("%d\n",k + 1);
		   for (i = 0;i < t;i++)
		   {
			   if (m[i] == k)
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


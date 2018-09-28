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
	   int x;
	   String a = new String(new char[1000]);
	   int[] c = new int[1000];
	   int[] d = new int[1000];
	   char[][] b = new char[1000][1000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = tempVar2.charAt(0);
	   }
	   n = a.length();
	   l = n + 1 - m;
	   for (i = 0;i < l;i++)
	   {
			  for (j = 0;j < m;j++)
			  {
					 b[i][j] = a.charAt(i + j);
			  }
	   }
	   for (i = 0;i < l;i++)
	   {
			  for (j = i + 1;j < l;j++)
			  {
					 for (k = 0,x = 0;k < m;k++)
					 {
							if (b[i][k] == b[j][k])
							{
								x = x + 1;
							}
					 }
					 if (x == m)
					 {
						 c[i]++;
					 }
					 d[i] = c[i];
			  }
	   }
	   for (i = 0;i < l;i++)
	   {
			  for (j = 0;j < l - 1;j++)
			  {
					 if (c[j] > c[j + 1])
					 {
						   x = c[j + 1];
						   c[j + 1] = c[j];
						   c[j] = x;
					 }
			  }
	   }
	   x = c[l - 1];
	   if (x == 0)
	   {
		   System.out.print("NO");
	   }
	   else
	   {


	   System.out.printf("%d\n",x + 1);
	   for (i = 0;i < l;i++)
	   {
			  if (d[i] == x)
			  {
					for (k = 0;k < m;k++)
					{
						 System.out.printf("%c",b[i][k]);
					}
					System.out.print("\n");
			  }
	   }
	   }
	}

}


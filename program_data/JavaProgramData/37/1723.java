package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int t;
		  int i;
		  int j;
		  int k;
		  int[] b = new int[10];
		  int[] m = new int[10000];
		  char[][] a = new char[10][10000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i <= t - 1;i++)
		  {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i] = tempVar2.charAt(0);
			   }
			   b[i] = String.valueOf(a[i]).length();
		  }
		  for (i = 0;i <= t - 1;i++)
		  {
			   for (j = 0;j <= b[i] - 1;j++)
			   {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
					memset(m,0,10000 * (Integer.SIZE / Byte.SIZE));
					 for (k = 0;k <= b[i] - 1;k++)
					 {
							if (a[i][j] == a[i][k])
							{
							m[j] = m[j] + 1;
							}
					 }
					 if (m[j] == 1)
					 {
						System.out.printf("%c\n",a[i][j]);
						break;
					 }
			   }
			   if (j == b[i] && m[b[i] - 1] != 1)
			   {
			   System.out.print("no\n");
			   }
		  }

	}
}


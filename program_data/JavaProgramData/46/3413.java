package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] s = new int[100][100];
	   int i = 0;
	   int j;
	   int r;
	   int R;
	   int C;
	   int c;
	   int q;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   R = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   C = Integer.parseInt(tempVar2);
	   }
	   for (r = 0;r < R;r++)
	   {
		   for (c = 0;c < C;c++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   s[r][c] = Integer.parseInt(tempVar3);
			   }
		   }
	   }
	   for (q = 0;i < R * C;q++)
	   {
		   for (j = q;j < C - q;j++)
		   {
			   System.out.printf("%d\n",s[q][j]);
			   i++;
			   if (i == R * C)
			   {
				 return 0;
			   }
		   }
		   for (j = q + 1;j < R - q;j++)
		   {
			   System.out.printf("%d\n",s[j][C - 1 - q]);
			   i++;
			   if (i == R * C)
			   {
				 return 0;
			   }
		   }
		   for (j = C - 2 - q;j > q - 1;j--)
		   {
			   System.out.printf("%d\n",s[R - 1 - q][j]);
			   i++;
			  if (i == R * C)
			  {
			  return 0;
			  }
		   }
		   for (j = R - 2 - q;j > q;j--)
		   {
				 System.out.printf("%d\n",s[j][q]);
				 i++;
				 if (i == R * C)
				 {
				 return 0;
				 }
		   }

	   }
	   return 0;
	}





}


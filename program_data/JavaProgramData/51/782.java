package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int n;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   String a = new String(new char[500]);
		   a = new Scanner(System.in).nextLine();
		   int len;
		   int i;
		   int j;
		   int max = 0;
		   int k;
		   int m;
		   len = a.length();
		   char[][] b = new char[500][n];
		   for (i = 0;i < len - n + 1;i++)
		   {
		   for (j = 0;j < n;j++)
		   {
		   b[i][j] = a.charAt(i + j);
		   }
		   }
		   int[] num = new int[500];
		   for (i = 0;i < len - n;i++)
		   {
							   num[i] = 1;
							   String c = new String(new char[n + 1]);
							   for (m = 0;m < n;m++)
							   {
							   c = tangible.StringFunctions.changeCharacter(c, m, b[i][m]);
							   }
							   //c[m]=0;
							   for (j = i + 1;j < len - n + 1;j++)
							   {
													   String d = new String(new char[n + 1]);
													   for (k = 0;k < n;k++)
													   {
													   d = tangible.StringFunctions.changeCharacter(d, k, b[j][k]);
													   }
													   //d[k]=0;
													   if (strcmp(c,d) == 0)
													   {
													   num[i]++;
													   }
							   }
		   }
		   max = num[0];
		   for (i = 0;i < len - n;i++)
		   {
		   if (num[i] > max)
		   {
		   max = num[i];
		   }
		   }
		   if (max == 1)
		   {
		   System.out.print("NO");
		   return 0;
		   }
		   int count = 0;
		   for (i = 0;i < len - n + 1;i++)
		   {
		   if (num[i] == max)
		   {
						  count++;
		   }
		   }
		   System.out.printf("%d\n",max);
		   for (i = 0;i < len - n + 1;i++)
		   {
		   if (num[i] == max)
		   {
						  for (j = 0;j < n;j++)
						  {
						  System.out.printf("%c",b[i][j]);
						  }
						  System.out.print("\n");
		   }
		   }
	}

}


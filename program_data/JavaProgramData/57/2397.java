package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int a;
	   int b;
	   int i;
	   int j;
	   char c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   char[][] n = new char[a][32];
	   int[] m = new int[a];
	   for (i = 0;i <= 32;i++)
	   {
		   m[i] = 0;
	   }
	   for (i = 0;i < a;i++)
	   {
		   j = 0;
		  while ((c = System.in.read()) != '\n')
		  {
					  n[i][j++] = c;
					  m[i] = m[i] + 1;
		  }
	   }
	   for (i = 0;i < a;i++)
	   {
		   if (n[i][m[i] - 1] == 'g')
		   {
			  n[i][m[i] - 3] = '\0';
			  System.out.printf("%s\n",n[i]);
		   }
		   else
		   {
			  n[i][m[i] - 2] = '\0';
			  System.out.printf("%s\n",n[i]);
		   }

	   }
	}

}


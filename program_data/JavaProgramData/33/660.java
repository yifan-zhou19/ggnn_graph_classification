package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int n;
	   int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * b;
	   char[][] x = new char[1000][300];
	   char[][] y = new char[1000][300];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (a = 0;a < n;a++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   x[a] = tempVar2.charAt(0);
		   }

		   for (b = x[a],i = 0; * b != '\0';b++,i++)
		   {
			  if (*b == 'A')
			  {
			   y[a][i] = 'T';
			  }
			  if (*b == 'G')
			  {
			   y[a][i] = 'C';
			  }
			  if (*b == 'C')
			  {
			   y[a][i] = 'G';
			  }
			  if (*b == 'T')
			  {
			   y[a][i] = 'A';
			  }
		   }
		System.out.printf("%s\n",y[a]);
	   }
		  return 0;

	}
}


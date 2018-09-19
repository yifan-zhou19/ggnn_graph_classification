package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] val = new int[LEN][LEN];
	   int i;
	   int j;
	   int posr;
	   int posc;
	   int n;
	   int r;
	   int c;
	   int flag = 0;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }

	   for (i = 0;i <= n - 1;i++)
	   {
		   for (j = 0;j <= n - 1;j++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   val[i][j] = Integer.parseInt(tempVar2);
			   }
		   }
	   }

	   for (i = 0;i <= n - 1;i++)
	   {
		   for (j = 0;j <= n - 1;j++)
		   {
			   if (val[i][j] == 0 && flag == 0)
			   {
					  flag = 1;
					  posr = i;
					  posc = j;
			   }
		   }
	   }


	   i = posr;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
	   while (val[i++][posc] == 0)
	   {
		   ;
	   }

	   r = i - posr - 3;

	   for (j = posc;val[posr][j] == 0;j++)
	   {
		   ;
	   }
	   c = j - posc - 2;

	   System.out.printf("%d",r * c);

	   System.in.read();
	   System.in.read();

	   return 0;

	}

}


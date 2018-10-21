package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   final String maze = "";
	   final String maze1 = "";
	   int i;
	   int j;
	   int n;
	   int m;
	   int k;
	   int num = 0;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= n;i++)
	   {
	   for (j = 1;j <= n;j++)
	   {
		  maze.charAt(i)[j] = ConsoleInput.readToWhiteSpace(true);
	   }
	   }
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   k = 1;
	   for (;;)
	   {
			  if (k >= m)
			  {
				  break;
			  }
	   for (i = 1;i <= n;i++)
	   {
	   for (j = 1;j <= n;j++)
	   {
			maze1.charAt(i)[j] = maze.charAt(i)[j];

	   }
	   }
	   for (i = 1;i <= n;i++)
	   {
	   for (j = 1;j <= n;j++)
	   {

		   if (maze.charAt(i)[j] == '@')
		   {
			  if (maze.charAt(i + 1)[j] == '.')
			  {
				  maze1.charAt(i + 1)[j] = '@';
			  }
			  if (maze.charAt(i - 1)[j] == '.')
			  {
				  maze1.charAt(i - 1)[j] = '@';
			  }
			  if (maze.charAt(i)[j + 1] == '.')
			  {
				  maze1.charAt(i)[j + 1] = '@';
			  }
			  if (maze.charAt(i)[j - 1] == '.')
			  {
				  maze1.charAt(i)[j - 1] = '@';
			  }
		   }
	   }
	   }
	   for (i = 1;i <= n;i++)
	   {
	   for (j = 1;j <= n;j++)
	   {
			maze.charAt(i)[j] = maze1.charAt(i)[j];

	   }
	   }
		k++;
	   }
	   for (i = 1;i <= n;i++)
	   {
	   for (j = 1;j <= n;j++)
	   {
		  if (maze.charAt(i)[j] == '@')
		  {
			  num++;
		  }
	   }
	   }
		  System.out.print(num);



		return 0;
	}

}


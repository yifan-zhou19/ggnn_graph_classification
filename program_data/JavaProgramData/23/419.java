package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		}; //??????????
	   int i = 0;
	   int j = 0;
	   char b;
	   while (true)
	   {
		   cin.get(b);
		  if (b == '\n')
		  {
			  break; //????????
		  }
		  else
		  {
				if (b == ' ')
				{
					  i = i + 1;
					   j = 0;
					   continue; //??????????
				}
			   else //????????
			   {
					 a[i][j] = b;
					j = j + 1;
			   }
		  }


	   }
	  for (j = i;j > 0;j--)
	  {
			  System.out.print(a[j]);
			  System.out.print(' ');
	  }
	   System.out.print(a[0]);
	   return 0;
	}
}

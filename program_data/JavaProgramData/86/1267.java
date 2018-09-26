package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int[] a = new int[10000];
	   int[] b = new int[10000];
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++)
	   {
		   int[] c = new int[100];
		   int j;
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (a[i] == 0)
		   {
			   b[i] = 60;
			   continue;
		   }
		   for (j = 1;j <= a[i];j++)
		   {
			   c[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		   c[a[i] + 1] = 111;
		  for (j = 1;j <= a[i];j++)
		  {
			  if ((c[j] + (j - 1) * 3) <= 57 && (c[j + 1] + (j) * 3)>57)
			  {
				  if ((c[j + 1] + (j - 1) * 3) > 60)
				  {
					  b[i] = 60 - j * 3;
				  }
				  else
				  {
					  b[i] = 60 - j * 3 - (60 - c[j + 1] - j * 3);
				  }
				  break;
			  }
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		   System.out.print(b[i]);
		   System.out.print("\n");
	   }
	   return 0;
	}

}


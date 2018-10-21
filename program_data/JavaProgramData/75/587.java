package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int x;
	  int y;
	  int n;
	  int i;
	  int j;
	  int l;
	  int max;
	  char c;
	  n = 0;
	  int[] m = new int[1000];
	  for (i = 0 ; ; i++)
	  {
	   if (i % 2 == 0)
	   {
		   x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   m[i / 2] = x;
		   n++;
	   }
	   else
	   {
		  c = System.in.read();
		  if (c == ',')
		  {
			  continue;
		  }
		  else
		  {
			  break;
		  }
	   }
	  }
	  int[] a = new int[n];
	  int[] b = new int[n];
	  int[] t = new int[n];
	  for (i = 0 ; i <= n - 1 ; i++)
	  {
		 a[i] = m[i];
	  }
	  for (i = 0 ; i <= 2 * n - 2 ; i++)
	  {
		 if (i % 2 == 0)
		 {
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i / 2] = y;
		 }
		 else
		 {
			c = System.in.read();
		 }
	  }
	  for (i = 0 ; i <= n - 1 ; i++)
	  {
		 l = 0;
		 for (j = 0 ; j <= n - 1 ; j++)
		 {
			 if ((a[i] >= a[j]) && (a[i] < b[j]))
			 {
				 l++;
			 }
		 }
		 t[i] = l;
	  }
	  max = t[0];
	  for (i = 1 ; i <= n - 1 ; i++)
	  {
		if (t[i] > max)
		{
		   max = t[i];
		}
	  }
	  System.out.print(n);
	  System.out.print(" ");
	  System.out.print(max);
	 return 0;
	}



}


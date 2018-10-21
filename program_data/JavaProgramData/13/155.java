package <missing>;

public class GlobalMembers
{
	//10?28?????????????????1000012899
	public static int Main()
	{
		int n;
		int[] a = new int[20001];
		int[] b = new int[20001];
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n;
		for (i = 1; i <= n; i++)
		{
			b[i] = 0;
		}
		for (i = 1; i <= n; i++)
		{
			  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  b[a[i]] = 1;
		}
		i = 2;
		System.out.print(a[1]);
		b[a[1]] = 0;
		  do
		  {
			if (b[a[i]] == 1)
			{
				 System.out.print(' ');
				 System.out.print(a[i]);
				 b[a[i]] = 0;
			}
			m = m - 1;
			i = i + 1;
		  } while (m >= 0);
	  /*   do
	      {
	        if ( b[a[i]] == 1) 
	          {
	             cout << a[i];
	             b[a[i]] = 0;
	           }
	        m = m - 1;
	        i = i + 1;
	       }
	         while(m > 0); */
	   return 0;
	}






}


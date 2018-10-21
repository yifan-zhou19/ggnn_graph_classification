package <missing>;

public class GlobalMembers
{
	public static char[] a = {0};
	public static char[] b = {0};
	public static int[] c = new int[N + 1];
	public static int[] d = new int[N + 1];
	public static int[] e = new int[N + 2];
	public static int x = 0;
	public static int f;
	public static int k;
	public static int sum;
	public static int Main()
	{
	   int p = -1;
	   int q = -1;
	   for (int i = 1;;i++)
	   {
				a[i] = System.in.read();
				p++;
				if (a[i] == '\n')
				{
				 break;
				}
	   }

	   for (int i = 1;;i++)
	   {
			   b[i] = System.in.read();
			   q++;
			   if (b[i] == '\n')
			   {
			   break;
			   }
	   }

	   for (int i = 1;i <= p;i++)
	   {
		   c[i] = a[p + 1 - i] - '0';
	   }

		for (int i = 1;i <= q;i++)
		{
		   d[i] = b[q + 1 - i] - '0';
		}

	   for (int i = 1;i <= N;i++)
	   {

		e[i] += c[i] + d[i];
		e[i + 1] += e[i] / 10;
		e[i] %= 10;

	   }
		for (int i = N;i >= 1;i--)
		{
			  sum += e[i];
		}
		  if (sum == 0)
		  {
		  System.out.print(0);
		  }
		  else
		  {
		for (int i = N;i >= 1;i--)
		{
		  if (e[i] != 0)
		  {
		   k = i;
		  for (int j = k;j >= 1;j--)
		  {
		   System.out.print(e[j]);
		  }
		   break;
		  }

		}
		  }

		 return 0;
	}

}

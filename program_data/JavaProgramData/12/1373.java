package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int t;
	int m;
	int x;
	int l;
	int[] a = new int[15];
	for (m = 1 ; ;m++)
	{
	  for (x = 1 ; x <= 16 ; x++)
	  {
		l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (l != 0)
		{
		  a[x - 1] = l;
		}
		else
		{
		  n = x - 1;
		  t = 0;
		  for (i = 0 ; i <= n - 2 ; i++)
		  {
			 for (j = i + 1 ; j <= n - 1 ; j++)
			 {
			   if ((a[i] == 2 * a[j]) || (a[j] == 2 * a[i]))
			   {
			   t++;
			   }
			 }
		  }
		  System.out.print(t);
		  System.out.print("\n");
		  break;
		}
	  }
	}
	return 0;
	}
}


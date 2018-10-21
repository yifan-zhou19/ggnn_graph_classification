package <missing>;

public class GlobalMembers
{
	public static int qq(int m)
	{
		int i;
		int j;
		j = 0;
		for (i = 2;i * i <= j;i++)
		{
		 if (m % i == 0)
		 {
		  j = 1;
		 break;
		 }
		}
		 return j;
	}

	public static int pp(int m,int j)
	{
	   int i;
	   int k = 0;
	   if (m == 1)
	   {
	   return 1;
	   }
	   else
	   {
	   k++;
	   for (i = j;i * i <= m;i++)
	   {
		if (qq(i) == 0 && m % i == 0)
		{
		 k = k + pp(m / i, i);
		}
	   }
	   }
	  return k;
	}

	public static int Main()
	{
		int n;
		int i;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] aa = new int[n + 1];
		for (i = 1;i <= n;i++)
		{
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		aa[i] = pp(p, 2);
		}
	   for (i = 1;i <= n;i++)
	   {
	   System.out.print(aa[i]);
	   System.out.print("\n");
	   }

		return 0;
	}
}


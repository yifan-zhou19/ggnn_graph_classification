package <missing>;

public class GlobalMembers
{
	public static int rr(int a)
	{
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
		return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int p;
		int q;
		int i;
		int k;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] aa = new int[n + 1];
		int[] bb = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 1;i <= n;i++)
		{
			 k = 0;
		  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  if (p > q)
		  {
			 t = q;
			 q = p;
			 p = t;
		  }
		  while (p < q)
		  {
			 k = k + bb[p];
			 if (p == 2)
			 {
			 k = k + rr(m);
			 }
			 p++;
		  }
		   if (k % 7 == 0)
		   {
		   aa[i] = 1;
		   }
		   else
		   {
			   aa[i] = 0;
		   }
		}
		   for (i = 1;i <= n;i++)
		   {
			if (aa[i] == 1)
			{
			System.out.print("YES");
			System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		   }
		   return 0;
	}
}


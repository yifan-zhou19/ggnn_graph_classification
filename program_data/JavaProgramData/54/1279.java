package <missing>;

public class GlobalMembers
{
	///#include<stdio.h>
	///#include<time.h>


	public static int div_foo(int n, int k, int index, int m)
	{
	  if (index == n)
	  {
		return m * n + k;
	  }
	  else if (index == 1)
	  {
		int iter;
		int A;
		for (int i = 0;;i++)
		{
		  A = div_foo(n, k, index + 1, m + i);
		  iter = A / (n - 1);
		  if (A != 0 && (A + iter + k) % n == k)
		  {
			  break;
		  }
		}
		return A + iter + k;
	  }
	  else
	  {
		int iter;
		int A = div_foo(n, k, index + 1, m);
		iter = A / (n - 1);
		if ((A + iter + k) % n != k || A == 0 || (A + iter + k) / n != iter)
		{
			return 0;
		}
		else
		{
			return A + iter + k;
		}
	  }
	}

	public static int Main()
	{
	  int n;
	  int k;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  System.out.print(div_foo(n, k, 1, 1));
	  System.out.print("\n");
	  //printf("%.21f",(double) clock()/CLOCKS_PER_SEC);
	  return 0;
	}

}


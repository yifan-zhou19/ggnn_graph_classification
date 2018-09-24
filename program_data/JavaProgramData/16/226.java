package <missing>;

public class GlobalMembers
{
	public static int e(int n)
	{
		if (n == 0)
		{
			return 1;
		}
		return 10 * e(n - 1);
	}
	public static int Main()
	{
		int N;
		int[] a = new int[4];
		int i = 0;
		int t = 0;
		int n = 0;
	  while (scanf("%d", N) != EOF)
	  {
		  if (N != 0)
		  {
		  i = t = n = 0;
		  while (N % (1 * e(i)) != N)
		  {
			  a[i] = (N % (1 * e(i + 1)) - N % (1 * e(i))) / (1 * e(i));
			  i++;
		  }
		  while (t <= i - 1)
		  {
			  System.out.printf("%d",a[t]);
			  t++;
		  }
		  System.out.print("\n");
		  }
		  else
		  {
			  System.out.print("0\n");
		  }
	  }
	  return 0;
	}
}

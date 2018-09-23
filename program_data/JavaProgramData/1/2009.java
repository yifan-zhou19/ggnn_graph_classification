package <missing>;

public class GlobalMembers
{
	public static int fenj(int x, int y)
	{
	  int a = (x == 1);
	  int i;
	  for (i = y;i <= x;i++) //???2?????????
	  {
		  if (x % i == 0)
		  {
			  a = a + fenj(x / i, i); //?????????
		  }
	  }
	  return a;
	}
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[k];
		for (int i = 0;i < k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < k;i++)
		{
			System.out.print(fenj(a[i], 2));
			System.out.print("\n");
		}
		return 0;
	}
}


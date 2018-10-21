package <missing>;

public class GlobalMembers
{
	public static int count(int x,int y) //?????????
	{
		if (x < y)
		{
			return 0; //????
		}
		if (x >= y)
		{
		  int sum = 0;
		  for (int j = y;j < x;j++)
		  {
			if (x % j == 0)
			{
			sum = sum + count(x / j, j); //???
			}
		  }
		  return sum + 1;
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
		System.out.print(count(a[i], 2));
		System.out.print("\n");
		}
		return 0;
	}

}


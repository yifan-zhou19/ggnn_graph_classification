package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n + 1]; //a[n]?????????????
		int d = 1;
		a[1] = 0;
		for (a[n] = n + k;d == 1;a[n] = a[n] + n)
		{
		  for (int i = n;i > 1;i--)
		  {
			if (a[i] % (n - 1) == 0) //????
			{
			a[i - 1] = a[i] * n / (n - 1) + k; //????
			}
			else
			{
			break;
			}
		  }
		  if (a[1] != 0) //??????????a[1]
		  {
		  d = 0;
		  }
		}
		System.out.print(a[1]);
		System.out.print("\n");
		return 0;
	}

}


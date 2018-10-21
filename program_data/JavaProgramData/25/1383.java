package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[42]; //?????????0
		int N;
		int i;
		int j;
		int k;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[41] = 1; //??????????2
		if (N == 0)
		{
			System.out.print("1");
			System.out.print("\n");
			return 0;
		}
		for (k = 1; k <= N; k++) //????N??2
		{
			for (i = 41; i >= 0; i--) //??????2
			{
				a[i] = a[i] * 2;
			}
			for (j = 41; j >= 0; j--) //?????
			{
				if (a[j] >= 10)
				{
					a[j - 1] += a[j] / 10;
					a[j] = a[j] % 10; //??
				}
			}
		}
		i = 0; //?i???
		  while (a[i] == 0) //???????0??
		  {
				i++;
		  }
		for (; i <= 41; i++) //????
		{
			 System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}




}


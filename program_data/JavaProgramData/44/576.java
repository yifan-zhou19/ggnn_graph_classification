package <missing>;

public class GlobalMembers
{
	public static int kobe(int n)
	{
		int i = 0;
		int bj = 1;
		for (i = 0;i < n;i++)
		{
			bj *= 10;
		}
		return bj;
	}



	public static int reverse(int num)
	{
		int i = 0;
		int j = 0;
		int x = 0;
		int rev = 0;
		int[] a = new int[100];
		if (num == 0)
		{
			return 0;
		}
		while (num != 0)
		{
			a[i] = num % 10;
			num /= 10;
			j++;
			i++;
			x++;


		}
		j -= 1;
		for (i = 0; i < x; i++)
		{
			rev += a[i] * kobe(j);
			j--;

		}


		return rev;
	}


	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
		System.out.print(reverse(n));
		System.out.print("\n");
		}
		return 0;
	}


}


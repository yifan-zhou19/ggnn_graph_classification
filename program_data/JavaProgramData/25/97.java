package <missing>;

public class GlobalMembers
{
	//**********************************
	//????1000012825               *
	//??????                     *
	//???12.15                      *
	//?????2?N??               *
	//**********************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[101];
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1;
		for (i = 1; i <= n; i++)
		{
			for (j = 0; j <= 100; j++)
			{
				a[j] = a[j] * 2; //????????
			}
			for (j = 0; j <= 100; j++)
			{
				if (a[j] >= 10)
				{
					a[j] = a[j] % 10;
					a[j + 1]++; //?????????????????????
				}
			}
		}
		for (i = 100; a[i] == 0; i--)
		{
			k = i;
		}
		for (j = k - 1 ;j >= 0; j--) //?????0???????
		{
			System.out.print(a[j]);
		}
		System.out.print("\n");
		return 0;
	}

}


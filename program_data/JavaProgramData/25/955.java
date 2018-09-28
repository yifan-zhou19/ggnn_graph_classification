package <missing>;

public class GlobalMembers
{
	//**********************
	//* 2.cpp 



	public static int Main()
	{
		int[] a = new int[35];
		int m;
		int i;
		int j;
		int p = 0;
		int[] b = new int[35];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[34] = 1;
		for (j = 1; j <= m; j++)
		{
			for (i = 34; i >= 1; i--)
			{
				b[i] = a[i] * 2 % 10 + b[i];
				b[i - 1] = a[i] * 2 / 10 + b[i - 1];
			}
			for (i = 0; i <= 34; i++)
			{
				a[i] = b[i];
				b[i] = 0;
			}
		}
		for (i = 0; i <= 34; i++)
		{
			if (a[i] != 0)
			{
				p = 1;
			}
			if (p == 1)
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}




}


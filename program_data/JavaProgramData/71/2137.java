package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int t;
		int sum = 0;
		int n;
		int m;
		int[] A = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??????
		int[] B = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0;m < n;m++)
		{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (b > c) //??????????????
		{
			t = b;
			b = c;
			c = t;
		}
		sum = 0;
		if (((a % 4 == 0 && a % 100 != 0) || ((a % 400) == 0)) == 1) //??????
		{
			for (i = b;i < c;i++)
			{
				sum += A[i];
			}
		}
		else
		{
			for (i = b;i < c;i++)
			{
				sum += B[i];
			}
		}
		if (sum % 7 == 0)
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


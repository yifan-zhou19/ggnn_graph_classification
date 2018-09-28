package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //a????????b????????n????
		int n;
		int[] a = new int[102];
		int[] b = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0) //??n?0
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else //??n????
		{
			for (j = 1;j <= n;j++) //???n?
			{
				for (i = 0;i < 101;i++) //?????????
				{
					a[i] = 2 * b[i];
				}
				for (i = 0; i < 101; i++) //????????????10???1
				{
					if (a[i] >= 10)
					{
						a[i + 1] += a[i] / 10;
						a[i] %= 10;
					}
				}
				while (a[i] == 0) //???????0??
				{
					i--;
				}
				for (; i >= 0; i--) //???????????????b
				{
					b[i] = a[i];
					if (j == n) //?????n?
					{
						System.out.print(a[i]);
					}
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}


package <missing>;

public class GlobalMembers
{
	//????4_1.cpp
	//???2013?10?
	//????????
	public static int Main()
	{
		int j;
		for (j = 1;;j++)
		{
		int[] a = new int[301];
		int i;
		int m;
		int n;
		int k;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((m == 0) && (n == 0))
		{
			break;
		}
		for (i = 1;i <= n;i++) //?a[i]??????
		{
			a[i] = 1;
		}
		t = n;
		k = 0;
		i = 0;
		while (n > 1) //?????????????????
		{
			k = k + 1;
			i = i + 1;
			int i0 = i;
			for (;;i0++)
			{
			if (i0 > t)
			{
				i0 = i0 - t;
			}
			if (a[i0] == 1)
			{
				i = i0;
				break;
			}
			}
			if (k == m)
			{
				a[i] = 0;
				k = 0;
				n = n - 1;
			}
		}
		for (i = 1;i <= t;i++) //????????????????
		{
			if (a[i] == 1)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		}
		return 0;
	}







}


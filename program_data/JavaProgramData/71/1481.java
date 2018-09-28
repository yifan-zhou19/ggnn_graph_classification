package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		int rem;
		int mon1;
		int mon2;
		int i;
		int k;
		int year;
		int mon;
		int sum;
		int j;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //???????
		int[] b = new int[200]; //???????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //?????????
		{
				sum = 0; //sum??
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (mon2 < mon1) //???????????????????????????
			{
				mon = mon2;
				mon2 = mon1;
				mon1 = mon;
			}
			if (year % 400 == 0) //??????
			{
				a[1] = 29;
			}
			else if ((year % 4 == 0) && (year % 100 != 0))
			{
				a[1] = 29;
			}
			else
			{
				a[1] = 28;
			}
			if (mon1 == mon2)
			{
				b[i] = 1;
			}
			for (j = mon1;j < mon2;j++) //??????????
			{
				sum = sum + a[j - 1];
			}
			rem = sum % 7; // ??????
			if (rem == 0) //???????????????????
			{
			 b[i] = 1;
			}
			else
			{
				b[i] = 0;
			}
		}
		for (k = 0;k < n;k++) //???????
		{
			if (b[k] == 1)
			{
			System.out.print("YES");
			System.out.print("\n");
			}
			else if (b[k] == 0)
			{
			System.out.print("NO");
			System.out.print("\n");
			}
		}
		return 0; //????
	}
}


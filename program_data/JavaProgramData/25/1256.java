package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		int length = 1;
		int mark = 0;
		int[] a = new int[110];
		a[0] = 1; //???
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < n; i++) //???N?
		{
			for (int j = 0; j <= length; j++)
			{
				a[j] = a[j] + a[j]; //??????
				if (mark == 1)
				{
					a[j]++; //??????????1
					mark = 0;
				}
				if (a[j] >= 10) //???????10????10???????????
				{
					a[j] -= 10;
					mark = 1;
				}
			}
			if (a[length] != 0) //?????0?????1
			{
				length++;
			}
		}

		for (int k = 0; k < length; k++) //??
		{
			System.out.print(a[length - 1 - k]);
		}
		return 0;
	}



}


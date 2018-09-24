package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] amount =
		{
			{1, 2, 3},
			{1, 3, 2},
			{2, 1, 3},
			{2, 3, 1},
			{3, 2, 1},
			{3, 1, 2}
		}; //??????
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0;i <= 5;i++) //???????????
		{
			int A = 0;
			int B = 0;
			int C = 0;
			if (amount[i][1] > amount[i][0])
			{
				A++;
				C++;
			}
			if (amount[i][1] < amount[i][0])
			{
				B++;
			}
			if (amount[i][0] > amount[i][2])
			{
				B++;
			}
			if (amount[i][2] > amount[i][1])
			{
				C++;
			}
			if ((amount[i][0] - amount[i][1]) * (A - B) < 0 && (amount[i][1] - amount[i][2]) * (B - C) < 0 && (amount[i][0] - amount[i][2]) * (A - C) < 0) //???????
			{
				a = amount[i][0];
				b = amount[i][1];
				c = amount[i][2];
				break;
			}
		}
		if (a < b && b < c)
		{
			System.out.print("ABC");
		}
		else if (a < c && c < b)
		{
			System.out.print("ACB");
		}
		else if (b < a && a < c)
		{
			System.out.print("BAC");
		}
		else if (b < c && c < a)
		{
			System.out.print("BCA");
		}
		else if (c < b && b < a)
		{
			System.out.print("CBA");
		}
		else if (c < a && a < b)
		{
			System.out.print("CAB");
		}
		return 0;
	}
}

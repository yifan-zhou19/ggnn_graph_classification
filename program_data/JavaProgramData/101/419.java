package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] rank =
		{
			{1, 2, 0},
			{1, 0, 2},
			{2, 1, 0},
			{2, 0, 1},
			{0, 1, 2},
			{0, 2, 1}
		};
		int a;
		int b;
		int c;
		int i;
		for (i = 0;i <= 5;i++)
		{
			a = rank[i][0];
			b = rank[i][1];
			c = rank[i][2];
			if ((b > a) + (c == a) == 2 - a && (a > b) + (a > c) == 2 - b && (c > b) + (b > a) == 2 - c)
			{
				break;
			}
		}
		switch (i)
		{
			case 0:
				System.out.print("CAB");
				break;
		case 1:
			System.out.print("BAC");
			break;
		case 2:
			System.out.print("CBA");
			break;
		case 3:
			System.out.print("BCA");
			break;
		case 4:
			System.out.print("ABC");
			break;
		case 5:
			System.out.print("ACB");
			break;
		default:
			System.out.print("fuck");
			break;
		}
		return 0;
	}







}

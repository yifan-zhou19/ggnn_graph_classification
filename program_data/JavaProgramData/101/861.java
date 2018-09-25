package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int[] q = {0, 1, 2, 0, 2, 1, 1, 2, 0, 1, 0, 2, 2, 1, 0, 2, 0, 1};
		int a;
		int b;
		int c;
		for (int i = 1;i < 18;i = i + 3) //??????
		{
			a = q[i],b = q[i + 1],c = q[i + 2];
			if ((b > a) + (c == a) + (a > b) + (a > c) + (c > b) + (b > a) == 3)
			{
			if (a > b && a > c && b > c)
			{
				System.out.print("CBA");
			}
			if (a > b && a > c && c > b)
			{
				System.out.print("BCA");
			}
			if (b > a && b > c && c > a)
			{
				System.out.print("ACB");
			}
			if (c > a && c > b && a > b)
			{
				System.out.print("BAC");
			}
			if (c > a && c > b && b > a)
			{
				System.out.print("ABC");
			}
			}
		}
		return 0; //????
	}

}

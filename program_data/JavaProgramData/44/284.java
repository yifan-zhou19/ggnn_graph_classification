package <missing>;

public class GlobalMembers
{
	public static int fanxushu(int a) //??????
	{
		int i = 0;
		int j = 0;
		int[] b = new int[100];
		if (a == 0)
		{
			return 0; //????????0????????0
		}
		else if (a > 0)
		{
			for (i = 0;a > 0;i++)
			{
				b[i] = a % 10;
				a = a / 10;
			}
			for (j = 0;j < i;j++)
			{
				a = b[j] + a * 10;
			}
			return a;
		} //a???????????a????
		else
		{
			a = -a;
			for (i = 0;a > 0;i++)
			{
				b[i] = a % 10;
				a = a / 10;
			}
			for (j = 0;j < i;j++)
			{
				a = b[j] + a * 10;
			}
			a = -a;
			return a;
		} //?a???????????????????
	}
	public static int Main() //???
	{ //?????
		int i = 0;
		int n = 6;
		int a = 0;
		for (i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fanxushu(a));
			System.out.print("\n");
		} //????6??????
		return 0;
	} //?????
}


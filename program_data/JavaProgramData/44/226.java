package <missing>;

public class GlobalMembers
{
	public static int fanxu(int x)
	{
		int y = 0;
		int i = 0;
		int j;
		int[] a = new int[10];
		int temp;
		while (x != 0) //????????????
		{
			a[i] = x % 10;
			x = x / 10;
			i++;
		}
		for (j = 0;j < i;j++) //??????????
		{
			y = 10 * y + a[j];
		}
		return y;
	}
	public static int Main()
	{
		int i;
		int[] num = new int[6];
		for (i = 0;i < 6;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < 6;i++)
		{
			System.out.print(fanxu(num[i]));
			System.out.print("\n");
		}
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	//?????????
	//??????
	public static int reverse(int num)
	{
		int a;
		if (num == 0)
		{
			System.out.print(num);
			System.out.print("\n");
		}
		else
		{
			a = num % 10; //????0??
			while (a == 0)
			{
				num = num / 10;
			a = num % 10;
			}
			while (num != 0)
			{ //????????
				a = num % 10;
				num = num / 10;
				System.out.print(a);
			}
			System.out.print("\n");
		}
	return 0;
	}
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < 6;i++)
		{
			if (a[i] < 0)
			{ //???????????????
				a[i] = 0 - a[i];
				System.out.print("-");
			}
			reverse(a[i]);
		} //?????
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int[] height = new int[25];
	public static int Main()
	{
		int i;
		int work = new int(int,int);
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < N ; i++)
		{
			height[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(work(0, 99999));
		System.out.print("\n");
		return 0;
	}
	public static int work(int sub,int high)
	{
		int i;
		int max;
		int num1;
		int num2;
		for (i = sub ; high < height[i] ; i++)
		{
			;
		}
		if (sub >= N != 0 || i >= N)
		{
			return 0;
		}
		num1 = work(i + 1, height[i]) + 1;
		num2 = work(sub + 1, high);
		return num1 > num2 != 0 ? num1 : num2;
	} //HONZE TEST

}


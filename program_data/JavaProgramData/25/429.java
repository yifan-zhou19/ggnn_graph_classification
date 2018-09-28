package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[1000];
	public static int[] jinwei = new int[1000];
	public static int weishu = 1;
	public static int temp;
	public static void multiply()
	{
		int i;
		for (i = 0;i <= weishu;i++)
		{
			temp = num[i] * 2;
			num[i] = temp % 10 + jinwei[i];
			jinwei[i + 1] = temp / 10;
		}
		num[i] = jinwei[i];
		if (jinwei[weishu] == 1)
		{
			weishu += 1;
		}
	}
	public static int Main()
	{
		int j;
		int n;
		num[0] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < n;j++)
		{
			multiply();
		}
		for (j = weishu - 1;j >= 0;j--)
		{
			System.out.print(num[j]);
		}
		return 0;
	}
}


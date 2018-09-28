package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i = 1; //yushu????
		int sum = 0;
		int[] yushu = new int[50];
		int j;
		int k;
		int p = 0;
		if (num < 0)
		{
				  num = -num; //????0??????
				  p = -1; //????
		}
		while (num >= 1)
		{
					yushu[i] = num % 10; //???????
					i++;
					num = num / 10;
		}
		for (j = 1;j < i;j++)
		{
			for (k = 0;k < i - 1 - j;k++)
			{
				yushu[j] = yushu[j] * 10; //?????
			}
			sum = sum + yushu[j];
		}
		if (p == -1)
		{
			sum = -sum; //??????????
		}
		return sum;
	}
	public static int Main()
	{
		int input; //?????????
		int output;
		int i; //???
		for (i = 0;i < 6;i++)
		{
						 input = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 output = reverse(input);
						 System.out.print(output);
						 System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}


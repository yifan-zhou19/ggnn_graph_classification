package <missing>;

public class GlobalMembers
{
	public static int reverse(int a)
	{
		int[] x = new int[100];
		int i = 0;
		int sum = 0;
		int num = 0;
		if (a > 0) //?a??????
		{
			do //?a???????
			{
			x[i] = a % 10;
			a = a / 10;
			i++;
			num++;
			}while (a > 0);
		for (i = 0;i < num;i++)
		{
			sum = sum * 10 + x[i]; //???????
		}
		}
		else if (a < 0) //?a??????
		{
			a = a * (-1); //?a????????
			do //????????????
			{
			x[i] = a % 10;
			a = a / 10;
			i++;
			num++;
			}while (a > 0);
		for (i = 0;i < num;i++)
		{
			sum = sum * 10 + x[i]; //???????
		}
		sum = sum * (-1); //???????????
		}
		else if (a == 0 && a == -0)
		{
			sum = 0; //?a?0?-0????0
		}
		return sum; //????sum
	} //reverse????
	public static int Main() //?????
	{
		int[] n = new int[6];
		int[] num = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < 6;i++)
		{
			num[i] = reverse(n[i]); //????????num??
		}
		for (i = 0;i < 5;i++)
		{
			System.out.print(num[i]);
			System.out.print("\n");
		}
		System.out.print(num[5]);
		return 0;
	} //?????
}


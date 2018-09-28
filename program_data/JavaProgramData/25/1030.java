package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[101];
	public static void fun()
	{
		int temp = 0;
		int j = 100;
		do
		{
			if (num[j] < 5)
			{
				num[j] = num[j] * 2 + temp;
				temp = 0;
			}
			else
			{
				num[j] = num[j] * 2 - 10 + temp;
				temp = 1;
			}
			j--;
		} while (j >= 0);
		return;
	}
	public static int Main()
	{
		num[100] = 1;
		int N;
		int i;
		int flag = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < N; i++)
		{
			fun();
		}
		for (i = 0; i < 101; i++)
		{
			if (flag == 0 && num[i] == 0)
			{
				continue;
			}
			System.out.print(num[i]);
			flag = 1;
		}
		return 0;
	}

}


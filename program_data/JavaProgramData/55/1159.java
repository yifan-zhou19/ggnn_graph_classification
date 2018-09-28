package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i = 0;
		int j = 0;
		int k = 0;
		int shijinzhi = 0;
		int power = 1;
		int[] x = new int[30];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x[0] = System.in.read() + 1;
		while (x[i] != -16)
		{
			i++;
			x[i] = System.in.read();
			if (x[i] > 96)
			{
				x[i] -= 87;
			}
			else if (x[i] > 64)
			{
				x[i] -= 55;
			}
			else
			{
				x[i] -= 48;
			}
		}
		if (x[1] == 0)
		{
			System.out.print("0");
		}
		else
		{
		for (j = i - 1;j >= 1;j--)
		{
			shijinzhi += x[j] * power;
			power = power * a;
		}
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		while (shijinzhi > 0)
		{
			i++;
			x[i] = shijinzhi % b;
			shijinzhi = shijinzhi / b;
			if (x[i] < 10)
			{
				x[i] += 48;
			}
			else
			{
				x[i] += 55;
			}
		}
		for (k = i;k > 0;k--)
		{
			System.out.print(x[k]);
		}
		}
		return 0;
	}

}


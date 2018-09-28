package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int n;
		int[] mul = new int[1000];
		int[] add = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mul[0] = 1;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 999;j++)
			{
				add[j + 1] = 0;
				mul[j] = mul[j] * 2;
				if (mul[j] >= 10)
				{
					add[j + 1] = mul[j] / 10;
				  mul[j] = mul[j] % 10;
				}

			}
			for (j = 0;j < 999;j++)
			{
				mul[j] = mul[j] + add[j];
			}
		}
		i = 999;
		while (mul[i] == 0)
		{
			i--;
		}
		for (;i >= 0;i--)
		{
			System.out.print(mul[i]);
		}
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int ln(int a)
	{
		int b = 0;
		for (b = 0;b < 11;b++)
		{
			if (Math.pow((float)2,(float)b) > a)
			{
			break;
			}
		}
		return (b);
	}

	public static int Main()
	{
		int a;
		int b;
		int i;
		int a1;
		int b1;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a1 = ln(a);
		b1 = ln(b);
		int[] num_1 = new int[a1];
		int[] num_2 = new int[b1];
		int j = 0;
		num_1[0] = a;
		num_2[0] = b;
		for (i = 1;i < a1;i++)
		{
			 num_1[i] = num_1[i - 1] / 2;
		}
		for (i = 1;i < b1;i++)
		{
			 num_2[i] = num_2[i - 1] / 2;
		}
		for (i = 0;i < a1;i++)
		{
			for (int k = 0;k < b1;k++)
			{
					if (num_1[i] == num_2[k])
					{
					j++;
					}
			}
		}
		System.out.print(num_1[a1 - j]);
		System.out.print("\n");
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num1 = new int[1000];
		int[] num2 = new int[1000];
		int i = 1;
		int j = 1;
		int k;
		num1[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (System.in.read() == ',')
		{
			num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}
		num2[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (System.in.read() == ',')
		{
			num2[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j++;
		}
		System.out.print(i);
		System.out.print(" ");
		int[] num = new int[1000];
		int temp = 0;
		for (k = 0;k < 1000;k++)
		{
			for (j = 0;j < i;j++)
			{
				if (num1[j] <= k != 0 && k < num2[j])
				{
					num[k]++;
				}
			}
			if (num[k] > temp)
			{
				temp = num[k];
			}
		}
		System.out.print(temp);
		return 0;
	}
}


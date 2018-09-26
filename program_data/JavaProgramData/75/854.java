package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] num1 = new int[1000];
		int[] num2 = new int[1000];
		int len;
		int count1 = 0;
		int min = 0;
		int max = 2000;
		int maxnum = 0;
		int j;
		char ch;
		for (i = 0;;i++)
		{
			num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num1[i] < min)
			{
				min = num1[i];
			}
			ch = System.in.read();
			if (ch == '\n')
			{
				len = i + 1;
				break;
			}
		}
		for (i = 0;i < len;i++)
		{
			num2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num2[i] > max)
			{
				max = num2[i];
			}
			ch = System.in.read();
		}
		for (i = min;i <= max;i++)
		{
			count1 = 0;
			for (j = 0;j < len;j++)
			{
				if (i >= num1[j] != 0 && i < num2[j])
				{
					count1++;
				}
			}
			if (count1 > maxnum)
			{
				maxnum = count1;
			}
		}
		System.out.print(len);
		System.out.print(" ");
		System.out.print(maxnum);
		System.out.print("\n");
		return 0;
	}
}


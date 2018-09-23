package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int[] a = new int[11];
		int[] b = new int[11];
		int num1;
		int num2;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		a[i] = x;
		while (x > 1)
		{
			x = x / 2;
			i++;
			a[i] = x;
		}
		num1 = i + 1;
		int j = 0;
		b[j] = y;
		while (y > 1)
		{
			y = y / 2;
			j++;
			b[j] = y;
		}
		num2 = j + 1;
		int flag = 0;
		for (i = 0;i < num1;i++)
		{
			for (j = 0;j < num2;j++)
			{
				if (a[i] == b[j])
				{
					flag = 1;
					System.out.print(a[i]);
					System.out.print("\n");
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
		return 0;
	}

}


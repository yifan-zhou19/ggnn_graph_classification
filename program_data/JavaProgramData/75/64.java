package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int num = 1;
		int i;
		int j;
		int temp = 0;
		int max = 0;
		char c;
		do
		{
			a[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(c);
			num++;
		}while (c == ',');
		num = 1;
		do
		{
			b[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(c);
			num++;
		}while (c == ',');
		System.out.print(num - 1);
		num--;
		for (i = 0; i < 1000; i++)
		{
			for (j = 1; j <= num; j++)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					temp++;
				}
			}
			if (max < temp)
			{
				max = temp;
			}
			temp = 0;
		}
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}


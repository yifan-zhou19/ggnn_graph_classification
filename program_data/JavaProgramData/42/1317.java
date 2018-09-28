package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[100001];
		int size;
		int i;
		int r;
		int k;
		int del;
		size = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= size; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		del = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= size; i++)
		{
			if (num[i] == del)
			{
				size--;
				for (r = i; r <= size; r++)
				{
					num[r] = num[r + 1];
				}
				i--;
			}
		}
		for (i = 1; i <= size; i++)
		{
			System.out.print(num[i]);
			if (i == size)
			{
				System.out.print("\n");
			}
			else
			{
				System.out.print(" ");
			}
		}
		return 0;
	}

}


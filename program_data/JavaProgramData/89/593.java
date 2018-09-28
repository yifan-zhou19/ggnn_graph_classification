package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int flag;
		int count;
		int s = 0;
		int[] a = new int[100000];
		int[] b = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; a[i] != 0 || b[i] != 0; i++)
		{
			a[i + 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i + 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0; j < i; j++)
		{
			count = 1;
			for (k = j + 1; k < i; k++)
			{
				if (b[k] == -1)
				{
					continue;
				}
				if (b[k] == b[j])
				{
					b[k] = -1;
					count++;
				}
			}
			if (count == n - 1)
			{
				flag = 1;
				for (k = 0; k < i; k++)
				{
					if (a[k] == b[j])
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					s++;
					System.out.print(b[j]);
					System.out.print("\n");
				}
			}
		}
		if (s == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}


}


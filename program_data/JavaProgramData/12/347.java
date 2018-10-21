package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int num;
		int n;
		while (true)
		{
			for (i = 1; i <= 100; i++)
			{
				a[i] = 0;
			}
			do
			{
				num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				a[num] = 1;
			}while (num != 0 && num != -1);
			if (num == -1)
			{
				break;
			}
			n = 0;
			for (i = 0; i <= 50; i++)
			{
				if (a[i] != 0 && a[2 * i] != 0)
				{
					n++;
				}
			}
			System.out.print(n - 1);
			System.out.print("\n");
		}
		return 0;
	}


}


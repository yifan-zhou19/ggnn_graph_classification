package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //??????????????????????
		int j;
		int[] a = new int[20];
		int sum = 0;
		while (true)
		{
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1)
			{
				break; //?????-1????????
			}
			for (i = 1; a[i - 1] != 0; i++) //???????????0??
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0; a[i] != 0; i++)
			{
				for (j = 0; a[j] != 0;j++)
				{
					if (a[i] == 2 * a[j]) //???????????sum??
					{
						sum++;
					}
				}
			}
		System.out.print(sum);
		System.out.print("\n");
		sum = 0; //?sum??
		}
		return 0;
	}

}


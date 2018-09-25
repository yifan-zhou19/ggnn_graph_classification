package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20001];
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{ //??????
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0)
			{
				continue;
			}
			for (j = i + 1;j < n;j++)
			{
				if (a[i] == a[j])
				{
					a[j] = 0; //????????0
				}
			}
		}
		int[] temp = new int[20001];
		int k = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				temp[k] = a[i]; //?temp??????????????
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.print(temp[i]);
			System.out.print(' ');
		}
		System.out.print(temp[k - 1]);
		System.out.print("\n");
		return 0;
	}

}


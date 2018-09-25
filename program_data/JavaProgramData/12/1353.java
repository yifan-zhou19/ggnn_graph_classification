package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20]; //????
		int i;
		int cnt;
		i = 0; //???
		cnt = 0;
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (a[i] != -1) //?????????-1.??????
		{
			while (a[i] != 0) //?????????0??????????0??
			{
				i++;
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			} //?????????i+1??
			for (int j = 0; j <= i; j++) //??????????????????cnt?1
			{
				for (int k = 0; k <= i; k++)
				{
					if (a[k] == 2 * a[j])
					{
						cnt++;
					}
				}
			}
			System.out.print(cnt - 1);
			System.out.print("\n");
			i = 0;
			cnt = 0;
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}



}


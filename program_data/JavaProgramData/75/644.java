package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[2000];
		int[] y = new int[2000];
		int i = 1;
		int j;
		int sum = 0;
		int[] pep = new int[2000];
		int k = 0;
		char ch = ',';
		while (ch == ',')
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum++;
			i++;
			ch = System.in.read();
		}
		for (i = 1; i <= sum - 1; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		y[sum] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= 2000; i++) //pep?????
		{
			pep[i] = 0;
		}
		for (i = 1; i <= sum; i++) //?sum??????
		{
			for (j = x[i]; j < y[i]; j++) //?pep??????i?????????1
			{
				pep[j]++;
			}
		}
		for (i = 1; i <= 2000; i++) //?pep?????
		{
			for (j = 1; j <= 2000; j++)
			{
				if (pep[i] < pep[j])
				{
					break;
				}
				k++;
			}
			if (k == 2000) //???????????sum????
			{
					System.out.print(sum);
					System.out.print(" ");
					System.out.print(pep[i]);
					System.out.print("\n");
					return 0; //????
			}
			k = 0;
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1001];
		int[] y = new int[1001];
		int[] peak = new int[1001];
		int[] peak2 = new int[1001];
		int sum;
		int tmp;
		int min = 0;
		int max = 0;
		String coma = new String(new char[1001]);
		int i;
		int j;
		int k;
		int time;
		for (i = 0;i < 1001;i++)
		{
			peak[i] = 0;
			x[i] = 0;
			y[i] = 0;
		}
		for (i = 0;;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() != ',')
			{
				sum = i + 1;
				break;
			}

		}
		for (j = 0;j < sum;j++)
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(coma.charAt(j));
		}

		for (k = 0; k <= 1001 ;k++)
		{
			for (i = 0;i < sum;i++)
			{
				if (x[i] <= k != 0 && k < y[i])
				{
					peak[k]++;
				}
			}
			//cout<<peak[k]<<' ';
		}
	//	for(k=min; k<=max ;k++)
	//	{
	//		cout<<peak[k]<<' ';
	//	}
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < 1000 - i;j++)
			{
				if (peak[j] < peak[j + 1])
				{
					tmp = peak[j];
					peak[j] = peak[j + 1];
					peak[j + 1] = tmp;
				}
			}
		}
		System.out.print(sum);
		System.out.print(' ');
		System.out.print(peak[0]);
		System.out.print("\n");
		return 0;
	}
}


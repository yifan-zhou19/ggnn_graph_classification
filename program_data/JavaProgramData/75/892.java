package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] in = new int[1000];
		int[] out = new int[1000];
		int i = 0;
		int j = 0;
		int[] time = new int[1000];
		char a;
		while ((in[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			cin.get(a);
			i++;
			if (a != ',')
			{
				break;
			}
		}
		while ((out[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			cin.get(a);
			j++;
			if (a != ',')
			{
				break;
			}
		}
		for (int k = 0;k < i;k++)
		{
			for (int l = 0;l < 1000;l++)
			{
				if (l >= in[k] != 0 && l < out[k])
				{
					time[l]++;
				}
			}
		}
		int max = 0;
		for (int k = 0;k < 1000;k++)
		{
			if (time[k] >= max)
			{
				max = time[k];
			}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}


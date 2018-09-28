package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char a;
		int[] in = new int[1001];
		int[] out = new int[1001];
		int[] time = new int[1001];
		int sumperson = 0;
		int maxperson = 0;
		int i;
		int j;
		for (i = 1; ; i++)
		{
			in[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(a);
			sumperson++;
			if (a == '\n')
			{
				break;
			}
		}
		for (i = 1; ; i++)
		{
			out[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(a);
			if (a == '\n')
			{
				break;
			}
		}
		for (i = 1; i <= sumperson; i++)
		{
			for (j = in[i]; j < out[i]; j++)
			{
				time[j] += 1;
			}
		}
		for (i = 1; i <= 1001; i++)
		{
			if (time[i] > maxperson)
			{
				maxperson = time [i];
			}
		}
		System.out.print(sumperson);
		System.out.print(" ");
		System.out.print(maxperson);
		System.out.print("\n");
		return 0;
	}
}


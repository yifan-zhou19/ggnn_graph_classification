package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] RS = new int[1001];
		int n = 0;
		int i = 0;
		int[] X = new int[1010];
		int[] Y = new int[1010];
		while (true)
		{
			X[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			if (System.in.read() != ',')
			{
				n = i;
				break;
			}
		}
		char comma;
		for (int i = 0; i < n - 1; i++)
		{
			Y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			comma = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		Y[n - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (int j = X[i]; j < Y[i]; j++)
			{
				RS[j]++;
			}
		}
		for (int j = 1; j < 1001; j++)
		{
		if (RS[j] >= RS[0])
		{
				RS[0] = RS[j];
		}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(RS[0]);
		System.out.print("\n");
		return 0;
	}

}


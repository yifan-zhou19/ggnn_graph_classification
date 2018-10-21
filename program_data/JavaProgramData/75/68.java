package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] in = new int[1001];
		int[] out = new int[1001];
		int i;
		int j;
		int n;
		int[] count = new int[1001];
		int climax;
		char a;
		for (i = 0; ; i++)
		{
			in[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(a);
			if (a == '\n')
			{
				break;
			}
		}
		for (i = 0; ; i++)
		{
			out[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(a);
			if (a == '\n')
			{
				break;
			}
		}
		n = ++i;
		for (i = 0; i < n; i++)
		{
			for (j = in[i]; j < out[i]; j++)
			{
				count[j]++;
			}
		}
		climax = count[0];
		for (j = 0; j < 1000; j++)
		{
			if (count[j] > climax)
			{
				climax = count[j];
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(climax);
		System.out.print("\n");
		return 0;
	}



}


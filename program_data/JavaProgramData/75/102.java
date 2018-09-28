package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] in = new int[1000];
		int[] out = new int[1000];
		int result = 0;
		int num = 1;
		int i;
		int j;
		int k;
		int[] t = new int[1000];
		char x = '0';
		for (i = 0;;i++)
		{
			in[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x = System.in.read();
			if (x == '\n')
			{
				break;
			}
			num = num + 1;
		}
		x = '0';
		for (i = 0;;i++)
		{
			out[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x = System.in.read();
			if (x == '\n')
			{
				break;
			}
		}
		for (j = 0;j <= num - 1;j++)
		{
			for (k = in[j];k < out[j];k++)
			{
				t[k]++;
			}
		}
		result = 0;
		for (i = 0;i < 1000;i++)
		{
			if (t[i] > result)
			{
				result = t[i];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(result);
		System.out.print("\n");
		return 0;
	}
}


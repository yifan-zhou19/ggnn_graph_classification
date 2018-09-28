package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] in = new int[1000];
	int[] out = new int[1000];
	int[] flag = new int[1000];
	int t;
	int i;
	int j;
	int k;
	int num = 0;
	char temp;
	for (i = 0;;i++)
	{
		in[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		temp = System.in.read();
		num++;
		if (temp == '\n')
		{
			break;
		}
	}
	for (i = 0;;i++)
	{
		out[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		temp = System.in.read();
		if (temp == '\n')
		{
			break;
		}
	}
	for (i = 1;i <= 999;i++)
	{
		for (j = 0;j <= num - 1;j++)
		{
			if (in[j] <= i != 0 && out[j]> i)
			{
				flag[i] = flag[i] + 1;
			}
		}
	}
	int tem = 0;
	for (i = 1;i <= 999;i++)
	{
		if (tem <= flag[i])
		{
			tem = flag[i];
		}
	}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(tem);
		System.out.print("\n");

	return 0;
	}
}


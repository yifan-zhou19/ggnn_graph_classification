package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	double[] in = new double[400];
	double[] cha = new double[400];
	int i;
	int j;
	int k;
	int s = 0;
	double temp = 0;
	int[] flag = new int[400];
	double to = 0;
	double aver;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i <= n - 1;i++)
	{
		in[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		to = to + in[i];
	}
	aver = to / n;
	//cout<<aver<<endl;
	for (i = 0;i <= n - 1;i++)
	{
		cha[i] = Math.abs(in[i] - aver);
	//	cout<<cha[i]<<endl;
	}
	for (i = 0;i <= n - 1;i++)
	{
		if (temp < cha[i])
		{
			temp = cha[i];
		}
	}
	//cout<<temp;
	for (i = 0;i <= n - 1;i++)
	{
		if (Math.abs(cha[i] - temp) <= 0.00000001)
		{
			flag[s] = i;
			s++;
		}
	}
	for (i = 0;i <= s - 2;i++)
	{
		System.out.print(in[flag[i]]);
		System.out.print(",");
	}
	System.out.print(in[flag[s - 1]]);
	System.out.print("\n");
	return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	//*************************
	//*????????**
	//*??????**
	//*???2013.10.30**
	//*************************
	public static int Main()
	{
		int[] time = new int[1050];
		int[] in = new int[1050];
		int[] out = new int[1050];
		int i = 0;
		int a = 0;
		int n = 0;
		for (;i <= 1049;i++)
		{
			time[i] = 0;
			in[i] = 0;
			out[i] = 0;
		}
		for (i = 0;;i++)
		{
			char a;
			in[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = System.in.read();
			if (a != 44)
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			char b;
			out[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = System.in.read();
			if (b != 44)
			{
				break;
			}
		}
		n = i + 1;
		for (i = 0;i <= 1000;i++)
		{
			for (int j = in[i]; j < out[i]; j++)
			{
					time[j]++;
			}
		}
	for (int j = 0; j <= 1000 ; j++)
	{
			for (int h = 0; h <= 1000; h++)
			{
					if (time[h] < time[h + 1])
					{
						int temp = time[h];
						time[h] = time[h + 1];
						time[h + 1] = temp;
					}
			}
	}
			a = time[0];
		System.out.print(n);
		System.out.print(" ");
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}
}


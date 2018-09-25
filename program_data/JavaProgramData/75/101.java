package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] start = new int[1000]; // in out?????0-999
		int[] out = new int[1000];
		int[] time = new int[1001];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(time,0,(Integer.SIZE / Byte.SIZE));
		int i = 0;
		int j = 0;
		int k = 0;
		int max = 0;
		char c;
		while ((start[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			c = System.in.read();
			if (c != '\n')
			{
				i++;
			}
			else
			{
				break;
			}
		}
		while ((out[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			c = System.in.read();
			if (c != '\n')
			{
				j++;
			}
			else
			{
				break;
			}
		}
		for (k = 0; k <= i ; k++)
		{
			for (int s = start[k]; s < out[k]; s++)
			{
				time[s]++;
			}
		}
		for (int r = 0; r < 1001; r++)
		{
			if (max < time[r])
			{
				max = time[r];
			}
		}
		System.out.print(i + 1);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}

}


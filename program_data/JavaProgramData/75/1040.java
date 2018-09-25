package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int counter = 0;
		int[] num = new int[1000];
		while ((x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			counter++;
			num[x]++;
			if (System.in.read() != ',')
			{
				break;
			}
		}
		while ((y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			num[y]--;
			if (System.in.read() != ',')
			{
				break;
			}
		}
		int max = 0;
		int contemperary = 0;
		for (int j = 0;j < 1000;j++)
		{
				contemperary += num[j];
				if (contemperary > max)
				{
					max = contemperary;
				}
		}
		System.out.print(counter);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	//******************************
	//???:5.cpp
	//??: ??? 1300012754
	//??:2013.10.30
	//??:?????
	//******************************
	public static int Main()
	{
		int num = 0;
		int[] x = new int[1010];
		int[] y = new int[1010];
		int[] time = new int[1010];
		int maxpeople = 0;
		char ch;
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(time, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(x, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(y, 0, (Integer.SIZE / Byte.SIZE));
		do
		{
			i++;
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			num++;
			if (ch != ',')
			{
				break;
			}
		}while (1 != 0);
		i = 0;
		do
		{
			i++;
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
		}while (1 != 0);
		for (int k = 1; k <= num; k++)
		{
			for (int j = x[k]; j < y[k]; j++)
			{
				time[j]++;
			}
		}
		for (int k = 0; k < 1000; k++)
		{
			if (maxpeople < time[k])
			{
				maxpeople = time[k];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(maxpeople);
		System.out.print("\n");
		return 0;
	}


}


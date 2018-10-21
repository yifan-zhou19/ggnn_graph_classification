package <missing>;

public class GlobalMembers
{
	//*****************************************************
	//*?????????                                 *
	//*?  ?????                                     *
	//*?  ??1000012806                                 *
	//*?????2010.11.26.                              *
	//*****************************************************
	public static int Main()
	{
		int[] x = new int[1000]; //????x[1000],y[1000],t[1000]??????????????????????
		int[] y = new int[1000];
		int[] t = new int[1000];
		int num = 0;
		int max;
		int i = 0;
		int j;
		char temp = ','; //?temp????
		char c; //????????c
		do
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			num++; //??????
			c = System.in.read();
		}while (c != '\n'); //?c?????????????????????????
		i = 0;
		do //?????y[i]
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			c = System.in.read();
		}while (c != '\n');

		for (i = 0; i < 1000; i++)
		{
			for (j = 0; j < num; j++)
			{
				if (x[j] <= i != 0 && y[j] > i) //???????????????
				{
					t[i]++;
				}
			}
		}
		max = t[0];
		for (i = 0; i < 1000; i++) //???????
		{
			if (t[i] > max)
			{
				max = t[i];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}


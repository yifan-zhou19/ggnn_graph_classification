package <missing>;

public class GlobalMembers
{
	//**************************************************************************
	//??????
	//??????
	//???2012.10.10
	//**************************************************************************

	public static int Main()
	{
		int n; //????n?????i
		int i;
		int x; //?????????x??????y??????hours????????max
		int y;
		int hours;
		int max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100]; //??a?b??????????????c????????
		int[] b = new int[100];
		int[] c = new int[102];
		x = 1;
		y = 0;
		hours = 0;
		max = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE)); //?????
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			//cout << "????????" << endl;
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i] <= 140) + (a[i] >= 90) + (b[i] <= 90) + (b[i] >= 60) == 4)
			{
				c[i + 1] = 1;
			}
			else
			{
				c[i + 1] = 0; //??????1?????0???????????????0?1?????
			}
		}
		for (i = 1;i <= n;i++)
		{
			if ((c[i - 1] == 0) + (c[i] == 1) == 2)
			{
				x = i;
			}
			if ((c[i] == 1) + (c[i + 1] == 0) == 2)
			{
				y = i;
			}
			hours = y - x + 1; //??c????1????????????
			max = max > hours != 0 ? max : hours; //?????hours???max
		}

		System.out.print(max);
		System.out.print("\n");

	return 0;
	}
}


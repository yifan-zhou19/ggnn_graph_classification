package <missing>;

public class GlobalMembers
{
	/*
	 * ????addition-of-big-int.cpp
	 * ??????
	 * ????:2012-11-27
	 * ??????????????
	 */

	public static int la = 0; //??????la,lb,??a,b,combine
	public static int lb = 0;
	public static int l = 0;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] combine = new int[200];

	public static void input()
	{ //??input
		la = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < la;i++) //????a
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < lb;i++) //????b
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void seq()
	{ //??seq
		l = la;
		sequence(a); //??a
		l = lb;
		sequence(b); //??b
	}
	public static void sequence(int[] x)
	{ //????sequence
		int temp = 0; //????temp
		for (int i = 1;i < l;i++) //??????
		{
			for (int j = 1;j <= l - i;j++)
			{
				if (x[j - 1] > x[j])
				{
					temp = x[j];
					x[j] = x[j - 1];
					x[j - 1] = temp;
				}
			}
		}
	}
	public static void com(int[] a, int[] b)
	{ //????com
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(combine,a,la * 4);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(combine + la,b,lb * 4);
	}
	public static void output(int[] combine)
	{ //??output
		System.out.print(combine[0]);
		for (int i = 1;i < la + lb;i++)
		{
			System.out.print(" ");
			System.out.print(combine[i]);
		}
	}

	public static int Main()
	{ //???
		input(); //??
		seq(); //??
		com(a, b); //???a,b?????combine
		output(combine); //??combine
		return 0; //?????
	}
}


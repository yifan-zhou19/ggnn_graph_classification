package <missing>;

public class GlobalMembers
{
	//???????????????????????? ??? 1200012848 20121116

	//??
	public static int[] A = new int[100];
	public static int An;
	public static int[] B = new int[100];
	public static int Bn;

	public static void getAn() //?????????
	{
		An = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}

	public static void getBn() //?????????
	{
		Bn = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}

	public static void sortA() //????An??
	{
		for (int i = 0;i < An;i++)
		{
			A[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		sort(A,A + An);
	}

	public static void sortB() //????Bn??
	{
		for (int i = 0;i < Bn;i++)
		{
			B[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		sort(B,B + Bn);
	}

	public static void OutA()
	{
		for (int i = 0;i < An;i++)
		{
			System.out.print(A[i]);
			System.out.print(" ");
		}
	}

	public static void OutB()
	{
		for (int i = 0;i < Bn;i++)
		{
			System.out.print(B[i]);
			if (i != Bn - 1)
			{
				System.out.print(' ');
			}
		}
	}

	public static int Main()
	{
		getAn();
		getBn();
		sortA();
		sortB();
		OutA();
		OutB();
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int[] A = new int[200];
	public static int[] B = new int[100];
	public static int a;
	public static int b;

	public static void shuzu() //????
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < a;i++)
		{
			A[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < b;i++)
		{
			B[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

	}
	public static void paixu() //?????????
	{
		int p;
		for (int j = 1;j <= a - 1;j++)
		{
			for (int i = 0;i < a - j;i++)
			{
				if (A[i] > A[i + 1])
				{
					p = A[i];
					A[i] = A[i + 1];
					A[i + 1] = p;
				}
			}
		}
		for (int j = 1;j <= b - 1;j++)
		{
			for (int i = 0;i < b - j;i++)
			{
				if (B[i] > B[i + 1])
				{
					p = B[i];
					B[i] = B[i + 1];
					B[i + 1] = p;
				}
			}
		}

	}
	public static void hebing() //??????????
	{
		for (int i = 0;i < b;i++)
		{
			A[a + i] = B[i];
		}
		for (int i = 0;i < a + b - 1;i++)
		{
			System.out.print(A[i]);
			System.out.print(' ');

		}
		System.out.print(A[a + b - 1]);
	}

	public static int Main()
	{

		shuzu();
			 paixu();
			 hebing();

		return 0;
	}

}


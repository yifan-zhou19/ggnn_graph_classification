package <missing>;

public class GlobalMembers
{
	//**************************************
	//?????????                   *
	//?????                           *
	//???2013/10/30                     *
	//????????????????     *
	//**************************************
	public static int Main()
	{
		int w;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] A = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] B = {0, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13};
		for (int i = 1;i < 13;i++)
		{
			for (int j = 0;j < i;j++)
			{
				B[i] = B[i] + A[j];
			}
			if ((B[i] + w - 1) % 7 == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}


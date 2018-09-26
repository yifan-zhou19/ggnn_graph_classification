package <missing>;

public class GlobalMembers
{
	//@@@@@???2?N??*********//
	//@@@@@?????*******************//
	//@@@@@???12/16******************//
	public static int Main()
	{
		int N; // N??2?N??
		int i;
		int j;
		int[] a = new int[100];
		int[] result = new int[100]; // 2?100????31?

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE)); // ??a??
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result,0,(Integer.SIZE / Byte.SIZE)); // ??result??
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1; // ??????
		for (i = 1; i <= N; i++) // ??N??
		{
			for (j = 0; j < 100; j++) // a????????????2
			{
				result[j] = a[j] * 2;
			}
			for (j = 0; j < 100; j++)
			{
				 if (result[j] >= 10) // ????
				 {
					 result[j + 1] += result[j] / 10;
					 result[j] = result[j] % 10;
				 }
			}
			for (j = 0; j < 100; j++)
			{
				a[j] = result[j]; // ?????result?????a???????
			}
		}
		j = 99;
		while (a[j] == 0)
		{
			j--; // ???????????
		}
		for (; j >= 0; j--)
		{
			System.out.print(a[j]);
		}
		System.out.print("\n");



		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	/**
	 * ??????
	 * ???1000012844
	 * ?????2?N??
	 **/



	public static void multiply(String str, int n)
	{
		int[] num = new int[200];
		int jump = 0;
		int temp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * sPtr = str + str.length() - 1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * nPtr = num + 199;

		while (sPtr != str - 1)
		{
			*nPtr--= *(sPtr--) - '0';
		}

		nPtr = num + 199;

		while (nPtr != num - 1)
		{
			temp = nPtr * n % 10 + jump;
			jump = nPtr * n / 10;
			*nPtr--= temp;
		}

		nPtr = num;
		sPtr = str;
		while (*nPtr == 0)
		{
			nPtr++;
		}

		while (nPtr != num + 200)
		{
			*sPtr++= *nPtr + ++'0';
		}

		*sPtr = 0;
	}

	public static int Main()
	{
		int N;
		final String str = "1";

		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (N > 0)
		{
			multiply(str, 2);
			N--;
		}

		System.out.print(str);
		System.out.print("\n");

		return 0;
	}
}


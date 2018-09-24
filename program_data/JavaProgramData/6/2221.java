package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int number;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < number;i++)
		{
			int m;
			int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] a = new int[100][100]; //????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			int * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q=null;
			int q = null;
			int i;
			  for (p = a;p < a + n * m;p++) //input
			  {
				*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  }
			int sum = 0;
			for (p = a;p < a + n;p++) //add hang
			{
				sum = sum + *p;
			}
			if (m != 1) //??????
			{
			for (p = a + (m - 1) * n;p < a + m * n;p++) //add hang
			{
				sum = sum + *p;
			}
			}
			for (p = a + n;p < a + (m - 1) * n;p = p + n) //add lie
			{
				sum = sum + *p + *(p + n - 1);
			}
			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}
}


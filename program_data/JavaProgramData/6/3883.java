package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] num = new int[100][100];
		int count1;
		int count2;
		int count3;
		int sum;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pointer = null;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (count1 = 0;count1 < m;count1++)
			{
				for (count2 = 0;count2 < n;count2++)
				{
					num[count1][count2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				} //????
			}
			for (pointer = num[0];pointer < num[0] + n;pointer++) //?????????
			{
				sum = sum + *pointer;
			}
			for (pointer = num[m - 1];pointer < num[m - 1] + n;pointer++) //????????
			{
				sum = sum + *pointer;
			}
			for (pointer = num[1] + n - 1,count3 = 1;count3 < m - 1;pointer = num[++count3] + n - 1) //????
			{
				sum = sum + *pointer;
			}
			for (pointer = num[1],count3 = 1;count3 < m - 1;pointer = num[++count3]) //????
			{
				sum = sum + *pointer;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}


}


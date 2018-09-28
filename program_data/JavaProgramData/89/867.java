package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] know = new int[10000][2]; //??????????,???????????
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int flag = 0; //????????
		p = know[0][0]; //??????????
		while (true)
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 0 && j == 0)
			{
				break;
			}
			*(p + i * 2) += 1; //i?????+1
			*(p + j * 2 + 1) += 1; //??j???+1
		}
		for (i = 0; i <= n - 1;i++)
		{
			if (*(p + i * 2) == 0 && *(p + i * 2 + 1) == n - 1) //????0?,?n-1???,????
			{
				System.out.print(i);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] input = new int[8][8];
		int a = 0;
		int b = 0;
		int m = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int hang = 0;
		int lie = 0;
		for (i = 0;i < 8;i++)
		{
			for (j = 0;j < 8;j++)
			{
				input[i][j] = 0;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		System.out.print("\n");


		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					input[i][j] = Integer.parseInt(tempVar3);
				}
			}
			System.out.print("\n");
		}
		for (i = 0;i < a;i++)
		{
			k = 0;
			for (j = 1;j < b;j++)
			{
				if (input[i][k] < input[i][j])
				{
					k = j; //?????????
				}
			}
			for (m = 0;m < a;m++)
			{
				if (input[i][k] > input[m][k])
				{
					break; //??????
				}
			}
			if (m == a)
			{
				hang = i;
				lie = k;
				break;
			}
			else
			{
				hang = 9;
			}
		}
		if (hang == 9)
		{
			System.out.print("No\n");
		}

		else
		{
			System.out.printf("%d+%d\n",hang,lie);
		}
	}
}


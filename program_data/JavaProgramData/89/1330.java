package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *man,n;
		int man;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		man = (int)malloc(4 * n);

		int i;
		int j;
		int k;
		int sum = 0;
		for (i = 0;i <= n - 1;i++)
		{
			*(man + i) = 0;
		}

		for (k = 0;;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			if (i == 0 && j == 0)
			{
				break;
			}
			if (*(man + j) != -1)
			{
				*(man + j) += 1;
			}
			*(man + i) = -1;
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (*(man + i) == n - 1)
			{
				System.out.printf("%d",i);
				sum = 1;
				break;
			}
		}
		if (sum == 0)
		{
			System.out.print("NOT FOUND");
		}


		return 0;
	}

}


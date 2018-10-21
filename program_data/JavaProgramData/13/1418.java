package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = new int[20000];
		int[] B = new int[20000];
		int n;
		int i;
		int j;
		int k;
		int flag;
		int number = 0;
		j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			flag = 0;
			for (k = 0;k < i;k++)
			{
				if (A[k] == A[i])
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				B[j] = A[i];
				number = number + 1;
				j = j + 1;
			}
		}
		for (j = 0;j < number;j++)
		{
			if (j == 0)
			{
				System.out.printf("%d",B[j]);
			}
			else
			{
				System.out.printf(" %d",B[j]);
			}
		}
		return 0;
	}


}


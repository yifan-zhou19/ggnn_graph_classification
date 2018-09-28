package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = new int[300];
		char c;
		int i = 0;
		int temp;
		int j;
		int k;
		int flag = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				A[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			i++;
		}while (c == ',');
		for (j = 1;j < i;j++)
		{
			for (k = 0;k < i - j;k++)
			{
				if (A[k] < A[k + 1])
				{
					temp = A[k + 1];
					A[k + 1] = A[k];
					A[k] = temp;
				}
			}
		}
		for (j = 0;j < i;j++)
		{
			if (A[j] < A[0])
			{
				System.out.printf("%d",A[j]);
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *sum=(int*)malloc(sizeof(int)*20);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			int sum = (int)malloc((Integer.SIZE / Byte.SIZE) * 20);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
				continue;
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sum[j] = tempVar3;
				}
				sum[j] += 3 * (j + 1);
			}
			for (j = m - 1;j >= 0;j--)
			{
				if (sum[j] >= 63)
				{
					continue;
				}
				else if (sum[j] <= 60)
				{
					System.out.printf("%d\n",60 - (j + 1) * 3);
					break;
				}
				else if (sum[j] == 61)
				{
					System.out.printf("%d\n",58 - j * 3);
					break;
				}
				else if (sum[j] == 62)
				{
					System.out.printf("%d\n",59 - j * 3);
					break;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(sum);
		}
		return 0;
	}

}


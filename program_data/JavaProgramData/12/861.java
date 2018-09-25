package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int[] num = new int[16];
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num[1] = Integer.parseInt(tempVar);
		}
		do
		{
			k = 1;
			f = 0;
			do
			{
				k++;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num[k] = Integer.parseInt(tempVar2);
				}
			} while (num[k] != 0);
			for (i = 1;i <= k - 1;i++)
			{
				for (j = 1;j <= k - 1;j++)
				{
					if (num[i] == num[j] * 2)
					{
						f++;
					}
				}
			}
			System.out.printf("%d\n",f);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[1] = Integer.parseInt(tempVar3);
			}
		} while (num[1] != -1);
	}
}


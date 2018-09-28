package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int row = 0;
		int count = 0;
		int check;
		int zeronum;
		int[] n = new int[100];
		int[] m = new int[300];
		int[] arr = new int[300];
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] == 0 || m[i] == 0)
			{
				break;
			}
			row++;
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < n[i];j++)
			{
				arr[j] = j + 1;
			}
			count = 0;
			check = 100;
			zeronum = 0;
			while (check != 0)
			{
				for (j = 0;j < n[i];j++)
				{
					if (arr[j] != 0)
					{
						count++;
						if (count == m[i])
						{
							count = 0;
							arr[j] = 0;
							zeronum++;
						}
						if (zeronum == n[i] - 1)
						{
							check = 0;
							break;
						}
					}
				}
			}

			for (j = 0;j < n[i];j++)
			{
				if (arr[j] != 0)
				{
					System.out.printf("%d\n",arr[j]);
				}
			}
		}
		return 0;
	}


}


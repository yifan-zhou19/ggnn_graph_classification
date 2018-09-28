package <missing>;

public class GlobalMembers
{
	public static char[][] s = new char[100][255];
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int flag = 0;
		int[] num = new int[1000];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i] = Integer.parseInt(tempVar3);
				}
			}

			for (i = 0;i < n - 1 && flag == 0;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (num[i] + num[j] == k)
					{
						flag = 1;
					}
				}
			}
			if (flag == 1)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}


		return 0;
	}
}


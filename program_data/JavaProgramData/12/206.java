package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int x = 0;
		int[] a = new int[20];


			while (true)
			{
				x = 0;
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[0] = Integer.parseInt(tempVar);
				}
				if (a[0] == -1)
				{
					break;
				}
				for (j = 1;a[j - 1] != 0;j++)
				{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j] = Integer.parseInt(tempVar2);
				}
				}
			for (k = 0;k < j - 1;k++)
			{
				for (l = 0;l < j;l++)
				{
					if (a[l] == 2 * a[k])
					{
						x = x + 1;
					}
				}
			}
			System.out.printf("%d\n",x);
			}
	}

}


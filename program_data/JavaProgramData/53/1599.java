package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[MAX];
		int i;
		int j;
		int k;

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
				a[i] = Integer.parseInt(tempVar2);
			}
			if (i == 0)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				k = 0;
				for (j = 0;j < i;j++)
				{
					if (a[j] == a[i])
					{
						k = 1;
					}
				}
				if (k == 0)
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
	}
}


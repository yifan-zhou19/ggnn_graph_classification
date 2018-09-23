package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20000];
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 1 && n <= 20000)
		{

			for (i = 0;i < n;i++)
			{
				m = 0;
				if (i == 0)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[0] = Integer.parseInt(tempVar2);
					}
					System.out.printf("%d",a[0]);
				}
				else
				{
					String tempVar3 = ConsoleInput.scanfRead(" ");
					if (tempVar3 != null)
					{
						a[i] = Integer.parseInt(tempVar3);
					}
					for (j = 0;j < i;j++)
					{
						if (a[i] == a[j])
						{
							m++;
						}
					}
					if (m == 0)
					{
					System.out.printf(" %d",a[i]);
					}
				}
			}
		}
		return 0;
	}
}


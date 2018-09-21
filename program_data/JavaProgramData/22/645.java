package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300]; //n?????
		int i;
		int j;
		int n;
		int k;
		int t;
		char tmp;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				tmp = tempVar2.charAt(0);
			}
			if (tmp == '\n')
			{
				n = i + 1;
				break;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (a[i] == a[i + 1])
			{
				;
			}
			else
			{
				break;
			}
		}
		if (i == n - 1)
		{
			System.out.print("No\n"); //??????????????
		}
		else
		{
			for (i = 0;i < n - 1;i++)
			{
				k = i;
				for (j = i + 1;j < n;j++)
				{
					if (a[k] < a[j])
					{
						k = j;
					}
				}
				if (k != i)
				{
					t = a[k];
					a[k] = a[i];
					a[i] = t;
				}
			} //Select Sort
			for (i = 0;i < n;i++)
			{
				if (a[i] == a[i + 1])
				{
					;
				}
				else
				{
					break;
				}
			}
			System.out.printf("%d\n",a[i + 1]);
		}
	}

}


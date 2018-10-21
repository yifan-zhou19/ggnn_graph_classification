package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[20];
		int i;
		int j;
		int k;
		int count;
		do
		{
			i = 0;
			count = 0;
			do
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				for (k = 0;i > 0 && k < i;k++)
				{
					if (a[i] / 2.0 == a[k] || a[i] * 2 == a[k])
					{
						count = count + 1;
					}
				}
				i = i + 1;
			} while (a[i - 1] != 0 && a[0] != -1);
			if (a[0] != -1)
			{
				System.out.printf("%d\n",count);
			}
		} while (a[0] != -1);
	}



}


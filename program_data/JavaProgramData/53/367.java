package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n;
		int num;
		int count = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		num = n;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[count] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < count;j++)
			{
				if (a[j] == a[count])
				{
					num--;
					break;
				}
			}
			if (j == count)
			{
				count++;
			}
		}
		for (i = 0;i < num - 1;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d\n",a[num - 1]);


		return 0;
	}



}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //i1????????????i2,i3???????????????????n??????
		int i1;
		int i2;
		int i3;
		int flag = 1;
		int[] a = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i1 = 0;i1 < n;i1++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i1] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",a[0]);
		for (i2 = 1;i2 < n;i2++)
		{
			flag = 1;
			for (i3 = 0;i3 < i2;i3++)
			{
				if (a[i2] == a[i3])
				{
					flag *= 0;
				}
			}
			if (flag == 1)
			{
				System.out.printf(" %d",a[i2]);
			}
		}
		return 0;
	}

}


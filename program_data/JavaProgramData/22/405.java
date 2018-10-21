package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int c;
		int sum = 0;
		int temp;
		for (i = 1;i <= 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i - 1] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
			if (c == 10)
			{
				break;
			}
		} //??????
		for (i = 1;i <= 300;i++)
		{
			for (j = 1;j <= 300;j++)
			{
				if (i == j)
				{
					continue;
				}
				else if (a[i - 1] == a[j - 1])
				{
					a[i - 1] = 0;
				}
			}
		} //??
		for (i = 1;i < 300;i++)
		{
			if (a[i - 1] > a[i])
			{
				temp = a[i - 1];
				a[i - 1] = a[i];
				a[i] = temp;
			}
		} //?????????
		for (i = 1;i < 299;i++)
		{
				if (a[i - 1] > a[i])
				{
				temp = a[i - 1];
				a[i - 1] = a[i];
				a[i] = temp;
				}
		} //????????
		if (a[298] == 0)
		{
			System.out.print("No");
		}
			else
			{
				System.out.printf("%d",a[298]);
			}
		return 0;
	}

}


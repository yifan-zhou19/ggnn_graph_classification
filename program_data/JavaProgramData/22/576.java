package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c = ',';
		int[] a = new int[300];
		int i = 0;
		int k;
		int j;
		int t;
		int m = 0;
		while (c == ',')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			i++;
		}
		if (i == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (k = 0;k < i - 1;k++)
			{
				for (j = 0;j < i - 1 - k;j++)
				{
					if (a[j] < a[j + 1])
					{
						t = a[j];
						a[j] = a[j + 1];
						a[j + 1] = t;
					}
				}
			}
		for (k = 1;k < i;k++)
		{
			if (a[k] < a[0])
			{
			System.out.printf("%d",a[k]);
			m = 1;
			break;
			}
		}
		if (m != 1)
		{
			System.out.print("No");
		}


		}
	}

}


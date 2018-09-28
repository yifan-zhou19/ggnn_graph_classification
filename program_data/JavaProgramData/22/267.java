package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i = 0;
		int j = 0;
		int flag = 0;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		i++;
		while (System.in.read() != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}

		if (i == 1)
		{
			System.out.print("No\n");
		}

		else
		{


		{
			for (j = 0;j <= i - 1;j++)
			{
				if (a[j] == a[j + 1])
				{
					flag++;
				}
			}
	}
		if (flag == (i - 1))
		{
			System.out.print("No\n");
		}
		else
		{
			for (j = 0;j <= i - 1;j++)
			{
			if (max < a[j])
			{
		max = a[j];
			}
			}
		for (j = 0;j <= i - 1;j++)
		{
			if (max == a[j])
			{
		a[j] = 0;
			}
		}

		max = 0;

		for (j = 0;j <= i - 1;j++)
		{
		 if (max < a[j])
		 {
		max = a[j];
		 }
		}
		System.out.printf("%d",max);
		}
		}
	}






}


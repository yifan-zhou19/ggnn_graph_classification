package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 1;
		int max;
		int sec = 0;
		int j;
		int s = 0;
		int[] a = new int[301];
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		for (;(c = System.in.read()) == ',';)
		{
			i++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (i == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			for (j = 1;j <= i;j++)
			{
				if (a[j] == a[1])
				{
					s++;
				}
			}
			if (s == i)
			{
				System.out.print("No\n");
			}
			else
			{
		max = a[1];
		for (j = 1;j <= i;j++)
		{
			if (a[j] > max)
			{
				max = a[j];
			}
		}
		for (j = 1;j <= i;j++)
		{
			if (a[j] == max)
			{
				a[j] = 0;
			}
		}
		for (j = 1;j <= i;j++)
		{
			if (a[j] > sec)
			{
				sec = a[j];
			}
		}
		System.out.printf("%d\n",sec);
			}
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int m = 0;
		int[] a = new int[300];
		int k = 0;
		int z = 0;
		char c;
		while (true)
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
			m++;
			if (c == '\n')
			{
				break;
			}
			i++;
		}
		for (i = 0;i < m;i++)
		{
			if (k < a[i])
			{
				z = k;
				k = a[i];
			}
			else if (z < a[i] && a[i] != k)
			{
				z = a[i];
			}
		}
		if (m == 1)
		{
			System.out.print("No");
		}
		else
		{
			if (z != 0)
			{
				System.out.printf("%d",z);
			}
			else
			{
				System.out.print("No");
			}
		}
	}
}


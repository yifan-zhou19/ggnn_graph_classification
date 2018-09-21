package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[600];
		int[] b = new int[600];
		int i;
		int j;
		int n;
		int m;
		int max;
		int second;
		char c = ',';
		for (i = 0;c != '\0' && c != '\n';i++)
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
		}
		max = a[0];
		n = i;
		j = 0;
		for (i = 1;i < n;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != max)
			{
				b[j] = a[i];
				j++;
			}
		}
		m = j;
		if (m == 0)
		{
			System.out.print("No");
		}
		else
		{
			second = b[0];
			for (j = 1;j < m;j++)
			{
				if (second < b[j])
				{
					second = b[j];
				}
			}
			System.out.printf("%d",second);
		}
		return 0;
	}
}


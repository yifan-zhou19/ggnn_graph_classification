package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int max1 = 0;
		int max2 = 0;
		int[] a = new int[300];
		int n = 0;
		int flag = 0;
		char c;
		while ((c = System.in.read()) != '\n')
		{
			if (c <= '9' && c >= '0')
			{
				a[n] *= 10;
				a[n] += c - '0';
			}
			if (c == ',')
			{
				n++;
			}
		}
		n++;
		for (i = 0;i < n;i++)
		{
			if (a[i] != a[0])
			{
				flag = 1;
				break;
			}
		}
		if (n == 1 && flag == 1)
		{
			flag = 0;
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] > max1)
				{
					max1 = a[i];
				}
			}
			for (i = 0;i < n;i++)
			{
				if (a[i] == max1)
				{
					continue;
				}
				if (a[i] > max2)
				{
					max2 = a[i];
				}
			}
			System.out.printf("%d",max2);
		}
		return 0;
	}

}

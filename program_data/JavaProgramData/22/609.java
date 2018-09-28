package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[310]);
		s = new Scanner(System.in).nextLine();
		int i;
		int j = -1;
		int k;
		int[] a = new int[300];
		int len;
		len = s.length();
		int flag = 0;
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && flag == 0)
			{
				j++;
				a[j] = s.charAt(i) - '0';
				flag = 1;
			}
			else if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && flag == 1)
			{
				a[j] = a[j] * 10 + s.charAt(i) - '0';
				flag = 1;
			}
			else
			{
				flag = 0;
			}
		}
		int x = 100;
		if (j == 0)
		{
			System.out.print("No");
		}
		else
		{
			x = 0;
		for (i = 1;i <= j;i++)
		{
			if (a[i] != a[0])
			{
				x = 1;
			}
		}
		if (x == 0)
		{
			System.out.print("No");
		}
		else
		{
			j++;
		for (k = 0;k < j;k++)
		{
			for (i = k + 1;i < j;i++)
			{
				if (i != k && a[i] == a[k])
				{
					a[k] = -1;
				}
			}
		}
		for (k = 0;k < j - 1;k++)
		{
			for (i = 0;i < j - 1 - k;i++)
			{
				if (a[i] < a[i + 1])
				{
					int t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
				System.out.printf("%d",a[1]);
		}
		}

	}


}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1000]);
		int[] a = new int[100];
		int k = 0;
		int i;
		int j;
		int l;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s = tempVar.charAt(0);
			}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				a[k] = a[k] * 10 + s.charAt(i) - 48;
			}
			if (s.charAt(i) == ',')
			{
				k = k + 1;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					l = a[j];
					a[j] = a[j + 1];
					a[j + 1] = l;
				}
			}
		}
		if (a[0] == a[k])
		{
			System.out.print("No");
		}
		else if (a[0] != a[k])
		{
			for (i = 0;i <= k;i++)
			{
				if (a[0] - a[i] > 0)
				{
					System.out.printf("%d",a[i]);
					break;
				}
				else
				{
					continue;
				}
			}
		}
	}

}


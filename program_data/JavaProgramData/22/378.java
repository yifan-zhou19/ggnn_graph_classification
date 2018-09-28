package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int k = 0;
		int i;
		int j = 0;
		int len;
		int[] a = new int[300];
		String str = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		len = str.length();
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) != ',')
			{
				a[j] = a[j] * 10 + str.charAt(i) - '0';
			}
			else
			{
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i <= j;i++)
			{
				for (k = 0;k < j;k++)
				{
					if (a[k] < a[k + 1])
					{
						t = a[k];
						a[k] = a[k + 1];
						a[k + 1] = t;
					}
				}
			}
			for (i = 0;i <= j;i++)
			{
				if (a[i] != a[0])
				{
					System.out.printf("%d\n",a[i]);
					break;
				}
				else if (i == j)
				{
					System.out.print("No\n");
				}
			}

		}
	}
}


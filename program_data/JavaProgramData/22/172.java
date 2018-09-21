package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int i;
		 int j = 0;
		 int[] a = new int[300];
		 int t;
		 int k;
		 int flag = 0;
		 int m;
		String str = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		m = str.length();
		for (i = 0;i < m;i++)
		{
			if (str.charAt(i) != ',')
			{
				a[j] = a[j] * 10 + str.charAt(i) - 48;
			}
			else
			{
				j++;
			}
		}
		for (i = 0;i <= j;i++)
		{
			for (k = 0;k < j - i;k++)
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
				System.out.printf("%d",a[i]);
				flag++;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
	}

}


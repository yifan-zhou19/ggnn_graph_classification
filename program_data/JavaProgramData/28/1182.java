package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100000]);
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int l;
		int m;
		int len;
		n = 0;
		k = 0;
		for (i = 0;i <= 300;i++)
		{
			a[i] = 0;
		}
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i <= len;i++)
		{
			if (str.charAt(i) == ' ')
			{
				if (k != 0)
				{
					n++;
					k = 0;
				}
			}
			else
			{
				a[n]++;
				k = 1;
			}
		}
		if (a[n] == 0)
		{
			l = 1;
		}
		else
		{
			l = 0;
		}
		for (i = 0;i < n - l;i++)
		{
			System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[n - l] - 1);
	}


}

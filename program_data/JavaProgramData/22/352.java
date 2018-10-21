package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[1500]);
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int l;
		int s;
		int t;
		int m;
		c = new Scanner(System.in).nextLine();
		j = 0;
		a[0] = 0;
		for (i = 0;c.charAt(i) != '\0';i++)
		{

			if (c.charAt(i) != ',')
			{
				a[j] = a[j] * 10 + c.charAt(i) - '0';
			}
			else
			{
				j = j + 1;
				a[j] = 0;
			}
		}
		for (k = 0;k < j;k++)
		{
			for (t = 0;t < j - k;t++)
			{
				if (a[t] < a[t + 1])
				{
					m = a[t];
					a[t] = a[t + 1];
					a[t + 1] = m;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			if (a[i] > a[i + 1])
			{

				System.out.printf("%d",a[i + 1]);
				break;
			}
		}
		if (i == j)
		{
			System.out.print("No");
		}
	}
}

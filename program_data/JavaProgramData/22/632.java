package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
		int[] a = new int[300];
		int i = 1;
		int j = 0;
		int n;
		int k;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) != ',')
			{
				a[j] = a[j] * 10 + s.charAt(i) - 48;
			}
			else
			{
				j++;
			}
		}
		n = j + 1;

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					k = a[j];
					a[j] = a[j + 1];
					a[j + 1] = k;
				}
			}
		}
		k = 0;
		for (i = n - 1;i >= 0;i--)
		{
			if (a[i] != a[n - 1])
			{
				System.out.printf("%d",a[i]);
				k++;
				break;
			}
		}
		 if (k == 0)
		 {
			 System.out.print("No");
		 }

		return 0;
	}


}

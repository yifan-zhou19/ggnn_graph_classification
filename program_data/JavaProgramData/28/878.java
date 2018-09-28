package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[300];
		int sum = 0;
		String s = new String(new char[60000]);
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) == ' ')
			{
				sum++;
				a[sum - 1] = i;
			}
		}
		if (sum == 0)
		{
			System.out.printf("%d",n);
		}
		if (sum == 1)
		{
			if (a[0] != 0)
			{
				System.out.printf("%d,",a[0]);
			}
			if (n - a[0] - 1 != 0)
			{
			   System.out.printf("%d",n - a[0] - 1);
			}
		}
		if (sum >= 2)
		{
			if (a[0] != 0)
			{
			   System.out.printf("%d,",a[0]);
			}
			for (i = 1;i <= sum - 1;i++)
			{
				if (a[i] - a[i - 1] - 1 != 0)
				{
				   System.out.printf("%d,",a[i] - a[i - 1] - 1);
				}
			}
			if (n - a[sum - 1] - 1 != 0)
			{
			   System.out.printf("%d",n - a[sum - 1] - 1);
			}
		}
		return 0;
	}
}

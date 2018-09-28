package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str = "";
		int n;
		int sum = 0;
		int j = 0;
		int i;
		int[] a = new int[10000];
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i <= n;i++)
		{
			if (str.charAt(i) != ' ' && str.charAt(i) != '\0')
			{
				sum = sum + 1;
			}
			else
			{
				a[j] = sum;
				j++;
				sum = 0;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%d,",a[i]);
			}
		}
		System.out.printf("%d",a[j - 1]);
	}
}

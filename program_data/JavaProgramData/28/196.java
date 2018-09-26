package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		String str = new String(new char[3000]);
		int i;
		int j = 0;
		int k;
		int n;
		int[] a = new int[300];
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) != ' ')
			{
				a[j]++;
			}
			if (str.charAt(i) == ' ')
			{
				j++;
				for (k = i;k < n;k++)
				{
					if (str.charAt(k) != ' ')
					{
						break;
					}
				}
				i = k - 1;
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (i == j)
			{
			System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.printf("%d,",a[i]);
			}
		}
	}
}

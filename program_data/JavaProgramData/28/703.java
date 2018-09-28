package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1024]);
		int i;
		int j;
		int[] a = new int[300];
		int k = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < 300;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) != ' ')
			{
				a[k]++;
			}
			if (str.charAt(i) == ' ' || str.charAt(i + 1) == '\0')
			{
				if (str.charAt(i - 1) == ' ')
				{
					continue;
				}
				if (str.charAt(i - 1) != ' ')
				{
					k++;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf(",%d",a[i]);
		}
	}
}

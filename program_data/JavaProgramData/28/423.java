package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[100000]);
		char b;
		int[] a = new int[100000];
		int i;
		int j;
		int k;
		int m;
		int n;
		c = new Scanner(System.in).nextLine();
		for (i = 0,m = 0;(b = c.charAt(i)) != '\0';i++)
		{
			if ((b = c.charAt(i)) != ' ')
			{
				a[m]++;
			}
			else
			{
				if ((b = c.charAt(i + 1)) != ' ')
				{
				m++;
				}
			}
		}
		for (i = 0;i <= m;i++)
		{
			if (i <= m - 1)
			{
				System.out.printf("%d,",a[i]);
			}
			else
			{
				System.out.printf("%d",a[i]);
			}
		}
	}
}

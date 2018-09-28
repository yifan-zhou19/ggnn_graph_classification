package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n = 0;
		int m = 0;
		int[] a = new int[300];
		int k = -1;
		String string = new String(new char[2000]);
		String = new Scanner(System.in).nextLine();
		char c;
		for (i = 0;(c = string.charAt(i)) != '\0';i++)
		{
			n = n + 1;
			if (c == ' ')
			{
				a[m] = i - k - 1;
				k = i;
				m++;
			}
		}
		a[m] = n - m;
		for (i = 0;i < m;i++)
		{
			a[m] = a[m] - a[i];
		}
		for (i = 0;i < m;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%d,",a[i]);
			}
		}
		System.out.printf("%d\n",a[m]);
	}

}

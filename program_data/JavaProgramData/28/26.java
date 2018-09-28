package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
		int i = 0;
		int k = 0;
		int m = 1;
		int[] b = new int[300];
		int l = 0;
		while ((a[i] = System.in.read()) != '\n')
		{
			i++;
			k++;
		}
		for (i = 0;i < k;i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				m++;
				l++;
			}
			if (a.charAt(i) != ' ')
			{
				b[l]++;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[m - 1]);
	}
}

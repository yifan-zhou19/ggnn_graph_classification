package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
		int[] k = new int[200];
		int l;
		int i;
		int j = 1;
		int[] m = new int[200];
		int max = 1;
		int min = 1;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',')
			{
				k[j]++;
			}
			else
			{
				if (a.charAt(i) == ' ')
				{
						m[j] = i;
						j++;
				}
			}
		}
		m[j] = a.length();
		for (i = 1;i <= j;i++)
		{
			if (k[max] < k[i])
			{
				max = i;
			}
		}
		for (l = m[max] - k[max];l < m[max] && a.charAt(l) != ',';l++)
		{
			System.out.printf("%c",a.charAt(l));
		}
		System.out.print('\n');
		for (i = 1;i <= j;i++)
		{
			if (k[min] > k[i])
			{
				min = i;
			}
		}
		for (l = m[min] - k[min];l < m[min] && a.charAt(l) != ',';l++)
		{
			System.out.printf("%c",a.charAt(l));
		}
	}
}

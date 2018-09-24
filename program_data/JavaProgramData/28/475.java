package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
		int[] b = new int[300];
		int m = 0;
		int i;
		a = new Scanner(System.in).nextLine();
		int n = a.length();
		for (i = 0;i < n;i++)
		{
			int k = 0;
			while (a.charAt(i) != ' ' && a.charAt(i) != '\0')
			{
				k++;
				i++;
			}

			if (k != 0)
			{
				m++;
			b[m] = k;
			}
		}
		for (i = 1;i < m;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d\n",b[m]);
	}

}

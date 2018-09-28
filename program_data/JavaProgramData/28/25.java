package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int k = 0;
		int[] b = new int[300];
		int n;
		int[] c = new int[300];
		String a = new String(new char[3000]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		c[0] = -1;
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i + 1) == ' ')
			{
				b[k] = i - c[k];
				k++;
			}
			if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				c[k] = i;
			}
		}
		b[k] = n - c[k] - 1;
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d\n",b[k]);
	}



}

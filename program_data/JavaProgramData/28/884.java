package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		char[][] a = new char[300][30];
		int[] b = new int[300];
		s = new Scanner(System.in).nextLine();
		int len = s.length();
		int i;
		int k = 0;
		int j = 0;
		int m;
		int n = 0;
		for (i = 0;i < len + 1;i++)
		{

			if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
			a[k][j] = s.charAt(i);
			j++;
			}
			if (s.charAt(i) == ' ' || s.charAt(i) == '\0')
			{
				a[k][j] = '\0';
				k++;
				j = 0;
			}
		}


		for (m = 0;m < k - 1;m++)
		{
			b[n] = String.valueOf(a[m]).length();
			if (b[n] != 0)
			{
			System.out.printf("%d,",b[n]);
			}
			n++;
		}
		b[k - 1] = String.valueOf(a[k - 1]).length();
			System.out.printf("%d\n",b[k - 1]);
			return 0;
	}

}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		char[][] a = new char[500][40];
		int[] b = new int[500];
		int m;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			b[i] = String.valueOf(a[i]).length();
		}
		a[i][0] = '\0';
		b[i] = 0;
		m = b[0];
		for (j = 0;j < n - 1;j++)
		{
			m = m + 1 + b[j + 1];
			if (m <= 80)
			{
				System.out.printf("%s ",a[j]);
			}
			else
			{
				System.out.printf("%s\n",a[j]);
				m = b[j + 1];
			}
		}
		System.out.printf("%s\n",a[j]);
	}

}


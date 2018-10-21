package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int m;
		int n;
		int i;
		int l;
		int q;
		int max = 0;
		String s = new String(new char[501]);
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (m = 0;m < l - 1;m++)
		{
		for (i = 0;i < n;i++)
		{
		b[m][i] = s.charAt(m + i);
		}
		}
		for (m = 0;m < l - 1;m++)
		{
			a[m] = 1;
			for (q = m + 1;q < l - 1;q++)
			{
			   if (strcmp(b[m],b[q]) == 0)
			   {
				  a[m] = a[m] + 1;
			   }
			}
			if (a[m] > max)
			{
				max = a[m];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		if (max != 1)
		{
			System.out.printf("%d\n",max);
		}
		for (m = 0;m < l - 2;m++)
		{
			if (a[m] == max && max != 1)
			{
			 System.out.printf("%s\n",b[m]);
			}
		}

	}

}


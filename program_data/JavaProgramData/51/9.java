package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
		final String t = "";
		final String r = "";
		int[] a = new int[500];
		int n;
		int m;
		int i;
		int j;
		int k = 0;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n - m + 1;i++)
		{
			p = 0;
			for (j = 0;j < m;j++)
			{
				r = tangible.StringFunctions.changeCharacter(r, j, s.charAt(i + j));
			}
			for (j = 0;j < k;j++)
			{
				if (strcmp(r,t.charAt(j)) == 0)
				{
					a[j]++;
					p++;
				}
			}
			if (p == 0)
			{
				t = tangible.StringFunctions.changeCharacter(t, k, r);
				k++;
				a[k - 1]++;
			}
		}
		p = a[0];
		for (i = 0;i < k;i++)
		{
			if (p < a[i])
			{
				p = a[i];
			}
		}
		if (p == 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d",p);
		for (i = 0;i < k;i++)
		{
			if (a[i] == p)
			{
				System.out.printf("\n%s",t.charAt(i));
			}
		}
		}
		return 0;
	}


}


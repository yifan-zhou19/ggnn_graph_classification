package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] a = new int[500];
		int[] b = new int[500];
		int n;
		int l;
		int max;
		final String s = "";
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i <= l - n;i++)
		{
						   for (j = 0;j < n;j++)
						   {
											c.charAt(i)[j] = s.charAt(i + j);
						   }
		}
		for (i = 0;i <= l - n;i++)
		{
						   for (j = i;j <= l - n;j++)
						   {
											  if (strcmp(c.charAt(i),c.charAt(j)) == 0)
											  {
												  a[i]++;
											  }
						   }
		}
		max = a[0];
		for (i = 0;i < l - n;i++)
		{
						   if (a[i] >= max)
						   {
							   max = a[i];
						   }
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			  for (i = 0;i < l - n;i++)
			  {
						   if (a[i] == max)
						   {
							   System.out.println(c.charAt(i));
						   }
			  }
		}

	}
}


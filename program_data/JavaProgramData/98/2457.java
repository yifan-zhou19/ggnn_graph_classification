package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int sum = 0;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
			 sum += String.valueOf(a[0]).length();
			 System.out.printf("%s",a[0]);
		for (p = a[1][0];p < a[0][0] + n * 40;p += 40)
		{
			if (p.length() + sum + 1 > 80)
			{
			   System.out.printf("\n%s",p);
						 sum = p.length();
						 continue;
			}
			System.out.printf(" %s",p);
					  sum += p.length();
					  sum++;
		}
			 System.out.printf("%s",p.Substring(40));
	}

}


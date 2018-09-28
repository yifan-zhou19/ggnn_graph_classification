package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] s =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i = 0;
		int j = 0;
		int[] a = new int[1000];
		int[] z = new int[1000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			a[i] = String.valueOf(s[i]).length();
		}
		for (i = 0;i < n - 1;i++)
		{
			if (z[j] + a[i] <= 80 && z[j] + a[i] + 1 + a[i + 1] <= 80)
			{
				System.out.printf("%s ",s[i]);
				z[j] = z[j] + a[i] + 1;
			}
			else if (z[j] + a[i] <= 80 && z[j] + a[i] + 1 + a[i + 1]>80)
			{
				System.out.printf("%s",s[i]);
				z[j] = z[j] + a[i] + 1;
			}
			else if (z[j] + a[i] > 80)
			{
				j++;
				System.out.printf("\n%s ",s[i]);
				z[j] = z[j] + a[i] + 1;
			}
		}


	System.out.printf("%s",s[n - 1]);
		return 0;
	}
}


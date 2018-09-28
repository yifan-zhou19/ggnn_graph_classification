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
		char[][] a = new char[1000][40];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		int[] b = new int[1000];
		for (i = 0;i < n;i++)
		{
			b[i] = String.valueOf(a[i]).length();
		}
		System.out.printf("%s",a[0]);
		int count = String.valueOf(a[0]).length();
		for (i = 1;i < n;i++)
		{
			if (count + 1 + String.valueOf(a[i]).length() <= 80)
			{
				System.out.printf(" %s",a[i]);
				count = count + 1 + String.valueOf(a[i]).length();
			}
			else
			{
				System.out.printf("\n%s",a[i]);
				count = String.valueOf(a[i]).length();
			}
		}
		return 0;
	}

}


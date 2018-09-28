package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		char[][] a = new char[300][40];
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
		}
		int sum = 0;
		for (i = 0;i < n - 1;i++)
		{
			if ((80 - sum) >= (String.valueOf(a[i]).length()) && (80 - sum) < (String.valueOf(a[i]).length() + String.valueOf(a[i + 1]).length() + 1))
			{
				System.out.printf("%s\n",a[i]);
				sum = 0;
			}
			else if ((80 - sum) >= (String.valueOf(a[i]).length() + String.valueOf(a[i + 1]).length() + 1))
			{
				System.out.printf("%s ",a[i]);
				sum = sum + String.valueOf(a[i]).length() + 1;
			}
		}
		System.out.printf("%s\n",a[n - 1]);
	}
}


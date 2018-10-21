package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int t = 0;
		char[][] a = new char[1000][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i <= n - 2;i++)
		{
			t = t + String.valueOf(a[i]).length() + 1;
			if (t < 81 && (t + String.valueOf(a[i + 1]).length() + 1) <= 81)
			{
				System.out.printf("%s ",a[i]);
			}
			else if (t < 81 && (t + String.valueOf(a[i + 1]).length() + 1)>81)
			{
				System.out.printf("%s",a[i]);
			}
			else if (t == 81)
			{
				System.out.printf("%s\n",a[i]);
				t = 0;
			}
			else if (t > 81)
			{
				System.out.print("\n");
				t = 0;
				i = i - 1;
			}
		}
		System.out.printf("%s\n",a[n - 1]);
	}

}


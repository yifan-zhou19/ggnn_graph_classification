package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[500][41];
		int n;
		int i;
		int j;
		int k;
		int r;
		int[] b = new int[500];
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
		for (i = 0,k = b[0] + 1;i < n - 1;i++)
		{
			k = k + b[i + 1];
			System.out.printf("%s",a[i]);
			if (k > 80)
			{
				System.out.print("\n");
				k = b[i + 1] + 1;
			}
			else
			{
				System.out.print(" ");
				k = k + 1;
			}
		}
		System.out.printf("%s",a[n - 1]);
	}
}


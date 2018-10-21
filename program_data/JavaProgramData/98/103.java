package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 1;
		int[] a = new int[1000];
		int s = 0;
		char[][] m = new char[1000][40];
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
				m[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i] = String.valueOf(m[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.printf("%s",m[i]);
				break;
			}
			s = s + a[i] + 1;
			if (s + a[i + 1] <= 80)
			{
				System.out.printf("%s ",m[i]);

			}
			else
			{
				System.out.printf("%s",m[i]);
				System.out.print("\n");
				s = 0;
			}

		}
	}
}


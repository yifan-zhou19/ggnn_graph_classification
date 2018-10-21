package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100];
		int[] b = new int[100];
		int i;
		char c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
		int n = i + 1;
		for (i = 0;i < n;i++)
		{
			b[i] = String.valueOf(a[i]).length();
		}
		int max = 0;
		int min = 100;
		int imax = 0;
		int imin = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
				imax = i;
			}
			if (b[i] < min)
			{
				min = b[i];
				imin = i;
			}
		}
		System.out.printf("%s\n%s",a[imax],a[imin]);
	}
}


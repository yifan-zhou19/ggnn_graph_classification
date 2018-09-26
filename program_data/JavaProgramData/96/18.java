package <missing>;

public class GlobalMembers
{
	public static final int maxn = 100;
	public static int[] a = new int[maxn + 10];
	public static String line = new String(new char[maxn + 10]);
	public static int Main()
	{
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			line = tempVar.charAt(0);
		}
		int len = line.length();
		int[] a = new int[maxn + 10];
		int b;
		int temp = 0;

		for (i = 0;i < len;i++)
		{
			temp = temp * 10 + line.charAt(i) - '0';
			a[i] = temp / 13;
			temp = temp % 13;
		}
		int m = 0;
		if (len == 1)
		{
			System.out.print("0");
		}
		if ((len <= 2) && (((line.charAt(0) - '0') * 10 + (line.charAt(1) - '0')) < 13))
		{
			System.out.print("0");
		}
		for (i = 0;i < len;i++)
		{
			if (a[i] != 0)
			{
				m = 1;
			}
			if (m == 1)
			{
				System.out.printf("%d",a[i]);
			}


		}
		System.out.printf("\n%d",temp);
		return 0;
	}


}


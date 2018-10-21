package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String str1 = new String(new char[LENGTH + 1]);
		String str2 = new String(new char[LENGTH + 1]);
		String ln = new String(new char[LENGTH + 1]);
		int[] a = new int[LENGTH + 1];
		int[] b = new int[LENGTH + 1];
		int len1;
		int len2;
		int h;
		int i;
		int t;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (h = 1;h <= n;h++)
		{
			str1 = new Scanner(System.in).nextLine();
			str2 = new Scanner(System.in).nextLine();
			if (h < n)
			{
				ln = new Scanner(System.in).nextLine();
			}
			len1 = str1.length();
			len2 = str2.length();
			for (i = 0;i <= LENGTH;i++)
			{
				a[i] = 0;
				b[i] = 0;
			}
			for (i = 0;i < len1;i++)
			{
				a[LENGTH - i] = str1.charAt(len1 - i - 1) - '0';
			}
			for (i = 0;i < len2;i++)
			{
				b[LENGTH - i] = str2.charAt(len2 - i - 1) - '0';
			}
			for (i = 0;i <= LENGTH;i++)
			{
				a[i] -= b[i];
			}
			for (i = LENGTH;i > 0;i--)
			{
				if (a[i] < 0)
				{
					a[i] += 10;
					a[i - 1]--;
				}
			}
			t = 0;
			while (a[t] == 0)
			{
				t++;
			}
			for (i = t;i <= LENGTH;i++)
			{
				System.out.printf("%d", a[i]);
			}
			if (h < n)
			{
				System.out.print("\n");
			}
		}
	}
}


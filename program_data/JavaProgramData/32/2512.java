package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int t;
		int len1;
		int len2;
		int k = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String str3 = new String(new char[100]);
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			len1 = a.length();
			len2 = b.length();
			t = 0;
			for (j = 1;j <= len2;j++)
			{
				c[j] = t + a.charAt(len1 - j) - b.charAt(len2 - j) + 10 * (a.charAt(len1 - j) + t < b.charAt(len2 - j));
			t = -1 * (a.charAt(len1 - j) - b.charAt(len2 - j) + t < 0);

			}
			if (len1 - len2 - 1 >= 0)
			{
					for (j = len2 + 1;j <= len1;j++)
					{
						c[j] = t + a.charAt(len1 - j) - 48 + 10 * (a.charAt(len1 - j) - 48 + t < 0);
					t = -1 * (a.charAt(len1 - j) - 48 + t < 0);
					}
			}
		   k = 0;
			for (j = len1;j >= 1;j--)
			{
				if (c[j] == 0)
				{
					k++;
				}
				else
				{
					break;
				}
			}
		for (j = len1 - k;j >= 1;j--)
		{
		System.out.printf("%d",c[j]);
		}
	System.out.print("\n");
		}
	}
}


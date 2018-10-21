package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a1 = new String(new char[252]);
		String b1 = new String(new char[252]);
		int[] a = new int[252];
		int[] b = new int[252];
		int[] sum = new int[252];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b1 = tempVar2.charAt(0);
		}
		int i;
		int j;
		for (i = 0;i < 252;i++)
		{
			a[i] = 0;
			b[i] = 0;
			sum[i] = 0;
		}
		int lena;
		int lenb;
		lena = a1.length();
		lenb = b1.length();
		for (i = 0;i < lena;i++)
		{
			a[i] = a1.charAt(lena - 1 - i) - '0';
		}
		for (i = 0;i < lenb;i++)
		{
			b[i] = b1.charAt(lenb - 1 - i) - '0';
		}

		for (i = 0;i < 252;i++)
		{
			sum[i] = sum[i] + a[i] + b[i];
			if (sum[i] > 9)
			{
				sum[i] = sum[i] - 10;
				sum[i + 1] = sum[i + 1] + 1;
			}
		}
		for (i = 251;i >= 0;i--)
		{
			if (sum[i] != 0)
			{
				break;
			}
		}
		if (i < 0)
		{
			System.out.print("0");
		}
		else
		{
		for (j = i;j >= 0;j--)
		{
			System.out.printf("%d",sum[j]);
		}
		}
		return 0;
	}

}


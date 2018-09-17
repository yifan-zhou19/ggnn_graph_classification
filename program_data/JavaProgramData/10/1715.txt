package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int s;
		int k;
		int d;
		int[] a = new int[26]; //?b[i]????i????????
		int[] b = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++) //???????b[i]????
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			b[i] = 0;
		}
			 b[n] = 1;
		for (i = n - 1;i >= 1;i--) //b[i]??i????????1
		{
			for (j = i + 1;j <= n;j++)
			{
				if ((a[j] <= a[i]) && (b[j]> b[i]))
				{
					b[i] = b[j];
				}
			}
			b[i] = b[i] + 1;
		}
		s = 0;
		for (i = 1;i <= n;i++) //?????b[i]??????
		{
			if (s < b[i])
			{
				s = b[i];
			}
		}
		System.out.printf("%d",s);
	}
}


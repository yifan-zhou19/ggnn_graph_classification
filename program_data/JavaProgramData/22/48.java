package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l;
		int i;
		int j;
		int k = 0;
		int tp = 0;
		int[] f = new int[300];
		String str = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		l = str.length();
		for (i = 0;i < l;i++)
		{
			if (!(str.charAt(i) == 44))
			{
				tp = tp * 10 + str.charAt(i) - 48;
			}
			else if (!(str.charAt(i - 1) == 44))
			{
				f[k] = tp;
				k++;
				tp = 0;
			}
		}
		f[k] = tp;
		k++;
		f[k] = 0;
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (f[j] > f[i])
				{
					tp = f[i];
					f[i] = f[j];
					f[j] = tp;
				}
			}
		}
		if (k == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 1;i < k;i++)
			{
				if (f[i - 1] > f[i])
				{
					System.out.printf("%d",f[i]);
					break;
				}
			}
			if (i == k)
			{
				System.out.print("No");
			}
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int n;
		int i;
		int j;
		int k;
		int p;
		int[] a = new int[100];
		int[] b = new int[100];
		int yidegeshu;
		int erdegeshu;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 0;p <= n - 1;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str2 = tempVar3.charAt(0);
			}
			yidegeshu = str1.length();
			erdegeshu = str2.length();
			for (i = 0;i <= yidegeshu - 1;i++)
			{
				a[i] = str1.charAt(yidegeshu - i - 1) - 48;
			}
			for (i = 0;i <= erdegeshu - 1;i++)
			{
				b[i] = str2.charAt(erdegeshu - i - 1) - 48;
			}
			for (j = erdegeshu;j <= yidegeshu - 1;j++)
			{
				b[j] = 0;
			}
		for (i = 0;i <= yidegeshu - 1;i++)
		{
			if (a[i] >= b[i])
			{
				a[i] = a[i] - b[i];
			}
			else if (a[i] < b[i])
			{
				a[i] = a[i] + 10;
				a[i + 1] = a[i + 1] - 1;
				a[i] = a[i] - b[i];
			}
		}
		for (k = yidegeshu - 1;k >= 0;k--)
		{
			System.out.printf("%d",a[k]);
		}
		System.out.print("\n");
		}
	}




}


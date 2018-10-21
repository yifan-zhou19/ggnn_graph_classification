package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[252];
		int[] b = new int[251];
		String c = new String(new char[250]);
		String d = new String(new char[250]);
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		int i;
		int j;
		int m;
		for (i = c.length() - 1,j = 0;i >= 0;i--,j++)
		{
			a[j] = c.charAt(i) - '0';
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = tempVar2.charAt(0);
		}
		for (i = d.length() - 1,j = 0;i >= 0;i--,j++)
		{
			b[j] = d.charAt(i) - '0';
		}
		for (m = 0;m <= 250;m++)
		{
			temp = a[m] + b[m];
			a[m] = temp % 10;
			a[m + 1] = a[m + 1] + temp / 10;
		}
		for (m = 251;m >= 1;m--)
		{
			if (a[m] != 0)
			{
				break;
			}
		}
		for (m;m >= 0;m--)
		{
			System.out.printf("%d",a[m]);
		}
	}

}


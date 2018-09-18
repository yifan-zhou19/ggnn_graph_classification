package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int n_1 = 0;
		int i = 0;
		int len = 0;
		int[] a = new int[6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		n_1 = n;
		for (;n / 10 > 0;)
		{
			n = n / 10;
			len++;
		}
		len++;
		for (i = 0;i < len;i++)
		{
			a[i] = n_1 % 10;
			n_1 = n_1 / 10;
		}
		for (i = 0;i < len;i++)
		{
			System.out.printf("%d",a[i]);
		}
	}




}


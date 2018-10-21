package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print("0");
		}
		for (i = 0;n != 0;i++)
		{
			a[i] = n % 10;
			n = n / 10;
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d",a[j]);
		}
	}




}


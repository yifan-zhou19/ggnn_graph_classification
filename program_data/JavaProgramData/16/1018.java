package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int n;
		int flag;
		flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print("0");
		}
		else
		{
			while (n != 0)
			{
				flag++;
				a[flag] = n % 10;
				n = n / 10;
			}
			for (int i = 1;i <= flag;i++)
			{
				System.out.printf("%d",a[i]);
			}
		}
		return 0;
	}
}


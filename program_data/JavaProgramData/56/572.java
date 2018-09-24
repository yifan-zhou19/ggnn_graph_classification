package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[6];
		int i;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 6;i++)
		{
			a[i] = n % 10;
			n = n / 10;
			if (a[i] == 0)
			{
				p = i;
			break;
			}
		}
		for (i = 1;i < p;i++)
		{
			System.out.printf("%d",a[i]);
		}
	}


}


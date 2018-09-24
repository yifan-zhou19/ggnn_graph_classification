package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int n;
		int a = 1;
		int i;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (a = 1;;a++)
		{
			i = 0;
			b = a;
			while (a % (n - 1) == 0)
			{
				a = n * a / (n - 1) + k;
				i = i + 1;
			}
			if (i == n)
			{
				break;
			}
			else
			{
				a = b;
			}
		}
			System.out.printf("%d",a);
	}

}


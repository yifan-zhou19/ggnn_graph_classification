package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[301],x;
		int[] a = new int[301];
		int x;
		int n = 1;
		int i;
		int j;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
			n++;
		}while (c != '\n');
		n = n - 1;
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 1;i <= n - 1;i++)
		{
			for (j = 1;j <= n - i;j++)
			{
				if (a[j] >= a[j + 1])
				{
					x = a[j];
					a[j] = a[j + 1];
					a[j + 1] = x;
				}
			}
		}
		i = n;
		while (i >= 2)
		{
			if (a[i] > a[i - 1])
			{
				System.out.printf("%u",a[i - 1]);
				break;
			}
			i--;
		}
		if (i == 1)
		{
			System.out.print("No");
		}
		}
		return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int n = 0;
		int i;
		int k;
		int j1;
		int j2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			j2 = Integer.parseInt(tempVar3);
		}
		for (i = 0;a[i] != 0;i++)
		{
			if (a[i] >= '0' && a[i] <= '9')
			{
				n = n * j1 + a[i] - '0';
			}
			else if (a[i] >= 'A' && a[i] <= 'Z')
			{
				n = n * j1 + a[i] - 'A' + 10;
			}
			else if (a[i] >= 'a' && a[i] <= 'z')
			{
				n = n * j1 + a[i] - 'a' + 10;
			}
		}
		if (n == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			for (i = 0;i <= 31,n>0;i++)
			{
				k = n % j2;
				if (k < 10)
				{
					b[i] = k + '0';
				}
				else
				{
					b[i] = k - 10 + 'A';
				}
				n = n / j2;
			}
			i = 31;
			while (b[i] == 0)
			{
				i--;
			}
			for (;i >= 0;i--)
			{
				System.out.printf("%c",b[i]);
			}
			System.out.print("\n");
		}
	}

}


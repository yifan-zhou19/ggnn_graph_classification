package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[300],t,n,j;
		int[] a = new int[300];
		int t;
		int n;
		int j;
		int i;
		char s;
		for (n = 0;;n++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			if (s != ',')
			{
				break;
			}
		}
		for (i = n;i >= 1;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = n - 1;a[i] == a[i + 1] && i >= 0;i--)
		{
			;
		}
		if (i == -1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",a[i]);
		}
	}
}


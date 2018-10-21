package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[301];
		int[] a = new int[301];
		char b;
		int i = 1;
		int j;
		int tr;
		int p = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			if (b != ',')
			{
				break;
			}
			i++;
		}
		if (i == 1)
		{
			System.out.print("No");
			p = 1;
		}
		else
		{
			for (j = i;j >= 2;j--)
			{
			if (a[j] != a[j - 1])
			{
				break;
			}
			if (j == 2)
			{
				p = 1;
				System.out.print("No");
			}
			}
		}

		if (p != 1)
		{
			for (j = i;j >= 2;j--)
			{
			if (a[j] >= a[j - 1])
			{
				tr = a[j - 1];
				a[j - 1] = a[j];
				a[j] = tr;
			}
			}
		for (j = i;j >= 3;j--)
		{
			if (a[j] >= a[j - 1] != 0 && a[j] != a[1] || a[j - 1] == a[1])
			{
				tr = a[j - 1];
				a[j - 1] = a[j];
				a[j] = tr;
			}
		}
		System.out.printf("%d",a[2]);
		}

	}
}


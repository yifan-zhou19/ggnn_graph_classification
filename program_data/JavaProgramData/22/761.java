package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[400]={0};
		int[] a = new int[400];
		String b = new String(new char[500]);
		int i;
		int j;
		int t;
		for (i = 1;i <= 310;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (i = 1;i <= 300;i++)
		{
			for (j = 1;j <= 300;j++)
			{
				if (a[j] < a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 1;i <= 300;i++)
		{
				if (a[i + 1] == 0)
				{
					System.out.print("No\n");
				}
				if (a[i + 1] == 0)
				{
					break;
				}
				if ((a[i] - a[i + 1]) != 0)
				{
				System.out.printf("%d\n",a[i + 1]);
				}
				if ((a[i] - a[i + 1]) != 0)
				{
					break;
				}
		}
		if (i == 300)
		{
			System.out.print("No\n");
		}
	return 0;
	}
}


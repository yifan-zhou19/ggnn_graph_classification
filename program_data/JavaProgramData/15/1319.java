package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		int len = 0;
		int final;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned short a[500][500];
		short[][] a = new short[500][500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Short.parseShort(tempVar2);
				}
				if (a[i][j] == 0)
				{
					sum++;
				}
			}
		}
		for (i = 0;i < n && len == 0;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					len++;
				}
			}
		}
		final = (sum - 2 * len) / 2 * (len - 2);
		System.out.printf("%d\n",final);
		return 0;
	}


}


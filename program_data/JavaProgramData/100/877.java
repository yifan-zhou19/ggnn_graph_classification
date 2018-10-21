package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		int count;
		count = zfc.length();
		int i = 0;
		int sum = 0;
		for (int k = 97;k < 123;k++)
		{
			for (i = 0;i < count;i++)
			{
				if (zfc.charAt(i) == k)
				{
				sum++;
				}
			}
			if (sum != 0)
			{
				System.out.printf("%c=%d\n",k,sum);
				sum = 0;
			}
		}
		for (i = 0;i < count;i++)
		{
			if (zfc.charAt(i) > 96 && zfc.charAt(i) < 123)
			{
			sum = 1;
			}
		}
		if (sum != 1)
		{
			System.out.print("No");
		}
		return 0;
	}


}


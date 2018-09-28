package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[7];
		int br;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: long unsigned s;
		int s;
		int i = 0;

		for (;;)
		{
			br = 0;
			for (i = 1;i <= 6;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				if (a[i] == 0)
				{
					br++;
				}
			}
			if (br == 6)
			{
				break;
			}
			s = ((a[4] + 12) * 3600 + a[5] * 60 + a[6]) - (a[1] * 3600 + a[2] * 60 + a[3]);
			System.out.printf("%ld\n",s);
		}
		return 0;
	}
}


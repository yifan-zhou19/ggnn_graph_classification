package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int i;
		int n;
		int s;
		int count;
		char k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		n = str.length();
		if (str.charAt(0) < 97)
		{
		k = str.charAt(0);
		}
		else
		{
			k = str.charAt(0) - 32;
		}
		count = 1;
		for (i = 1;i < n;i++)
		{
			if (str.charAt(i) == k || str.charAt(i) - 32 == k)
			{
				count = count + 1;
			}
			else
			{
				System.out.printf("(%c,%d)",k,count);
				if (str.charAt(i) < 97)
				{
				k = str.charAt(i);
				}
				else
				{
				k = str.charAt(i) - 32;
				}
				count = 1;
			}

		}
			System.out.printf("(%c,%d)",k,count);
		return 0;
	}

}


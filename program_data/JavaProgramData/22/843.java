package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int s[301],max=0,second=0;
		int[] s = new int[301];
		int max = 0;
		int second = 0;
		char c = '0';
		int i = 0;
		int j;
		while (c != '\n')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			i++;
		}
		for (j = 0;j < i;j++)
		{
			if (s[j] > max)
			{
				second = max;
			max = s[j];
			}
			else if (s[j] < max && s[j]> second)
			{
			second = s[j];
			}
			else
			{
			continue;
			}
		}
		if (second != 0)
		{
		System.out.printf("%d",second);
		}
		else
		{
		System.out.print("No");
		}
		return 0;
	}
}


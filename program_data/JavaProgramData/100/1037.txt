package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[301]);
	final String zimu = "abcdefghijklmnopqrstuvwxyz";
	int i;
	int k;
	int len;
	int[] num = new int[27];
	int sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	len = str.length();
	for (i = 0;i < 27;i++)
	{
		num[i] = 0;
		for (k = 0;k < len;k++)
		{
			if (zimu.charAt(i) == str.charAt(k))
			{
				num[i]++;
			}

		}

	}
	for (i = 0;i < 27;i++)
	{
			 sum += num[i];
		if (num[i] > 0)
		{
		System.out.printf("%c=%d\n",zimu.charAt(i),num[i]);
		}
	}
	if (sum == 0)
	{
	System.out.print("No");
	}

	return 0;
	}

}


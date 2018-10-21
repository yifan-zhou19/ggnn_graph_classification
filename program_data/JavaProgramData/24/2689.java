package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String max = new String(new char[50]);
		String min = new String(new char[50]);
		String a = new String(new char[50]);
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			max = tempVar2.charAt(0);
		}
		min = max;
		for (i = 2;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = tempVar3.charAt(0);
			}
			if (a.length() > max.length())
			{
				max = a;
			}
			if (a.length() < min.length())
			{
				min = a;
			}
		}
		System.out.printf("%s\n",max);
		System.out.printf("%s\n",min);
		return 0;
	}
}


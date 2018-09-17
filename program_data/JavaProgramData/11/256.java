package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = new int[6];
		int[] month = new int[6];
		int[] day = new int[6];
		int[] s = new int[6];
		int i = 1;
		int n;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = 1;
		while (n <= 5)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year[n] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month[n] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day[n] = Integer.parseInt(tempVar3);
		}
		if ((year[n] % 4 == 0 && year[n] % 100 != 0) || year[n] % 400 == 0)
		{
		m[2] = 29;
		}
	else
	{
		m[2] = 28;
	}
		while (i < month[n])
		{
		s[n] = s[n] + m[i];
		i = i + 1;
		}
		s[n] = s[n] + day[n];
		n = n + 1;
		i = 1;
		}
		for (n = 1;n <= 5;n = n + 1)
		{
			System.out.printf("%d\n",s[n]);
		}
		return 0;
	}

}


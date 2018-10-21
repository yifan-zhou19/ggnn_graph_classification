package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		String c = new String(new char[20]);
		int i;
		int j;
		int k;
		int sum1;
		int sum2;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		sum1 = a.length();
		sum2 = b.length();
		for (i = 0;i <= (sum2 - sum1);i++)
		{
			c = b;
			c = c.substring(0, i + sum1);
			if (strcmp(c.charAt(i), a) == 0)
			{
				num = i;
				break;
			}
		}
		System.out.printf("%d", num);
		return 0;
	}

}


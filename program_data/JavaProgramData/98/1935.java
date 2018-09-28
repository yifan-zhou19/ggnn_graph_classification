package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	int k = 0;
	int m = 0;
	String s = new String(new char[45]);
	int len;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		len = s.length();
		k = k + len;
		m++;
		if (m == 1)
		{
			System.out.printf("%s",s);
		}
		else
		{
		if ((k + m - 1) <= 80)
		{
			System.out.print(" ");
		System.out.printf("%s",s);
		}
		else
		{
			System.out.print("\n");
		System.out.printf("%s",s);
		k = len;
		m = 1;
		}
		}
	}
	}

}


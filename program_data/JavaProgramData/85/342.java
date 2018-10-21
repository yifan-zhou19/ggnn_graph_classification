package <missing>;

public class GlobalMembers
{
	public static int range(String x)
	{
		int i;
		int len;
		len = x.length();
		for (i = 0;i < len;i++)
		{
			if (x[i].compareTo(48) < 0 || x[i].compareTo(57) > 0 && x[i].compareTo(65) < 0 || x[i].compareTo(90) > 0 && x[i].compareTo(95) < 0 || x[i].compareTo(95) > 0 && x[i].compareTo(97) < 0 || x[i].compareTo(122) > 0)
			{
				return (0);
			}
		}
		return (1);
	}
	public static int first(String x)
	{
		if (x[0].compareTo(48) >= 0 && x[0].compareTo(57) <= 0)
		{
			return (0);
		}
		else
		{
			return (1);
		}
	}
	public static int Main()
	{
		int n;
		int i;
		String x = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = tempVar2.charAt(0);
			}
			if (range(x) == 1 && first(x) == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}

}


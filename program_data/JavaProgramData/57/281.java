package <missing>;

public class GlobalMembers
{
	public static void cancel(String a)
	{
		int i;
		int s;
		s = a.length();
		if (a[s - 1].equals('r') && a[s - 2].equals('e'))
		{
			for (i = 0;i < s - 2;i++)
			{
				System.out.printf("%c",a[i]);
			}
		}
		else if (a[s - 1].equals('y') && a[s - 2].equals('l'))
		{
			for (i = 0;i < s - 2;i++)
			{
				System.out.printf("%c",a[i]);
			}
		}
		else
		{
			for (i = 0;i < s - 3;i++)
			{
				System.out.printf("%c",a[i]);
			}
		}
			System.out.print("\n");
	}
	public static void Main()
	{
		int n;
		int i;
		String a = new String(new char[20]);
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
				a = tempVar2.charAt(0);
			}
			cancel(a);
		}
	}
}


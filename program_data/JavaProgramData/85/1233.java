package <missing>;

public class GlobalMembers
{
	public static int check(String a)
	{
		int i;
		int n;
		n = a.length();
		if (!(a[0].equals('_') || (a[0].compareTo('a') >= 0 && a[0].compareTo('z') <= 0) || (a[0].compareTo('A') >= 0 && a[0].compareTo('Z') <= 0)))
		{
			return 0;
		}
		else
		{
			for (i = 1;i < n;i++)
			{
				if (!((a[i].compareTo('0') >= 0 && a[i].compareTo('9') <= 0) || a[i].equals('_') || (a[i].compareTo('a') >= 0 && a[i].compareTo('z') <= 0) || (a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0)))
				{
					return 0;
				}
			}
		}
		return 1;
	}
	public static void Main()
	{
		String a = new String(new char[21]);
		int n;
		int i;
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
			if (check(a) != 0)
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


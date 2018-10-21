package <missing>;

public class GlobalMembers
{
	public static int biaozhi(String a)
	{
		int i;
		int l;
		if ((a[0].compareTo('z') <= 0 && a[0].compareTo('a') >= 0) || (a[0].compareTo('Z') <= 0 && a[0].compareTo('A') >= 0) || a[0].equals('_'))
		{
			for (i = 1;i < a.length();i++)
			{
				if ((a[i].compareTo('z') <= 0 && a[i].compareTo('a') >= 0) || (a[i].compareTo('Z') <= 0 && a[i].compareTo('A') >= 0) || a[i].equals('_') || (a[i].compareTo('0') >= 0 && a[i].compareTo('9') <= 0))
				{
					l = 1;
				}
				else
				{
					l = 0;
					break;
				}
			}
			return l;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int n;
		int i;
		String a = new String(new char[25]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			if (biaozhi(a) != 0)
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


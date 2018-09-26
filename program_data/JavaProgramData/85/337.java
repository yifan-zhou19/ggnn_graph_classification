package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int check(String a)
	{
		int i;
		int l;
		l = a.length();
		if ((a[0].equals('_')) || (a[0].compareTo('a') >= 0 && a[0].compareTo('z') <= 0) || (a[0].compareTo('A') >= 0 && a[0].compareTo('Z') <= 0))
		{
			i = 1;
		}
		else
		{
			return 0;
		}
		for (i = 1;i < l;i++)
		{
			 if ((a[i].compareTo('0') >= 0 && a[i].compareTo('9') <= 0) || (a[i].equals('_')) || (a[i].compareTo('a') >= 0 && a[i].compareTo('z') <= 0) || (a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0))
			 {
				 continue;
			 }
			 else
			 {
				 return 0;
			 }
		}
		return 1;
	}
	public static void Main()
	{
		int n;
		int j;
		int k;
		String arr = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				arr = tempVar2.charAt(0);
			}
			k = check(arr);
			if (k == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
	}
}


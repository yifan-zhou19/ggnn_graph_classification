package <missing>;

public class GlobalMembers
{
	public static void p(String a, int n)
	{
		int i;
		int j;
		if (!a[0].equals('_') && (a[0].compareTo('a') < 0 || a[0].compareTo('z') > 0) && (a[0].compareTo('A') < 0 || a[0].compareTo('Z') > 0))
		{
			System.out.print("no\n");
		}
		else
		{
			for (j = 1;j < n;j++)
			{
				if (!a[j].equals('_') && (a[j].compareTo('a') < 0 || a[j].compareTo('z') > 0) && (a[j].compareTo('A') < 0 || a[j].compareTo('Z') > 0) && (a[j].compareTo('0') < 0 || a[j].compareTo('9') > 0))
				{
					System.out.print("no\n");
					break;
				}
			}
			if (j == n)
			{
				System.out.print("yes\n");
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int m;
		String a = new String(new char[30]);
		char b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = System.in.read();
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			m = a.length();
			p(a, m);
		}
	}





}


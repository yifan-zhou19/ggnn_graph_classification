package <missing>;

public class GlobalMembers
{
	/*???????er?ly?ing?????? ???????????er?ly?ing?
	 ?????????????????*/

	public static void doit(String a)
	{
		int n;
		n = a.length();
		if (a[n - 1].equals('r') && a[n - 2].equals('e'))
		{
			a[n - 1] = a[n - 2] = '\0';
		}
		if (a[n - 1].equals('y') && a[n - 2].equals('l'))
		{
			a[n - 1] = a[n - 2] = '\0';
		}
		if (a[n - 1].equals('g') && a[n - 2].equals('n') && a[n - 3].equals('i'))
		{
			a[n - 1] = a[n - 2] = a[n - 3] = '\0';
		}
	}

	public static void Main()
	{
		int i;
		int n;
		char[][] a = new char[50][10];
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
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			doit(a[i]);
			System.out.printf("%s\n",a[i]);
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int length = 0;
		char[][] a = new char[1000][42];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = tempVar2.charAt(0);
		}
		System.out.printf("%s", a[0]);
		length = String.valueOf(a[0]).length();
		for (i = 1; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = tempVar3.charAt(0);
			}
			length = length + String.valueOf(a[i]).length() + 1;
			if (length <= 80)
			{
				System.out.printf(" %s", a[i]);
			}
			else
			{
				System.out.print("\n");
				System.out.printf("%s", a[i]);
				length = String.valueOf(a[i]).length();
			}
		}
		return 0;
	}
}


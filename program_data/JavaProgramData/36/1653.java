package <missing>;

public class GlobalMembers
{
	public static char f(String a)
	{
		int i;
		int j;
		int k = a.length();
		char temp;
		for (j = 0;j < k;j++)
		{
			for (i = 0;i < k - j;i++)
			{
				if (a[i].compareTo(a[i - 1]) < 0)
				{
					temp = a[i];
					a[i] = a[i - 1];
					a[i - 1] = temp;
				}
			}
		}
		return'o';
	}
	public static int Main()
	{
		String a1 = new String(new char[1000]);
		String a2 = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a2 = tempVar2.charAt(0);
		}
		f(a1);
		f(a2);
		if (strcmp(a1,a2) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}

}


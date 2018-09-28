package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (int c = 1;c <= t;c++)
		{
		String a = new String(new char[100000]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		int l = a.length();
		int sum = l;
		int app = 0;
		for (int i = 0;i <= l - 1;i++)
		{
			for (int j = 0;j <= l - 1;j++)
			{
			if (a.charAt(i) == a.charAt(j))
			{
			app++;
			}
			}
			if (app == 1)
			{
					   System.out.printf("%c\n",a.charAt(i));
					   break;
			}
			app = 0;
			sum--;
		}
		if (sum == 0)
		{
		System.out.print("no\n");
		}
		}





	}
}


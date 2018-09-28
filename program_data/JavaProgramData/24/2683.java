package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		char[][] a = new char[200][25];
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
		int maxi = 0;
		int mini = 0;
		for (i = 1;i < n;i++)
		{
			if (String.valueOf(a[i]).length() > String.valueOf(a[maxi]).length())
			{
				maxi = i;
			}
			else if (String.valueOf(a[i]).length() < String.valueOf(a[mini]).length())
			{
				mini = i;
			}
		}
		System.out.printf("%s\n%s",a[maxi],a[mini]);
		return 0;
	}
}


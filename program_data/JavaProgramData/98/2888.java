package <missing>;

public class GlobalMembers
{
	//struct
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[400][40];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		int l = 80;
		int o;
		int s;
		int d;
		for (int i = 0;i < n - 1;i++)
		{
			s = String.valueOf(a[i]).length();
			d = String.valueOf(a[i + 1]).length();
			o = l - s - d - 1;
			if (o < 0)
			{
				if ((l - s) >= 0)
				{
				System.out.printf("%s\n",a[i]);
				}
				l = 80;
			}
			else
			{
				System.out.printf("%s ",a[i]);
				l = l - 1 - s;
			}
		}
			s = String.valueOf(a[n - 1]).length();
			l = l - s;
			if (l < 0)
			{
				System.out.print("\n");
				System.out.printf("%s",a[n - 1]);
			}
			else
			{
			System.out.printf("%s",a[n - 1]);
			}
	}

}


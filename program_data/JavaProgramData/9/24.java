package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		String tc = new String(new char[16]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct per
	//	{
	//		char id[16];
	//		int a;
	//	}
	//	a[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].a = tempVar3;
			}
		}
		for (int j = n - 1;j > 0;j--)
		{
			for (int r = 0;r < j;r++)
			{
				if (a[r].a > 59 && a[r + 1].a > 59 && a[r].a < a[r + 1].a)
				{

						tc = a[r + 1].id;
						a[r + 1].id = a[r].id;
						a[r].id = tc;
						t = a[r + 1].a;
						a[r + 1].a = a[r].a;
						a[r].a = t;
						r = 0;

				}
				if (a[r].a <= 59 && a[r + 1].a>59)
				{

						tc = a[r + 1].id;
						a[r + 1].id = a[r].id;
						a[r].id = tc;
						t = a[r + 1].a;
						a[r + 1].a = a[r].a;
						a[r].a = t;
						r = 0;
				}
			}
		}
		for (int f = 0;f < n;f++)
		{
			System.out.printf("%s\n",a[f].id);
		}
		return 0;
	}

}


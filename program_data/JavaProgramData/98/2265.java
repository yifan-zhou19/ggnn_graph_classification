package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct word
	//	{
	//		char w[41];
	//		int l;
	//	}
	//	a[1000];
		int n;
		int i;
		int temp = -1;
		int t;
		int p = 0;
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
				a[i].w = tempVar2;
			}
			a[i].l = String.valueOf(a[i].w).length() + 1;
		}
		do
		{
			temp = -1;
			for (i = p;i < n;i++)
			{
				temp += a[i].l;
				if (temp > 80)
				{
					t = i;
					break;
				}
			}
			if (temp > 80)
			{
				System.out.printf("%s",a[p].w);
				for (i = p + 1;i < t;i++)
				{
					System.out.printf(" %s",a[i].w);
				}
				p = t;
				System.out.print("\n");
			}
		}while (temp > 80);
		System.out.printf("%s",a[p].w);
		for (i = p + 1;i < n;i++)
		{
			System.out.printf(" %s",a[i].w);
		}
		System.out.print("\n");
		return 0;
	}
}


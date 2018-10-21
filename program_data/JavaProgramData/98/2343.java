package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct W
	//	{
	//		int l;
	//		char s[42];
	//	}
	//	w[520];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w[i].s = tempVar2;
			}
			w[i].l = 0;
			for (j = 0;w[i].s[j] != '\0';j++)
			{
				w[i].l++;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			m = m + w[i].l + 1;
			if (i == n - 1)
			{
				if (m <= 81)
				{
					System.out.printf("%s",w[i].s);
				}
				else
				{
					System.out.print("\n");
					System.out.printf("%s",w[i].s);
				}
			}
			else if ((m < 80) && (m + w[i + 1].l <= 80))
			{
				System.out.printf("%s ",w[i].s);
			}
			else if (m > 81)
			{
				System.out.print("\n");
				System.out.printf("%s ",w[i].s);
				m = w[i].l + 1;
			}
			else
			{
				System.out.printf("%s",w[i].s);
				System.out.print("\n");
				m = 0;
			}
		}
		return 0;
	}


}


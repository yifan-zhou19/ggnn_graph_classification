package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct word
	//	{
	//		char a[41];
	//		int l;
	//	};
		word[] w = tangible.Arrays.initializeWithDefaultwordInstances(10000);
		int n;
		int i;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w[i].a = tempVar2;
			}
			w[i].l = String.valueOf(w[i].a).length();
		}
		for (i = n; i == n; i++)
		{
			w[i].l = 0;
		}
		sum = 0;
		for (i = 0; i < n; i++)
		{
			sum += w[i].l + 1;
			if (sum + w[i + 1].l < 81)
			{
				if (i == n - 1)
				{
					System.out.printf("%s", w[i].a);
				}
				else
				{
					System.out.printf("%s ", w[i].a);
				}
			}
			else
			{
				if (i == n - 1)
				{
					System.out.printf("%s", w[i].a);
				}
				else
				{
					System.out.printf("%s\n", w[i].a);
					sum = 0;
				}
			}
		}
	}

}


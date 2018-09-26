package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char word[41];
	//		int lw;
	//	}
	//	a[10000];
		int lpr = 0;

		int n;
		int m;
		int i;
		int j;
		int k = 0;
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
				a[i].word = tempVar2;
			}
			a[i].lw = String.valueOf(a[i].word).length();
		}
		System.out.printf("%s",a[0].word);
		lpr = a[0].lw;
		for (i = 1;i < n;i++)
		{
				lpr += a[i].lw;
				if (lpr < 80)
				{
					System.out.printf(" %s",a[i].word);
					lpr++;
				}
				else
				{
					System.out.print("\n");
					System.out.printf("%s",a[i].word);
					lpr = a[i].lw;
				}
		}
		System.out.print("\n");
		return 0;
	}

}


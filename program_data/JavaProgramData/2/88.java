package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int bkn;
		int m = 1;
		int n;
		int i;
		int j;
		String bka = new String(new char[30]);

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct author
	//	{
	//		int num;
	//		int p[200];
	//	}
	//	a[30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 27;i++)
		{
			a[i].num = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bkn = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				bka = tempVar3.charAt(0);
			}
			for (j = 0;j < bka.length();j++)
			{
				a[bka.charAt(j) - 64].num++;
				a[bka.charAt(j) - 64].p[a[bka.charAt(j) - 64].num - 1] = bkn;
			}
		}
		for (i = 2;i < 27;i++)
		{
			if (a[i].num > a[m].num)
			{
				m = i;
			}
		}
		System.out.printf("%c\n%d\n",m + 64,a[m].num);
		for (i = 0;i < a[m].num;i++)
		{
			System.out.printf("%d\n",a[m].p[i]);
		}


		return 0;
	}

}


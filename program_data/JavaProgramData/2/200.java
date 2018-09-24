package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		char num[100],wri[26];
	//	}
	//	bo[1000];
		int i;
		int j;
		int k;
		int l;
		int n;
		int m = 0;
		int[] a = new int[26];
		int mw;
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
				bo[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bo[i].wri = tempVar3;
			}
			l = String.valueOf(bo[i].wri).length();
			for (j = 0;j < l;j++)
			{
				a[bo[i].wri[j] - 65]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] > m)
			{
			m = a[i];
			mw = 65 + i;
			}
		}
		System.out.printf("%c\n%d\n",mw,m);
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(bo[i].wri).length();
			for (j = 0;j < l;j++)
			{
				if (bo[i].wri[j] == mw)
				{
				System.out.println(bo[i].num);
				break;
				}
			}
		}
	}
}


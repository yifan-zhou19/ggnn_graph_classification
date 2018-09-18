package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Bookinfo
	//	{
	//		int number;
	//		char auther[27];
	//	};

		Bookinfo[] a = tangible.Arrays.initializeWithDefaultBookinfoInstances(1000);
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].number = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].auther = tempVar3;
			}
		}

		int[] count = new int[26];
		int max;
		int record;

		for (i = 0;i < m;i++)
		{
			int k;
			k = String.valueOf(a[i].auther).length();
			for (j = 0;j < k;j++)
			{
				count[a[i].auther[j] - 'A']++;
			}
		}

		max = count[0];
		for (i = 0;i < 26;i++)
		{
			if (count[i] >= max)
			{
				max = count[i];
				record = i;
			}
		}

		System.out.printf("%c\n%d\n",record + 'A',max);

		for (i = 0;i < m;i++)
		{
			int n;
			n = String.valueOf(a[i].auther).length();
			for (j = 0;j < n;j++)
			{
				if (a[i].auther[j] == record + 'A')
				{
					System.out.printf("%d\n",a[i].number);
					break;
				}
			}
		}
	}

}


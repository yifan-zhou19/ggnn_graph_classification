package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct author
	//	{
	//		char nm;
	//		int bk[999];
	//		int count;
	//	};
		author[] a = tangible.Arrays.initializeWithDefaultauthorInstances(26);
		author max = new author();
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		char at[26];
	//		int no;
	//	};
		book b = new book();
		int i;
		int j;
		int n;
		int m;
		int k;
		int flag;
		for (i = 0;i < 26;i++)
		{
			a[i].count = 0;
			a[i].nm = 65 + i;
		}
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
				b.no = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b.at = tempVar3;
			}
			m = b.at.length();
			flag = 0;
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (b.at[j] == a[k].nm)
					{
						a[k].bk[a[k].count] = b.no;
						a[k].count++;
						flag++;
						break;
					}
				}
				if (flag == m)
				{
					break;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max=a[0];
		max.copyFrom(a[0]);
		for (i = 1;i < 26;i++)
		{
			if (a[i].count > max.count)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: max=a[i];
				max.copyFrom(a[i]);
			}
		}
		System.out.printf("%c\n%d\n",max.nm,max.count);
		for (i = 0;i < max.count;i++)
		{
			System.out.printf("%d\n",max.bk[i]);
		}
		return 0;
	}

}


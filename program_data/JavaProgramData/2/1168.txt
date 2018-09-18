package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int[] a = new int[26];
		int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int no;
	//		char w[26];
	//	}
	//	s[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].no = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].w = tempVar3;
			}
			for (j = 0;j < String.valueOf(s[i].w).length();j++)
			{
				a[s[i].w[j] - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
		if (a[i] > a[max])
		{
				max = i;
		}
		}
		System.out.printf("%c\n%d\n",max + 'A',a[max]);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(s[i].w).length();j++)
			{
				if (s[i].w[j] == max + 'A')
				{
					System.out.printf("%d\n",s[i].no);
				}
			}
		}

	}

}


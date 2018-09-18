package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct b
	//	{
	//		int num;
	//		char str[27];
	//	}
	//	b[100];
		int n;
		int i;
		int m;
		int j;
		int max;
		int nmax;
		int[] a = new int[26];
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
				b[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i].str = tempVar3;
			}
			m = String.valueOf(b[i].str).length();
			for (j = 0;j < m;j++)
			{
				a[b[i].str[j] - 65]++;
			}
		}
		max = a[0];
		nmax = 0;
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				nmax = i;
			}
		}
		System.out.printf("%c\n%d\n",nmax + 65,max);
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(b[i].str).length();
			for (j = 0;j < m;j++)
			{
				if (b[i].str[j] == nmax + 65)
				{
					System.out.printf("%d\n",b[i].num);
				}
			}
		}
	}
}


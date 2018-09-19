package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct book
	//{
	//	int No;
	//	char name[27];
	//}
	//b[1000];
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i].No = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i].name = tempVar3;
			}
		}
		int n;
		int l;
		int[] a = new int[26];
		for (i = 0;i < m;i++)
		{
			l = String.valueOf(b[i].name).length();
			for (j = 0;j < l;j++)
			{
				n = b[i].name[j];
				a[n - 65]++;
			}
		}
		int max = 0;
		int x;
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				x = i;
			}
		}
		System.out.printf("%c\n%d",x + 65,max);
		for (i = 0;i < m;i++)
		{
			l = String.valueOf(b[i].name).length();
			for (j = 0;j < l;j++)
			{
				if (b[i].name[j] == x + 65)
				{
					System.out.printf("\n%d",b[i].No);
					break;
				}
			}
		}
		return 0;
	}

}


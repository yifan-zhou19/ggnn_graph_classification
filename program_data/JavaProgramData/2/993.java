package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char author[27];
	//	}
	//	B[1000];
		char A;
		int m;
		int i;
		int j;
		int[] a = new int[26];
		int max;
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
				B[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				B[i].author = tempVar3;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;;j++)
			{
				if (B[i].author[j] == 0)
				{
					break;
				}
				else
				{
					a[B[i].author[j] - 65]++;
				}
			}
		}
		max = a[0];
		A = 65;
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				A = i + 65;
			}
		}
		System.out.printf("%c\n%d",A,max);
		for (i = 0;i < m;i++)
		{
			for (j = 0;;j++)
			{
				if (B[i].author[j] == 0)
				{
					break;
				}
				if (B[i].author[j] == A)
				{
					System.out.printf("\n%d",B[i].num);
				}
			}
		}
	}
}


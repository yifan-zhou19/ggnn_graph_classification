package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char w[27];
	//	};
		book[] b = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		int n;
		int i;
		int j;
		int k;
		int[] c = new int[26];
		int max;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i].w = tempVar3;
			}
		}
		for (i = 'A';i <= 'Z';i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < String.valueOf(b[j].w).length();k++)
				{
					if (i == b[j].w[k])
					{
						c[i - 65]++;
					}
				}
			}
		}
		max = 0;
		for (i = 1;i < 26;i++)
		{
			if (c[i] > c[max])
			{
				max = i;
			}
		}
		System.out.printf("%c\n",max + 65);
		System.out.printf("%d\n",c[max]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(b[i].w).length();j++)
			{
				if (b[i].w[j] == max + 65)
				{
					System.out.printf("%d\n",b[i].num);
					break;
				}
			}
		}
	}




}


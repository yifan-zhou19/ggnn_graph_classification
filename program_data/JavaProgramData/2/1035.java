package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int a;
	//		char b[26];
	//	}
	//	num[999];
		int i;
		int m;
		int j;
		int k;
		int[] s = new int[26];

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
				num[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i].b = tempVar3;
			}
		}
		for (k = 0;k < 26;k++)
		{
			s[k] = 0;
		}


		for (i = 0;i < m;i++)
		{
			for (j = 0;num[i].b[j] != '\0';j++)
			{
				k = num[i].b[j] - 'A';
				s[k]++;
			}
		}
		int first = s[0];
		int t;
		for (k = 0;k < 26;k++)
		{
			if (s[k] > first)
			{
				first = s[k];
				t = k;
			}
		}
		System.out.printf("%c\n",t + 'A');
		System.out.printf("%d\n",first);
		for (i = 0;i < m;i++)
		{
			for (j = 0;num[i].b[j] != '\0';j++)
			{
				if (num[i].b[j] == (t + 'A'))
				{
					System.out.printf("%d\n",num[i].a);
				}
			}
		}
	}

}


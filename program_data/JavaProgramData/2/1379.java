package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		int[] m = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char b[26];
	//	}
	//	p[1000];
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int[] num = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].b = tempVar3;
			}
			m[i] = String.valueOf(p[i].b).length();
			for (k = 0;k < 26;k++)
			{
				for (j = 0;j < m[i];j++)
				{
					if (p[i].b[j] == c[k])
					{
						num[k]++;
					}
				}
			}

		}
		int max = 0;
		int local = 0;
		for (k = 0;k < 26;k++)
		{
			if (num[k] > max)
			{
				max = num[k];
				local = k;
			}
		}
		System.out.printf("%c\n",c[local]);
		System.out.printf("%d\n",max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m[i];j++)
			{
				if (p[i].b[j] == c[local])
				{
				System.out.printf("%d\n",a[i]);
				}
			}
		}

		return 0;
	}
}


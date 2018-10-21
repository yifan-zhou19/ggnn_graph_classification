package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		   char z[27];
	//		   int no;
	//		   };

			   book[] a = tangible.Arrays.initializeWithDefaultbookInstances(1000);

		int m;
		int i;
		int x;
		int p;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (i = 0; i < m; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].no = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].z = tempVar3;
			}
		}

		int[] memo = new int[26];

		for (i = 0; i < m; i++)
		{
			for (j = 0; j < 26; j++)
			{
				if (a[i].z[j] == '\0')
				{
				break;
				}
				x = (a[i].z[j]) - 65;
				memo[x]++;
			}
		}
			x = 0;
			p = 0;
		for (i = 0; i < 26; i++)
		{

			if (memo[i] > x)
			{
				x = memo[i];
						   p = i;
			}
		}

		 System.out.printf("%c\n", p + 65);

		 int n = 0;

		 for (i = 0; i < m; i++)
		 {
			for (j = 0; j < 26; j++)
			{
				if (a[i].z[j] == '\0')
				{
				break;
				}
				if (a[i].z[j] == p + 65)
				{
				n++;
				}
			}
		 }

		 System.out.printf("%d\n", n);

		 for (i = 0; i < m; i++)
		 {
			for (j = 0; j < 26; j++)
			{
				if (a[i].z[j] == '\0')
				{
				break;
				}
				if (a[i].z[j] == p + 65)
				{
				System.out.printf("%d\n", a[i].no);
				break;
				}
			}
		 }


		return 0;

	}

}


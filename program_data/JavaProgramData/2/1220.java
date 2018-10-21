package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int NO;
	//		char AUT[27];
	//	}
	//	book[999];
		int i;
		int j;
		int k;
		int m;
		int n;
		int d;
		int max;
		int[] a = new int[26];
		int[][] b = new int[26][999];
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
				book[i].NO = tempVar2;
			}
			book[i].AUT = new Scanner(System.in).nextLine();
			for (j = 0;book[i].AUT[j] != '\0';j++)
			{
				d = book[i].AUT[j] - 65;
				b[d][a[d]] = book[i].NO;
				a[d] = a[d] + 1;
			}
		}
		max = 0;
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				k = i;
			}
		}
		System.out.printf("%c\n%d\n",k + 65,max);
		for (i = 0;i < a[k] - 1;i++)
		{
			System.out.printf("%d\n",b[k][i]);
		}
		System.out.printf("%d",b[k][a[k] - 1]);
	}
}


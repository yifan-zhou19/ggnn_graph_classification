package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct x
	//	{
	//		int num;
	//	char name[26];
	//	}
	//	book[1000];
		int i;
		int j;
		int m;
		int n;
		int k;
		int ex;
		int[][] a = new int[26][1000];
		int[] count = new int[26];
		int[] num = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
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
				book[i].num = tempVar2;
			}
			book[i].name = new Scanner(System.in).nextLine();
		}
		for (i = 'A';i <= 'Z';i++)
		{
			for (j = 0;j < m;j++)
			{
				n = String.valueOf(book[j].name).length();
				for (k = 0;k < n;k++)
				{
					if (i == book[j].name[k])
					{
						count[i - 65]++;
					}
				}
			}
		}
		for (i = 0;i < 25;i++)
		{
			if (count[i] > count[i + 1])
			{
				ex = count[i];
				count[i] = count[i + 1];
				count[i + 1] = ex;
				ex = num[i];
				num[i] = num[i + 1];
				num[i + 1] = ex;
			}
		}
		System.out.printf("%c\n%d\n",num[25],count[25]);
		for (i = 0;i < m;i++)
		{
			n = String.valueOf(book[i].name).length();
			for (k = 0;k < n;k++)
			{
				if (book[i].name[k] == num[25])
				{
					System.out.printf("%d\n",book[i].num);
				}
			}
		}
		return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char str[30];
	//	}
	//	bk[1000]={0};
		int i;
		int j;
		int m;
		int n;
		int[] sum = new int[100];
		int[] number = new int[1000];
		int result;
		int max = 0;
		char temp = 'A';
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
				bk[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bk[i].str = tempVar3;
			}
		}
		for (i = 65;i <= 90;i++)
		{
			for (j = 0;j < m;j++)
			{
				for (n = 0;n < 26;n++)
				{
					if (bk[j].str[n] == i)
					{
						sum[i]++;
					}
				}
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (sum[j + 65] > max)
			{
				max = sum[j + 65];
				temp = j + 65;
				result = j + 65;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (n = 0;n < 30;n++)
			{
				if (bk[i].str[n] == temp)
				{
					number[i] = bk[i].num;
					break;
				}
			}
		}
		System.out.printf("%c\n%d\n",temp,sum[result]);
		for (i = 0;i < m;i++)
		{
			if (number[i] != 0)
			{
				System.out.printf("%d\n",number[i]);
			}
		}
	}






}


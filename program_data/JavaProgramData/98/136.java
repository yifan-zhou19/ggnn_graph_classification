package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct word
	//	{
	//		char a[100];
	//		int line;
	//		int num;
	//		int flag;
	//	}
	//	word1[1000]={0};
		int i;
		int j;
		int n;
		int k;
		int sum = 0;
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
				word1[i].a = tempVar2;
			}
		}
		for (j = 0;j < n;j++)
		{
			sum += (1 + String.valueOf(word1[j].a).length());
			(word1[j].num)++;
			if (sum > 81)
			{
				sum = String.valueOf(word1[j].a).length() + 1;
				word1[j].num = 0;
				(word1[j].line)++;
				word1[j - 1].flag = 1;
			}
		}

		for (k = 0;k < n - 1;k++)
		{
			if (word1[k].flag == 0)
			{
				System.out.printf("%s ",word1[k].a);
			}
			if (word1[k].flag == 1)
			{
				System.out.printf("%s\n",word1[k].a);
			}
		}
	System.out.printf("%s\n",word1[n - 1].a);
	}
}


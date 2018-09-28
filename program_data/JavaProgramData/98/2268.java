package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct word
	//	{
	//		int num;
	//		char words[46];
	//	}
	//	word[1000];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int m;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i].words = tempVar2;
			}
			for (j = 0;word[i].words[j] != '\0';j++)
			{
			}
			word[i].num = j;
		}
		j = 0;
		m = 0;

		int max = 80;
		int length = word[0].num + 1;
			 System.out.printf("%s",word[0].words);
		for (i = 1;i < n;i++)
		{

			if (word[i].num <= max - length)
			{
				System.out.printf(" %s",word[i].words);
				length = length + word[i].num + 1;
			}
			else if (word[i].num > max - length)
			{
				System.out.printf("\n%s",word[i].words);
				length = word[i].num + 1;
			}
		}
	}
}


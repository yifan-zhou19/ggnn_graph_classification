package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct W
	//	{
	//		char word[100];
	//		int len;
	//	}
	//	w[520];
		int i;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 0;
		for (i = 0;i < n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w[i].word = tempVar2;
			}
			w[i].len = 0;
			for (j = 0;w[i].word[j] != '\0';j++)
			{
				w[i].len++;
			}

		}
		for (i = 0;i < n;i++)
		{
			m = m + w[i].len + 1;
			if (i == n - 1)
			{
				if (m <= 81)
				{
					System.out.printf("%s",w[i].word);
				}
				else
				{
					System.out.print("\n");
					System.out.printf("%s",w[i].word);
				}
			}
		else if (m < 80 && m + w[i + 1].len < 81)
		{
			System.out.printf("%s ",w[i].word);
		}
		else if (m > 81)
		{
				System.out.print("\n");
				System.out.printf("%s ",w[i].word);
				m = w[i].len + 1;
		}
		else
		{
			System.out.printf("%s\n",w[i].word);
			m = 0;
		}
		}
		return 0;
	}


}


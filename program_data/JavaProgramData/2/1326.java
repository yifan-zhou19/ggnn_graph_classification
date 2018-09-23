package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] book_number = new int[26];
		int max = 0;
		int max_n;
		int author_len;


//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct data
	//	{
	//		   int number;
	//		   char author[27];
	//	};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		data[] input = tangible.Arrays.initializeWithDefaultdataInstances(n);


		for (j = 0; j <= 25; j++)
		{
			  book_number[j] = 0;
		}

		for (i = 0; i <= n - 1; i++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  input[i].number = tempVar2;
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  input[i].author = tempVar3;
			  }
			  author_len = String.valueOf(input[i].author).length();

			  for (j = 0; j <= author_len - 1; j++)
			  {
					book_number[input[i].author[j] - 'A']++;
			  }


		}

		for (j = 0; j <= 25; j++)
		{
			  if (book_number[j] > max)
			  {
								max = book_number[j];
								max_n = j;
			  }
		}

		System.out.printf("%c\n%d\n", max_n + 'A', max);

		for (i = 0; i <= n - 1; i++)
		{
			  author_len = String.valueOf(input[i].author).length();

			  for (j = 0; j <= author_len - 1; j++)
			  {
					if (input[i].author[j] == max_n + 'A')
					{
										  System.out.printf("%d\n", input[i].number);
										  break;
					}
			  }
		}

		input = null;


		return 0;
	}



}


package <missing>;

public class GlobalMembers
{
	public static void sword()
	{
		String fib = new String(new char[10000]);
		fib = new Scanner(System.in).nextLine();

		char haha = 'a';

		int length;
		length = fib.length();

		int[] counter = new int[26];
		int[] loc = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		int i;
		char j;


		for (j = 0;j < 26;j++)
		{
						  counter[j] = 0;
		for (i = 0;i < length;i++)
		{
						if (fib.charAt(i) == 97 + j)
						{
						if (loc[j] == 0)
						{
						loc[j] = i + 1;
						(counter[j])++;
						}
						else
						{
						(counter[j])++;
						}
						}
		}
		}

		int min = length;
		for (j = 0;j < 26;j++)
		{
						  if (loc[j] < min && loc[j] != 0 && counter[j] == 1)
						  {
						  min = loc[j];
						  }
		}


		int miao = 0;
		for (j = 0;j < 26;j++)
		{
						  if (counter[j] == 1 && loc[j] == min)
						  {
						  System.out.printf("%c\n",haha + j);
						  miao++;
						  }



		}

		if (miao == 0)
		{
		System.out.print("no\n");
		}



	}
	public static int Main()
	{
		int love;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			love = Integer.parseInt(tempVar);
		}

		int t;
		for (t = 0;t < love;t++)
		{
							sword();
		}
							return 0;

	}






}


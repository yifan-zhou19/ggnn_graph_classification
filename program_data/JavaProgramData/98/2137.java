package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] words = new char[500][40];
		int n;
		int i;
		int j;
		int[] numwords = new int[500];
		int num = 0;
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
				  words[i] = tempVar2.charAt(0);
			  }
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;words[i][j] != '\0';j++)
			{
				 numwords[i]++;
			}

		}

		for (i = 0;i < n - 1;i++)
		{
			if ((numwords[i] + num) > 80)
			{
				System.out.print("\n");
				System.out.printf("%s ",words[i]);
				num = numwords[i] + 1;
			}
			 else if ((numwords[i + 1] + num + numwords[i] + 1) > 80)
			 {
				 System.out.printf("%s",words[i]);
				 num = num + numwords[i] + 1;
			 }
			else
			{
				System.out.printf("%s ",words[i]);
				 num = num + numwords[i] + 1;
			}
		}
			System.out.printf("%s",words[n - 1]);

	}


}


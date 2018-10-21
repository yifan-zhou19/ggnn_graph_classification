package <missing>;

public class GlobalMembers
{
	public static int Main(String[] args)
	{
		int[] ary = new int[100];
		char comma;
		int i;
		int j;
		int k;
		int max;
		int sec;
		int count;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ary[0] = Integer.parseInt(tempVar);
		}
		i = 1;
		while (scanf("%c", comma) != EOF)
		{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   ary[i] = Integer.parseInt(tempVar2);
			   }
			   i++;
		}
		count = i - 1;
		max = ary[0];
		sec = -1;
		for (j = 0; j < count ;j++)
		{
				 if (ary[j] > max)
				 {
						  sec = max;
						  max = ary[j];
				 }
				 else if (ary[j] == max)
				 {
					  max = ary[j];
				 }
				 else if (ary[j] > sec)
				 {
					  sec = ary[j];
				 }

		}
		if (sec != -1)
		{

			   System.out.print(sec);
		}
		else
		{
			 System.out.print("No");
		}


		return EXIT_SUCCESS;
	}

}


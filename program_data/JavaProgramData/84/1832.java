package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int first;
		int second;
		int tmp;
		int n;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		first = -10000;
		second = -100000;
			do
			{
				i++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tmp = Integer.parseInt(tempVar2);
			}
			 if (tmp > first)
			 {
				 second = first;
			 first = tmp;
			 }
			   else if (tmp > second)
			   {
				 second = tmp;
			   }
			}while (i != n);





	System.out.printf("%d\n%d",first,second);
	return 0;
	}
}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int min = new int(int n,int k);

		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}

		System.out.printf("%d",min(n, k));
	}
	public static int min(int n, int k)
	{
		int i;
		int number = n + k;
		int c = 1;
		int j;
		  for (i = 0;number % (n - 1) != 0;i++)
		  {
				c = c + 1;
				number = n * c + k;
		  }
	   for (i = n - 1;i > 0;i--)

	   {
				  number = number / (n - 1) + number + k;
				  if (i == 1)
				  {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					  goto stop;
				  }
				  if (number % (n - 1) != 0)
				  {
					  for (j = 0;number % (n - 1) != 0;j++)
					  {
					  c = c + 1;
					  number = n * c + k;
					  }
					  i = n;
				  }

	   }




//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	stop:
	return number;
	}


}


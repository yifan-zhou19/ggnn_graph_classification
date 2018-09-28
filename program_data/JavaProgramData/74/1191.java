package <missing>;

public class GlobalMembers
{
	public static int change(int num)
	{
		int answer = 0;
		while (num != 0)
		{
				  answer = answer * 10 + num % 10;
				  num = num / 10;
		}
		return answer;
	}
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int a = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
		  for (i = m;i <= n;i++)
		  {
						   for (j = 2;j < i;j++)
						   {
										   if (i % j == 0)
										   {
										   break;
										   }
						   }
							  if (j == i)
							  {
								 if (i == change(i))
								 {
												 a = a + 1;
												 if (a == 1)
												 {
												 System.out.printf("%d",i);
												 }
												 else
												 {
												 System.out.printf(",%d",i);
												 }
								 }
							  }
		  }
		  if (a == 0)
		  {
		  System.out.print("no\n");
		  }
		  System.in.read();
		  System.in.read();

	}

}


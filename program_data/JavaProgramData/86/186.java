package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int miss;
	  int misspointer;
	  int second = 0;
	  int time = 0;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (int i = 0; i < n; i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  miss = Integer.parseInt(tempVar2);
		  }
		  if (miss == 0)
		  {
			 System.out.print("60\n");
			 continue;
		  }
		  int j = 0;
		  do
		  {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				misspointer = Integer.parseInt(tempVar3);
			}
			if ((second < 60) && (misspointer < 60))
			{
			  second = misspointer + time * 3;
			 // printf("%d\n", second);
			  if ((second + 2) < 60)
			  {
				time++;
			  }
			}
			j++;
		  }while (j < miss);
		  if ((second < 60) && ((second + 2)>60))
		  {
			  second -= time * 3;
		  }
		  else
		  {
			second = 60 - time * 3;
		  }
		  System.out.printf("%d\n", second);
		  second = 0;
		  time = 0;
		//  printf("************************\n");
	  }
	}

}


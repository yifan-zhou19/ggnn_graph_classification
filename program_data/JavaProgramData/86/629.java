package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[] total = new int[100];
		  int broke;
		  int time;
		  int i;
		  int j;
		  int[] broke_time = new int[61];
		  int timer;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0; i <= n - 1; i++)
		  {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					broke = Integer.parseInt(tempVar2);
				}

				for (j = 1;j <= broke;j++)
				{
					  String tempVar3 = ConsoleInput.scanfRead();
					  if (tempVar3 != null)
					  {
						  timer = Integer.parseInt(tempVar3);
					  }
					  broke_time[timer] = 1;
				}

				for (time = 1;time <= 60; time++)
				{
						 total[i]++;
						 if (broke_time[total[i]] == 1)
						 {
											 //printf("(%d)", time);
											 time += 3;

											 //printf("|%d|[%d]\n", total[i], time);
						 }
						 if (time > 60)
						 {
							 break;
						 }

				}


				for (j = 0;j <= 60;j++)
				{
					  broke_time[j] = 0;
				}


		  }

		  for (i = 0;i <= n - 1; i++)
		  {
				System.out.printf("%d\n", total[i]);
		  }
	}


}


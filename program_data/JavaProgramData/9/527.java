package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  char[][] senior = new char[100][10];
		  char[][] junior = new char[100][10];
		  String temp = new String(new char[10]);
		  int[] list = new int[100];
		  int[] se = new int[100];
		  int[] ju = new int[100];
		  int n;
		  int i;
		  int j;
		  int k;
		  int nums;
		  int numj;
		  int year;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  nums = -1;
		  numj = -1;
		  for (i = 1;i <= n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  temp = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  year = Integer.parseInt(tempVar3);
			  }
			  if (year >= 60)
			  {
				  nums++;
				  senior[nums] = temp;
				  se[nums] = year;
				  list[nums] = nums;
			  }
			  else
			  {
				  numj++;
				  junior[numj] = temp;
				  ju[numj] = year;
			  }
		  }
		  for (i = 0;i < nums;i++)
		  {
			  for (j = i + 1;j <= nums;j++)
			  {
				  if ((se[i] < se[j]))
				  {
					  year = se[i];
					  se[i] = se[j];
					  se[j] = year;
					  year = list[i];
					  list[i] = list[j];
					  list[j] = year;
					  temp = senior[i];
					  senior[i] = senior[j];
					  senior[j] = temp;
				  }
				  else if (se[i] == se[j] && list[i] > list[j])
				  {
					  year = se[i];
					  se[i] = se[j];
					  se[j] = year;
					  year = list[i];
					  list[i] = list[j];
					  list[j] = year;
					  temp = senior[i];
					  senior[i] = senior[j];
					  senior[j] = temp;
				  }
			  }
		  }
	//      for (i=0;i<numj;i++)
	//          for (j=i+1;j<=numj;j++)
	//              if (strcmp(junior[i],junior[j])>0)
	//              {
	//                  year= ju[i]; ju[i]=ju[j]; ju[j]=year;
	//                  strcpy(temp,junior[i]);
	//                  strcpy(junior[i],junior[j]);
	//                  strcpy(junior[j],temp);
	//              }
		  for (i = 0;i <= nums;i++)
		  {
			  //printf("%d ",list[i]);
			  System.out.println(senior[i]);
		  }
		  for (i = 0;i <= numj;i++)
		  {
			  System.out.println(junior[i]);
		  }
		  return 0;
	}

}


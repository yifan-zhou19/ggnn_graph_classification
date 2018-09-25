package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int x;
		  float t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct person
	//	  {
	//			 char sex[6];
	//			float h;
	//	  };
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  person[] per = tangible.Arrays.initializeWithDefaultpersonInstances(40);
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  per[i].sex = tempVar2;
						  }
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  per[i].h = tempVar3;
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  if (strcmp(per[i].sex,"female") == 0)
			  {
		  continue;
			  }
						  for (j = i + 1;j < n;j++)
						  {
							 if (strcmp(per[j].sex,"female") == 0)
							 {
							 continue;
							 }
							 if (per[i].h > per[j].h)
							 {
										 t = per[i].h;
										 per[i].h = per[j].h;
										 per[j].h = t;
							 }
						  }
						  System.out.printf("%.2f ",per[i].h);
		  }
		  x = 0;
		  for (i = 0;i < n;i++)
		  {
			  if (strcmp(per[i].sex,"male") == 0)
			  {
		  continue;
			  }
						  for (j = i + 1;j < n;j++)
						  {
							 if (strcmp(per[j].sex,"male") == 0)
							 {
							 continue;
							 }
							 if (per[i].h < per[j].h)
							 {
										 t = per[i].h;
										 per[i].h = per[j].h;
										 per[j].h = t;
							 }
						  }
						  if (x == 0)
						  {
							  System.out.printf("%.2f",per[i].h);
						  x = 1;
						  }
						  else
						  {
							  System.out.printf(" %.2f",per[i].h);
						  }
		  }
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int m;
		  int f;
		  m = 0;
		  f = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct student
	//	  {
	//			 char sex[6];
	//			 float tall;
	//	  };
		  student[] std1 = tangible.Arrays.initializeWithDefaultstudentInstances(40);
		  student[] std2 = tangible.Arrays.initializeWithDefaultstudentInstances(40);
		  student[] std3 = tangible.Arrays.initializeWithDefaultstudentInstances(40);
		  for (int i = 0;i < n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  std1[i].sex = tempVar2;
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  std1[i].tall = tempVar3;
				  }
				  if (strcmp(std1[i].sex,"male") == 0)
				  {
						   std2[m] = std1[i];
						   m = m + 1;
				  }
				  else
				  {
						   std3[f] = std1[i];
						   f = f + 1;
				  }
		  }
		  for (int p = m - 1;p > 0;p--)
		  {
				  for (int q = 0;q < p;q++)
				  {
						  if (std2[q].tall > std2[q + 1].tall)
						  {
									 float t;
									 t = std2[q].tall;
									 std2[q].tall = std2[q + 1].tall;
									 std2[q + 1].tall = t;
						  }
				  }

		  }
		  for (int p = f - 1;p > 0;p--)
		  {
				  for (int q = 0;q < p;q++)
				  {
						  if (std3[q].tall < std3[q + 1].tall)
						  {
									 float t;
									 t = std3[q].tall;
									 std3[q].tall = std3[q + 1].tall;
									 std3[q + 1].tall = t;
						  }
				  }
		  }
		  for (int z = 0;z < m;z++)
		  {
				  if (z == 0)
				  {
				  System.out.printf("%.2f",std2[z].tall);
				  }
				  else
				  {
					  System.out.printf(" %.2f",std2[z].tall);
				  }
		  }
		  for (int z = 0;z < f;z++)
		  {
				  System.out.printf(" %.2f",std3[z].tall);
		  }

	}

}


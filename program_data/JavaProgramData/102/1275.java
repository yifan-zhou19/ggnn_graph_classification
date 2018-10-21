package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m = 0;
	  int x = 0;
	  int y = 0;
	  int q;
	  int s;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct person
	//  {
	//	char sex[7];
	//	float height;
	//  };
	  person[] people = tangible.Arrays.initializeWithDefaultpersonInstances(n);

	  for (int i = 0;i <= n - 1;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			people[i].sex = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			people[i].height = tempVar3;
		}
	  }
	  for (int j = 0;j <= n - 1;j++)
	  {
		if (people[j].sex[0] == 'm')
		{
		m++;
		}
	  }
	  person[] male = tangible.Arrays.initializeWithDefaultpersonInstances(m);
	  person[] female = tangible.Arrays.initializeWithDefaultpersonInstances(n - m);
	  person b = new person();
	  for (int k = 0;k <= n - 1;k++)
	  {
		if (people[k].sex[0] == 'm')
		{
		  male[x] = people[k];
		  x++;
		}
		else
		{
		  female[y] = people[k];
		  y++;
		}
	  }
	  for (int p = 0;p <= m - 2;p++)
	  {
		 for (q = 0;q <= m - 2 - p;q++)
		 {
		   if (male[q + 1].height < male[q].height)
		   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: b=male[q+1];
			 b.copyFrom(male[q + 1]);
			 male[q + 1] = male[q];
			 male[q] = b;
		   }
		 }
	  }
	  for (int r = 0;r <= y - 2;r++)
	  {
		 for (s = 0;s <= y - 2 - r;s++)
		 {
		   if (female[s + 1].height > female[s].height)
		   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: b=female[s+1];
			 b.copyFrom(female[s + 1]);
			 female[s + 1] = female[s];
			 female[s] = b;
		   }
		 }
	  }
	  for (int t = 0;t <= m - 1;t++)
	  {
		System.out.printf("%.2f ",male[t].height);
	  }
	  for (int u = 0;u <= y - 2;u++)
	  {
		System.out.printf("%.2f ",female[u].height);
	  }
	  System.out.printf("%.2f",female[y - 1].height);
	}

}


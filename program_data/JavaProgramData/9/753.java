package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct pa
	//  {
	//	  char m[10];
	//  int a;
	//  };
	  pa[] p = tangible.Arrays.initializeWithDefaultpaInstances(100);
	  pa t = new pa();
	  pa s = new pa("0",0);
	  pa[] pp = tangible.Arrays.initializeWithDefaultpaInstances(100);
	  int n;
	  int i;
	  int j = 0;
	  int m = 0;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p[i].m = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  p[i].a = tempVar3;
		  }
	  }
		for (i = 0;i < n;i++)
		{
		  if (p[i].a >= 60)
		  {
			  m++;
		  }
		}
	for (j = 0;j < m;j++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=s;
		t.copyFrom(s);
		k = 100;
		for (i = 0;i < n;i++)
		{
			if (p[i].a >= 60 && p[i].a > t.a)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=p[i];
				t.copyFrom(p[i]);
				k = i;
			}
		}
				pp[j] = t;
				p[k] = s;
	}


	for (i = 0;i < n;i++)
	{
	if (p[i].a < 60 && p[i].a>0)
	{
		pp[j] = p[i];
		j++;
	}
	}

	for (i = 0;i < n;i++)
	{
	System.out.printf("%s\n",pp[i].m);
	}


	}
}


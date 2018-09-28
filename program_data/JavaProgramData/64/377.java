public class point1
{
  public int x;
  public int y;
  public int z;
}

public class comb1
{
  public point1 po1 = new point1();
  public point1 po2 = new point1();
  public double distant;
}

package <missing>;

public class GlobalMembers
{
	public static point1[] point = tangible.Arrays.initializeWithDefaultpoint1Instances(10);
	public static comb1[] comb = tangible.Arrays.initializeWithDefaultcomb1Instances(50);
	public static comb1 t = new comb1();
	public static int abs(int a)
	{
	  if (a >= 0)
	  {
		  return a;
	  }
	  else
	  {
		  return (-a);
	  }
	}
	public static double dis(point1 a, point1 b)
	{
	   int p;
	   int q;
	   int r;
	   double ans;
	   p = (a.x - b.x) * (a.x - b.x);
	   q = (a.y - b.y) * (a.y - b.y);
	   r = (a.z - b.z) * (a.z - b.z);
	   ans = Math.sqrt(p + q + r);
	   return ans;
	}

	public static int Main()
	{
	  int n;
	  int i;
	  int j;
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
		   point[i].x = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   point[i].y = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   point[i].z = Integer.parseInt(tempVar4);
	   }
	  }
	  k = 0;
	  for (i = 0;i < n;i++)
	  {
	   for (j = i + 1;j < n;j++)
	   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: comb[k].po1=point[i];
		  comb[k].po1.copyFrom(point[i]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: comb[k].po2=point[j];
		  comb[k].po2.copyFrom(point[j]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: comb[k].distant=dis(comb[k].po1,comb[k].po2);
		  comb[k].distant = dis(new point1(comb[k].po1), new point1(comb[k].po2));
		  k++;
	   }
	  }
	  for (i = 1;i < k;i++)
	  {
	   for (j = 0;j < k - i;j++)
	   {
		if (comb[j].distant < comb[j + 1].distant)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=comb[j];
		  t.copyFrom(comb[j]);
		  comb[j] = comb[j + 1];
		  comb[j + 1] = t;
		}
	   }
	  }
	  for (i = 0;i < k;i++)
	  {
	   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",comb[i].po1.x,comb[i].po1.y,comb[i].po1.z,comb[i].po2.x,comb[i].po2.y,comb[i].po2.z,comb[i].distant);
	  }
	  //scanf("%d",&i);
	  return 0;
	}
}


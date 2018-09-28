package <missing>;

public class GlobalMembers
{
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
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct p
	//  {
	//		 char num[100];
	//		 int age;
	//		 }
	//		 pa[100],p[100],t;
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  pa[i].num = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  pa[i].age = tempVar3;
		  }
	  }
	  i = n - 1;
	  for (j = n - 1;j >= 0;j--)
	  {
	   if (pa[j].age < 60)
	   {
			p[i] = pa[j];
		i--;
	   }
	  }
	  k = i + 1;
	  for (j = n - 1;j >= 0;j--)
	  {
	   if (pa[j].age >= 60)
	   {
			p[i] = pa[j];
		i--;
	   }
	  }
	  for (j = 0;j < k;j++)
	  {
		  for (i = 0;i < k - j - 1;i++)
		  {
		   if (p[i].age < p[i + 1].age)
		   {
			t = p[i];
		 p[i] = p[i + 1];
		 p[i + 1] = t;
		   }
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  System.out.printf("%s\n", p[i].num);
	  }
	return 0;

	}

}


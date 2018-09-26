package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct people
	// {
	//  char id[30];
	//  int age;
	// }
	// x[100],y[100],z;
	 int a;
	 int b;
	 int c;
	 int e;
	 int i;
	 int j = 0;
	 int k = 0;
	 int n;
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
		 x[k].id = tempVar2;
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 x[k].age = tempVar3;
	 }
	 if (x[k].age >= 60)
	 {
	  y[j].age = x[k].age;
	 y[j].id = x[k].id;
	 j = j + 1;
	 k = k - 1;
	 }
	 k = k + 1;
	 }
	for (i = 0;i < j;i++)
	{
	for (k = 0;k < j - i - 1;k++)
	{
	 if (y[k].age < y[k + 1].age)
	 {
		 z = y[k + 1];
	 y[k + 1] = y[k];
	 y[k] = z;
	 }
	}
	}
	for (i = 0;i < j;i++)
	{
	System.out.printf("%s\n",y[i].id);
	}
	for (i = 0;i < n - j;i++)
	{
	System.out.printf("%s\n",x[i].id);
	}
	}
}


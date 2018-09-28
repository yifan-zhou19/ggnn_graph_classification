package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct people
	//{
	//  char num[10];
	//  int age;
	//	}
	//	peo1[100],peo2[100],peo3[100],e;
	int n;
	int i;
	int j;
	int m;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] s = new char[100][10];
	for (i = 0;i < n;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  peo1[i].num = tempVar2;
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  peo1[i].age = tempVar3;
	  }
	}
	j = 0;
	m = 0;
	for (i = 0;i < n;i++)
	{
		if (peo1[i].age >= 60)
		{
		 peo2[j] = peo1[i];
		   j++;
		}
		else if (peo1[i].age < 60)
		{
		  peo3[m] = peo1[i];
		   m++;
		}
	}
	for (k = 1;k <= j;k++)
	{
	  for (i = 0;i < j - k;i++)
	  {
		if (peo2[i].age < peo2[i + 1].age)
		{
		   e = peo2[i + 1];
		   peo2[i + 1] = peo2[i];
		   peo2[i] = e;
		}
	  }
	}
	 int a;
	 int b;
	 int c;
	for (a = 0,i = 0;a < j;a++,i++)
	{
	   s[a] = peo2[i].num;
	}
	for (a = j,b = 0;a < n;a++,b++)
	{
	   s[a] = peo3[b].num;
	}
	for (c = 0;c < n;c++)
	{
	   System.out.printf("%s\n",s[c]);
	}
	 return 0;
	}

}


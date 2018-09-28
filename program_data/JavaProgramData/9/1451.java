package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct ren
	//{
	//  char b[100];
	//  int c;
	//
	//}
	//a[100],d[100],m;
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
		   a[i].b = tempVar2;
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i].c = tempVar3;
	   }
	   d[i] = a[i];

	}
	for (i = n - 1;i > 0;i--)
	{
		for (j = 0;j < i;j++)
		{
	if (d[j].c < d[j + 1].c)
	{
	   m = d[j + 1];
	   d[j + 1] = d[j];
	   d[j] = m;

	}

		}

	}
	for (i = 0;i < n;i++)
	{
		if (d[i].c >= 60)
		{
	  System.out.printf("%s\n",d[i].b);
		}

	}
	for (i = 0;i < n;i++)
	{
		if (a[i].c < 60)
		{
	   System.out.printf("%s\n",a[i].b);
		}
	}
	return 0;
	}


}


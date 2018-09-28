package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int b;
	int i;
	int j;
	int k;
	int l;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	int p;
	p = b;
	int c = 0;
	int flag1 = 0;
	int flag2;
	int flag3;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[][] a = new int[100000][2];
	for (i = 0;;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i][0] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[i][1] = Integer.parseInt(tempVar3);
	}
	if (a[i][0] == 0 && a[i][1] == 0)
	{
		p = i;
	break;
	}
	}
	for (j = 0;j < n;j++)
	{
	   flag2 = 0;
	   for (l = 0;l < b;l++)
	   {
		  if (j == a[l][0])
		  {
		  flag2 = 1;
		  }
	   }
	   flag3 = 0;
	   if (flag2 == 0)
	   {
		for (k = 0;k < b;k++)
		{
		   if (j == a[k][1])
		   {
		   flag3++;
		   }
		}
	   }
		if (flag3 == n - 1)
		{
		  c = c + 1;
		  System.out.printf("%d\n",j);
		}
	}
	if (c == 0)
	{
	System.out.print("NOT FOUND");
	}
	}

}


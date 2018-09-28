package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct qujian
	//{
	// int x;
	// int y;
	//}
	//sz[50000],e;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int i;
	for (i = 0;i < n;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 sz[i].x = tempVar2;
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 sz[i].y = tempVar3;
	 }
	}
	int j;
	int k;
	for (k = 1;k <= n;k++)
	{
	 for (j = 0;j < n - k;j++)
	 {
	   if (sz[j].x > sz[j + 1].x)
	   {
		 e = sz[j + 1];
		 sz[j + 1] = sz[j];
		 sz[j] = e;
	   }
	 }
	}
	for (i = 0;i < n - 1;i++)
	{
	   if (sz[i].y >= sz[i + 1].y)
	   {
		  sz[i + 1].y = sz[i].y;
		  sz[i + 1].x = sz[i].x;
	   }
	   else if (sz[i].y >= sz[i + 1].x && sz[i].y <= sz[i + 1].y)
	   {
		 sz[i + 1].x = sz[i].x;
	   }
	   else if (sz[i].y < sz[i + 1].x)
	   {
		  System.out.print("no");
		  return 0;
	   }
	}
	 if (i == n - 1)
	 {
	  System.out.printf("%d %d",sz[n - 1].x,sz[n - 1].y);
	 }
	return 0;
	}


















}


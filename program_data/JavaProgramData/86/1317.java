package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
	int[] a = new int[1000];
	int time = 0;
	int s = 0;
	int temp;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 for (j = 0;j <= 100;j++)
	 {
		 a[j] = 0;
	 }
	 for (j = 1;j <= m;j++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  temp = Integer.parseInt(tempVar3);
	  }
	  a[temp] = 1;
	 }
	 for (j = 1;j <= 100;j++)
	 {
	  time++;
	  s++;
	  if (a[j] == 1)
	  {
		  time += 3;
	  }
	  if (time >= 60)
	  {
		  break;
	  }
	 }
	 System.out.printf("%d\n",s);
	 s = 0;
	 time = 0;
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		n = Integer.parseInt(tempVar4);
	}
	return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int dawang = new int(int n,int m);
	  int a;
	  int b;
	  int boss;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  b = Integer.parseInt(tempVar2);
	  }
	  while (a != 0)
	  {
		 boss = dawang(a, b);
	  System.out.printf("%d\n",boss);
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  b = Integer.parseInt(tempVar4);
	  }
	  }
	//  scanf("\n");
	}
	public static int dawang(int n,int m)
	{
	 int[] after = new int[400];
	 int i;
	 int j;
	 int pre;
	 int t;
	 for (i = 0;i < n;i++)
	 {
		 after[i] = i + 1;
	 }
	 after[n] = 1;
	 pre = n;
	 t = 1;
	 while (after[pre] != pre)
	 {
		for (i = 1;i < m;i++)
		{
		  pre = t;
		  t = after[pre];
		}
		after[pre] = after[t];
		t = after[pre];
	 }
	return (t);
	}
}


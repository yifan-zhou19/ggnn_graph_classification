package <missing>;

public class GlobalMembers
{
	public static void order(int m,int n)
	{
		int i;
		int[] s = new int[100];
	  for (i = 0;i < m;i++)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s[i] = Integer.parseInt(tempVar);
	  }
	  }
	  for (i = m - n;i < m;i++)
	  {
	  System.out.printf("%d ",s[i]);
	  }
	  for (i = 0;i < m - n - 1;i++)
	  {
	  System.out.printf("%d ",s[i]);
	  }
	  System.out.printf("%d",s[i]);
	}
	public static int Main()
	{
		int a;
		int b;
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
	  order(a, b);
	}


}


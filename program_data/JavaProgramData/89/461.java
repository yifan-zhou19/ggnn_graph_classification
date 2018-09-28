package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[100000][2];
		int[] b = new int[100000];
		for (i = 0;i < 100000;i++)
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
		  break;
		  }
		  else
		  {
			b[a[i][1]]++;
		  }
		}
		for (i = 0;i < n;i++)
		{
		  if (b[i] == n - 1)
		  {
		   System.out.printf("%d",i);
		   break;
		  }
		}
		if (i == n)
		{
		System.out.print("NOT FOUND");
		}
		System.in.read();
		System.in.read();
	}

}


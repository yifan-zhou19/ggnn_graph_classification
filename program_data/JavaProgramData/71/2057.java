package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int j;
	  int a;
	  int x;
	  int y;
	  int z;
	  int[] b = {3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		 a = 0;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 x = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 y = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 z = Integer.parseInt(tempVar4);
		 }
		 b[1] = 0;
		 if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0)
		 {
		 b[1] = 1;
		 }
		 if (y < z)
		 {
			for (j = y;j < z;j++)
			{
			   a += b[j - 1];
			}
		 }
		 if (z < y)
		 {
			for (j = z;j < y;j++)
			{
			   a += b[j - 1];
			}
		 }
		 if (a % 7 == 0)
		 {
		 System.out.print("YES\n");
		 }
		 else
		 {
		 System.out.print("NO\n");
		 }
	  }

	}

}


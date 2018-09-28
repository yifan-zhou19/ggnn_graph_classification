package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int k;
	  int i;
	  int j;
	  int n;
	  int m;
	  int t;
	  int[] c = new int[20];
	  int l;
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
		 if (m == 0)
		 {
			 System.out.print("60\n");
			 continue;
		 }
		 t = 0;
		 for (j = 1;j <= m;j++)
		 {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			if (k + 3 * (j - 1) >= 60)
			{
			  for (l = j + 1;l <= m;l++)
			  {
				  String tempVar4 = ConsoleInput.scanfRead();
				  if (tempVar4 != null)
				  {
					  c[l] = Integer.parseInt(tempVar4);
				  }
			  }
			  break;
			}
			if (k + 3 * j > 60)
			{
			  for (l = j + 1;l <= m;l++)
			  {
				  String tempVar5 = ConsoleInput.scanfRead();
				  if (tempVar5 != null)
				  {
					  c[l] = Integer.parseInt(tempVar5);
				  }
			  }
			  t = 60 - (k + 3 * (j - 1));
			  break;
			}
		 }
		 System.out.printf("%d\n",60 - 3 * (j - 1) - t);
	  }
	}
}


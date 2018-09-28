package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[210];
	  int[] b = new int[210];
	  int n;
	  int sum = 0;
	  int i;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] == b[i])
			{
			   continue;
			}
			if ((a[i] == 0) && (b[i] == 1))
			{
			sum++;
			}
			 if ((a[i] == 1) && (b[i] == 2))
			 {
			sum++;
			 }
			if ((a[i] == 2) && (b[i] == 0))
			{
			sum++;
			}
			if ((a[i] == 1) && (b[i] == 0))
			{
			sum--;
			}
			if ((a[i] == 2) && (b[i] == 1))
			{
			sum--;
			}
			if ((a[i] == 0) && (b[i] == 2))
			{
			sum--;
			}
	  }
		 if (sum > 0)
		 {
		 System.out.print("A\n");
		 }
		 if (sum == 0)
		 {
		 System.out.print("Tie\n");
		 }
		 if (sum < 0)
		 {
		 System.out.print("B\n");
		 }
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x;
		  int y;
		  int z;
		  int n;
		  int i;
		  int t;
		  int s;
		  int[] a = new int[13];
		  a[1] = 31;
		  a[3] = 31;
		  a[5] = 31;
		  a[7] = 31;
		  a[8] = 31;
		  a[10] = 31;
		  a[12] = 31;
		  a[4] = 30;
		  a[6] = 30;
		  a[9] = 30;
		  a[11] = 30;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  t = 0;
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
			 if (y > z)
			 {
				 s = y;
				 y = z;
				 z = s;
			 }
			 a[2] = ((x % 400 == 0) || (x % 100 != 0 && x % 4 == 0))?29:28;
			 for (int j = y;j < z;j++)
			 {
				t = t + a[j];
			 }
			 if (t % 7 == 0)
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


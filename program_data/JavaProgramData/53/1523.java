package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[32767];
	  int i;
	  int n;
	  for (i = 1;i <= 32767;i++)
	  {
		  a[i] = 0;
	  }
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  n--;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  i = Integer.parseInt(tempVar2);
	  }
	  a[i] = 1;
	  System.out.printf("%d",i);
	  while (n > 0)
	  {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 i = Integer.parseInt(tempVar3);
		 }
		 if (a[i] == 0)
		 {
			a[i] = 1;
			System.out.printf(",%d",i);
		 }
		 n--;
	  }
	}
}


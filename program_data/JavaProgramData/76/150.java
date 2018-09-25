package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int q;
	  int z;
	  int j;
	  int min;
	  int max;
	  int k = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] s = new int[10005];
	  for (i = 0;i < n;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 q = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 z = Integer.parseInt(tempVar3);
		 }
		 for (j = 0;j < 10005;j++)
		 {
			 if (j >= q != 0 && j < z)
			 {
			 s[j] = 1;
			 }
		 }
	  }
	  for (i = 0;i < 10005;i++)
	  {
		  if (s[i] == 1)
		  {
		  min = i;
		  break;
		  }
	  }
	  for (i = 0;i < 10005;i++)
	  {
		  if (s[i] == 1)
		  {
		  max = i;
		  }
	  }
	  for (i = min;i <= max;i++)
	  {
		  k += s[i];
	  }
	  if (k != (max - min + 1))
	  {
		System.out.print("no");
	  }
	  else
	  {
	  System.out.printf("%d %d",min,max + 1);
	  }

	  return 0;
	}
}


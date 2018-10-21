package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int count = 0;
		  int non = 0;
		  int n;
		  int l;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[1000000];
		  int[] b = new int[1000000];
		  int[] c = new int[1000000];

		  for (int i = 0;;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[i] = Integer.parseInt(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  c[i] = Integer.parseInt(tempVar3);
				  }
				  l = i;
				  if (a[i] == 0 && c[i] == 0)
				  {
				  break;
				  }
		  }
		  for (int i = 0;i < l;i++)
		  {
		  b[c[i]]++;
		  }
		  for (int i = 0;i < l;i++)
		  {
				  if (b[i] == n - 1)
				  {
							   for (int j = 0;j < l;j++)
							   {
							   if (a[j] == i)
							   {
							   count = 1;
							   }
							   }
				  }
				  if (b[i] == n - 1 && count == 0)
				  {
				  System.out.printf("%d",i);
				  non = 1;
				  break;
				  }
		  }
		  if (non == 0)
		  {
		  System.out.print("NOT FOUND");
		  }
	}
}


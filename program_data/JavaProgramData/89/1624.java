package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int count = 0;
		  int num = 0;
		  int countf = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[20000];
		  int[] b = new int[20000];
		  for (i = 0;;i++)
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
		  if (a[i] == 0 && b[i] == 0)
		  {
		  break;
		  }
		  }
		  i = 0;
		  while (i < n)
		  {
						  countf = 0;
						  count = 0;
						  for (j = 0;a[j] != 0 || b[j] != 0;j++)
						  {
						  if (b[j] == i)
						  {
						  count = count + 1;
						  }
						  if (a[j] == i)
						  {
						  countf = countf + 1;
						  }
						  }
						 if ((count == n - 1) && (countf == 0))
						 {
						num = num + 1;
						System.out.printf("%d",i);
						 }

						  i++;
		  }
		  if (num == 0)
		  {
		  System.out.print("NOT FOUND");
		  }
		  System.in.read();
		  System.in.read();
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int s;
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[((n + 1) / 2)];
		  for (i = 0;i < (n + 1) / 2;i++)
		  {
		  a[i] = 1;
		  }
		  for (i = 1;i < (n + 1) / 2;i++)
		  {
			  for (j = 2;j < (2 * i + 1) / 2;j++)
			  {
				  if ((2 * i + 1) % j == 0)
				  {
					  a[i] = 0;
					  break;
				  }
			  }
		  }
		  s = 0;
		  for (i = 2;i < (n + 1) / 2;i++)
		  {
			  if ((a[i - 1] == 1) && (a[i] == 1))
			  {
				  s = 1;
				  System.out.printf("%d %d\n",2 * i - 1,2 * i + 1);
			  }
		  }
		  if (s == 0)
		  {
			  System.out.print("empty");
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(a);
	}
}


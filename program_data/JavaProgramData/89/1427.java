package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m = 0;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[n];
	  int[] b = new int[n];
	  int[] c = new int[n];
	  for (i = 0;i < n;i++)
	  {
		a[i] = i;
		b[i] = 0;
		c[i] = 0;
	  }
	  int[][] p = new int[100000][2];
	  for (i = 0;;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p[i][0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p[i][1] = Integer.parseInt(tempVar3);
		}
		if ((p[i][0] == 0) && (p[i][1] == 0))
		{
		  break;
		}
	  }
	  int k = i;
	  for (i = 0;i < k;i++)
	  {
		  for (j = 0;j < n;j++)
		  {
			if (p[i][1] == a[j])
			{
			  b[j]++;
			}
		  }
	  }
	  for (i = 0;i < k;i++)
	  {
		  for (j = 0;j < n;j++)
		  {
			if (p[i][0] == a[j])
			{
			  c[j]++;
			}
		  }
	  }
	  for (j = 0;j < n;j++)
	  {
		  if ((b[j] == n - 1) && (c[j] == 0))
		  {
			System.out.printf("%d\n",j);
			m = 1;
		  }
	  }
	  if (m == 0)
	  {
		System.out.print("NOT FOUND\n");
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(c);
	  System.in.read();
	  System.in.read();
	}

}


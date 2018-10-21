package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int m = 0;
		  int n;
		  int e;
		  int f;
		  int g;
		  int h;
		  int[] a;
		  int[] b;
		  int[] c;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  a = new int[n];
		  b = new int[n];
		  c = new int[n];
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
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  c[i] = Integer.parseInt(tempVar4);
		  }
		  }
		  for (i = 0;i < n;i++)
		  {
		  a[i] = b[i] + c[i];
		  }
		  for (i = 0;i < n;i++)
		  {
		  b[i] = a[i];
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (a[i] > m)
						  {
						  m = a[i];
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (b[i] == m)
						  {
						  break;
						  }
		  }
		  System.out.printf("%d %d\n",i + 1,m);
		  b[i] = 0;
		  a[i] = 0;
		  m = 0;
		  for (i = 0;i < n;i++)
		  {
						  if (b[i] > m)
						  {
						  m = b[i];
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (a[i] == m)
						  {
						  break;
						  }
		  }
		  System.out.printf("%d %d\n",i + 1,m);
		  a[i] = 0;
		  b[i] = 0;
		  m = 0;
		  for (i = 0;i < n;i++)
		  {
						  if (b[i] > m)
						  {
						  m = b[i];
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (a[i] == m)
						  {
						  break;
						  }
		  }

		  System.out.printf("%d %d\n",i + 1,m);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(a);
		 a = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(b);
		 b = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(c);
		 c = 0;

	}

}


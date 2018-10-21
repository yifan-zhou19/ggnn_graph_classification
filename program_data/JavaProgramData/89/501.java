package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int k = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }

		  int[] p;
		  int[] q;
		  //p=new int[n];
		  //q=new int[n];
		  p = new int[n];
		  q = new int[n];
		  for (i = 0;i < n;i++)
		  {
						 q[i] = 0; //???????????
						 p[i] = 0; //??????????
		  }
		  int a;
		  int b;
		  do
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  b = Integer.parseInt(tempVar3);
			  }
			  p[a]++;
			  q[b]++;
		  } while (a != 0 || b != 0);
		  p[0]--;
		  q[0]--;
		  for (i = 0;i < n;i++)
		  {
						  if (q[i] == n - 1 && p[i] == 0)
						  {
											  k++;
											  System.out.printf("%d\n",i);
						  }
		  }
		  if (k == 0)
		  {
		  System.out.print("NOT FOUND");
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(q);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(p);
		  System.in.read();
		  System.in.read();
	}

}


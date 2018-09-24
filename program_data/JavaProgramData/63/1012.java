package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x1;
		  int y1;
		  int x2;
		  int y2;
		  int i;
		  int h;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x1 = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  y1 = Integer.parseInt(tempVar2);
		  }
		  int[] p = new int[x1 * y1];
		  for (i = 0;i < (x1 * y1);i++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  p[i] = Integer.parseInt(tempVar3);
			  }
		  }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   x2 = Integer.parseInt(tempVar4);
		   }
		   String tempVar5 = ConsoleInput.scanfRead(" ");
		   if (tempVar5 != null)
		   {
			   y2 = Integer.parseInt(tempVar5);
		   }
		  int[] q = new int[x2 * y2];
		  for (i = 0;i < (x2 * y2);i++)
		  {
			  String tempVar6 = ConsoleInput.scanfRead();
			  if (tempVar6 != null)
			  {
				  q[i] = Integer.parseInt(tempVar6);
			  }
		  }
		  int[] m = new int[x1 * y2];
		  for (i = 0;i < (x1 * y2);i++)
		  {
			  m[i] = 0;
		  }

		  for (h = 0;h < x1;h++)
		  {
			  for (j = 0;j < y2;j++)
			  {
				  if (j == (y2 - 1))
				  {
				  for (i = 0;i < y1;i++)
				  {
					  m[h * y2 + j] += p[h * y1 + i] * q[i * y2 + j];
				  }
				   System.out.printf("%d",m[h * y2 + j]);
				  }
				  else
				  {
					 for (i = 0;i < y1;i++)
					 {
					   m[h * y2 + j] += p[h * y1 + i] * q[i * y2 + j];
					 }
				  System.out.printf("%d ",m[h * y2 + j]);
				  }

			  }
			  System.out.print("\n");
		  }

		  System.in.read();
		  System.in.read();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(q);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(m);

	}

}


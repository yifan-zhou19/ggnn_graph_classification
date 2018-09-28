package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct a
	// {
	//	 double x,y;
	// }
	// *p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	 p = (a)malloc(sizeof(a) * n);
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  (p + i).x = tempVar2;
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  (p + i).y = tempVar3;
			  }
		  }
	 double dis = 0;
		  for (i = 0;i < n;i++)
		  {
			  for (j = 0;j < n;j++)
			  {
			  double t;
			  t = Math.sqrt(Math.pow(((p + i).x - (p + j).x),2) + Math.pow(((p + i).y - (p + j).y),2));
			  if (t > dis)
			  {
				  dis = t;
			  }
			  }

		  }
		  System.out.printf("%.4f",dis);
	  return 0;
	}

}


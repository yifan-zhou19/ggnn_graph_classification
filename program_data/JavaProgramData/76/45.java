package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct
	//	  {
	//			 int a;
	//			 int b;
	//			 }
	//			 st[5001];
		  int i;
		  int j;
		  int n;
		  int k;
		  int l = 0;
		  int swap1;
		  int swap2;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  st[i].a = tempVar2;
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  st[i].b = tempVar3;
			  }
		  }
		  for (i = 0;i < n - 1;i++)
		  {
			  for (j = n - 1;j > 0;j--)
			  {
				  if (st[j].a < st[j - 1].a)
				  {
					  swap1 = st[j].a;
					  st[j].a = st[j - 1].a;
					  st[j - 1].a = swap1;
					  swap2 = st[j].b;
					  st[j].b = st[j - 1].b;
					  st[j - 1].b = swap2;
				  }
			  }
		  }
		  int t;
		  t = st[0].b;
		  for (i = 1;i < n;i++)
		  {
						  if (st[i].a > t)
						  {
									 break;
						  }
									 else
									 {
										 if (t < st[i].b)
										 {
										 t = st[i].b;
										 }
									 }
		  }
						  if (i != n)
						  {
									 System.out.print("no");
						  }
	else
	{
		System.out.printf("%d %d",st[0].a,t);
	}

		  return 0;
	}

}


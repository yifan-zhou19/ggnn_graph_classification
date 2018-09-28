package <missing>;

public class GlobalMembers
{
	public static int compare(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int)elem1;
		p2 = (int)elem2;
		return (p2) - p1;
	}
	public static int Main()
	{
		  int c;
		  for (c = 1;;c++)
		  {
			  int n;
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  if (n == 0)
			  {
				  break;
			  }
			  else
			  {
				  int d;
				  int match;
				  int f1 = 0;
				  int f2 = 0;
				  int b1 = 0;
				  int b2 = 0;
				  int money;
				  int w = 0;
				  int t = 0;
				  int l = 0;
				  int[] T = new int[n];
				  int[] Q = new int[n];
				  for (d = 0;d < n;d++)
				  {
					  String tempVar2 = ConsoleInput.scanfRead();
					  if (tempVar2 != null)
					  {
						  T[d] = Integer.parseInt(tempVar2);
					  }
				  }
				  qsort(T,n,(Integer.SIZE / Byte.SIZE),compare);
				  for (d = 0;d < n;d++)
				  {
					  String tempVar3 = ConsoleInput.scanfRead();
					  if (tempVar3 != null)
					  {
						  Q[d] = Integer.parseInt(tempVar3);
					  }
				  }
				  qsort(Q,n,(Integer.SIZE / Byte.SIZE),compare);
				  for (match = 0;match < n;match++)
				  {
					  if (T[f1] > Q[f2])
					  {
							w++;
							f2++;
							f1++;
					  }
					  else
					  {
						   if (T[n - 1 - b1] > Q[n - 1 - b2])
						   {
								 w++;
								 b1++;
								 b2++;
						   }
						   else
						   {
								 if (T[n - 1 - b1] == Q[f2])
								 {
									  break;
								 }
								 else
								 {
									 l++;
									 b1++;
									 f2++;
								 }
						   }
					  }
				  }
				  money = 200 * (w - l);
				  System.out.printf("%d\n",money);
			  }
		  }
	}
}


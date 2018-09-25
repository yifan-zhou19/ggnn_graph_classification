package <missing>;

public class GlobalMembers
{
	public static int[] qi = new int[1002];
	public static int[] tian = new int[1002];
	public static int n;
	public static int myCompare(Object a, Object b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*q;
	   int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
	   int q;
	   p = (int)a;
	   q = (int)b;
	   return q - p;
	}
	public static int Main()
	{
		while (true)
		{
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  if (n == 0)
		  {
			 break;
		  }
		  for (int i = 0;i < n;i++)
		  {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 tian[i] = Integer.parseInt(tempVar);
			 }
		  }
		  for (int i = 0;i < n;i++)
		  {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 qi[i] = Integer.parseInt(tempVar2);
			 }
		  }
		  qsort(tian,n,(Integer.SIZE / Byte.SIZE),myCompare);
		  qsort(qi,n,(Integer.SIZE / Byte.SIZE),myCompare);
		  int qif = 0;
		  int qis = n - 1;
		  int tianf = 0;
		  int tians = n - 1;
		  int wins = 0;
		  int ping = 0;
		  while (tianf <= tians)
		  {
			 if (tian[tianf] < qi[qif])
			 {
				qif++;
				tians--;
				continue;
			 }
			 else if (tian[tianf] > qi[qif])
			 {
				tianf++;
				qif++;
				wins++;
			 }
			 else
			 {
				if (tian[tians] > qi[qis])
				{
				   tians--;
				   qis--;
				   wins++;
				}
				else
				{
				   if (tian[tians] == qi[qif])
				   {
					  ping++;
				   }
				   tians--;
				   qif++;
				}
			 }
		  }
		  System.out.print(200 * wins - (n - wins - ping) * 200);
		  System.out.print("\n");
		}
		return 0;
	}

}


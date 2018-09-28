package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	P[10];

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct triple
	//   {
	//	   struct point A;
	//	   struct point B;
	//	   double d;
	//   }
	//   pair[50],tmp;

	   int n;
	   int i;
	   int j;
	   int k;
	   int[] c = new int[31];

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= 3 * n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   c[i] = Integer.parseInt(tempVar2);
		   }
	   }

	   for (i = 0;i < n;i++)
	   {
		   (P[i]).x = c[3 * i + 1];
		   (P[i]).y = c[3 * i + 2];
		   (P[i]).z = c[3 * i + 3];
	   }

	  for (i = 0;i < n;i++)
	  {
		   for (j = i + 1;j < n;j++)
		   {
			   k = i * n + j - i * (i + 3) / 2;
			   (pair[k]).A = P[i];
			   (pair[k]).B = P[j];
			   int X = P[i].x - P[j].x;
			   int Y = P[i].y - P[j].y;
			   int Z = P[i].z - P[j].z;
			   (pair[k]).d = Math.sqrt(X * X + Y * Y + Z * Z);
		   }
	  }



	  for (i = n * (n - 1) / 2;i > 1;i--)
	  {
		  for (k = 1;k < i;k++)
		  {
			 if ((pair[k]).d < (pair[k + 1]).d)
			 {
			   tmp = pair[k + 1];
			   pair[k + 1] = pair[k];
			   pair[k] = tmp;
			 }
		  }
	  }

	for (k = 1;k <= n * (n - 1) / 2;k++)
	{
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",(pair[k]).A.x,(pair[k]).A.y,(pair[k]).A.z,(pair[k]).B.x,(pair[k]).B.y,(pair[k]).B.z,(pair[k]).d);
	}


	}



}


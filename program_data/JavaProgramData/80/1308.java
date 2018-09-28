package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int sY;
	  int sM;
	  int sD;
	  int eY;
	  int eM;
	  int eD;
	  int sN;
	  int eN;
	  int N;
	  int num = new int(int Y,int M,int D);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  sY = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  sM = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  sD = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead("\n");
	  if (tempVar4 != null)
	  {
		  eY = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead();
	  if (tempVar5 != null)
	  {
		  eM = Integer.parseInt(tempVar5);
	  }
	  String tempVar6 = ConsoleInput.scanfRead();
	  if (tempVar6 != null)
	  {
		  eD = Integer.parseInt(tempVar6);
	  }
	  sN = num(sY, sM, sD);
	  eN = num(eY, eM, eD);
	  N = eN - sN;
	  System.out.printf("%d",N);
	  return 0;
	}

	public static int num(int Y,int M,int D)
	{
	  int N;
	  int a;
	  int M1;
	  int Y1;
	  M1 = M - 1;
	  Y1 = Y - 1;
	  if (M1 == 1 || M1 == 5 || M1 == 6)
	  {
		a = 1;
	  }
	  else if (M1 == 2)
	  {
		a = -1;
	  }
	  else if (M1 == 3 || M1 == 4 || M1 == 0)
	  {
		a = 0;
	  }
	  else if (M1 == 7)
	  {
		a = 2;
	  }
	  else if (M1 == 8 || M1 == 9)
	  {
		a = 3;
	  }
	  else if (M1 == 10 || M1 == 11)
	  {
		a = 4;
	  }
	  N = 365 * (Y - 1) + (Y - 1) / 4 - (Y - 1) / 100 + (Y - 1) / 400 + 30 * (M - 1) + a + D;
	  if (((Y % 4 == 0 && Y % 100 != 0) || (Y % 400 == 0)) && M > 2)
	  {
		N = N + 1;
	  }
	  return (N);
	}
}


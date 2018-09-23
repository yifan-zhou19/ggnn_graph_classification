package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_b = new int[100];
	public static void Main(String[] args)
	{
	  int n;
	  int m;
	  int a;
	  int f;
	  int l;
	  int x;
	  int y;
	  int s;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//  static int b[100];
	  int i;
	  int j = 0;
	  int k = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  m = n * n;
	  for (i = 0;i < m;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = Integer.parseInt(tempVar2);
		 }
		 if (a == 0)
		 {
			j += 1;
			Main_b[k] = i + 1;
			k += 1;
		 }
	  }
	  f = Main_b[0];
	  for (k = 1;k < 100;k++)
	  {
		 x = Main_b[k - 1];
		 y = Main_b[k];
		 if (x < y)
		 {
			l = y;
		 }
		 else
		 {
			break;
		 }
	  }
	  if (l % n == 0)
	  {
		 s = ((l % n) - (f % n) + n + 1) * ((l / n) - (f / n)) - j;
	  }
	  else
	  {
		 s = ((l % n) - (f % n) + 1) * ((l / n) - (f / n) + 1) - j;
	  }
	  System.out.printf("%d\n",s);
	}

}


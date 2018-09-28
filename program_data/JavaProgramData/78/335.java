package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_x = new int[5];
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int i;
	int j;
	int t;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static int x[5];
	char k;
	 char[] y = {'\0', 'z', 'q', 's', 'l'};
	for (a = 10;a <= 50;a += 10)
	{
	   for (b = 10;b <= 50;b += 10)
	   {
		  for (c = 10;c <= 50;c += 10)
		  {
			 for (d = 10;d <= 50;d += 10)
			 {
		  if (a + b == c + d && a + d > b + c && a + c < b && a != b && b != c && c != d)
		  {
				Main_x[1] = a;
			 Main_x[2] = b;
			 Main_x[3] = c;
			 Main_x[4] = d;
		  }
			 }
		  }
	   }
	}
	for (j = 1;j <= 3;j++)
	{
	  for (t = j + 1;t <= 4;t++)
	  {
	   if (Main_x[j] < Main_x[t])
	   {
			i = Main_x[j];
		 Main_x[j] = Main_x[t];
		 Main_x[t] = i;
		 k = y[j];
		 y[j] = y[t];
		 y[t] = k;
	   }
	  }
	}
	for (i = 1;i <= 4;i++)
	{
	   System.out.printf("%c %d\n",y[i],Main_x[i]);
	}
	}


}

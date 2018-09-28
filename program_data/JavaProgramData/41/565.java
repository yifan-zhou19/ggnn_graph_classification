package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int j = 0;
	   c = 1;
	   if (c == 1)
	   {
		   a = 5;
		   e = 4;
		   d = 3;
		   b = 2;
		   if (e == 1)
		   {
			   j++;
		   }
		   if (b == 2)
		   {
			   j++;
		   }
		   if (a == 5)
		   {
			   j++;
		   }
		   if (c != 1)
		   {
			   j++;
		   }
		   if (d == 1)
		   {
			   j++;
		   }
		   if (j == 2 && a == 5 && b == 2)
		   {
			   System.out.printf("%d %d %d %d %d\n",a,b,c,d,e);
		   }
	   }
	}


}

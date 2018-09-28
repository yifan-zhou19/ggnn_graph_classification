package <missing>;

public class GlobalMembers
{
	public static int change(char a)
	{
		int b;
		switch (a)
		{
		 case'0':
		 b = 0;
		 break;
		 case'1':
		 b = 1;
		 break;
		 case'2':
		 b = 2;
		 break;
		 case'3':
		 b = 3;
		 break;
		 case'4':
		 b = 4;
		 break;
		 case'5':
		 b = 5;
		 break;
		 case'6':
		 b = 6;
		 break;
		 case'7':
		 b = 7;
		 break;
		 case'8':
		 b = 8;
		 break;
		 case'9':
		 b = 9;
		 break;
		}
		 return (b);
	}

	public static int Main()
	{
		 String a = new String(new char[251]);
		 String b = new String(new char[251]);
		 int[] c = new int[300];
		 int[] p = c;
		 int i;
		 a = new Scanner(System.in).nextLine();
		 b = new Scanner(System.in).nextLine();
		 int x;
		 int y;
		 x = a.length();
		 y = b.length();
		 int d;
		 int max;
		 int s = 0;
		 if (x >= y)
		 {
			 max = x;
		 }
		 else
		 {
			 max = y;
		 }
		 d = change(a.charAt(x - 1)) + change(b.charAt(y - 1));
		 for (i = max;i > 0;i--)
		 {
			 x--;
			 y--;
			 if (d >= 10)
			 {
				 p[0] = d - 10;
				 s++;
				 if ((x - 1) >= 0 && (y - 1) >= 0)
				 {
					 d = change(a.charAt(x - 1)) + change(b.charAt(y - 1)) + 1;
				 }
				 else if ((x - 1) >= 0 && (y - 1) < 0)
				 {
					 d = change(a.charAt(x - 1)) + 1;
				 }
				 else if ((y - 1) >= 0 && (x - 1) < 0)
				 {
					 d = change(b.charAt(y - 1)) + 1;
				 }
				 else if ((y - 1) < 0 && (x - 1) < 0)
				 {
					 p[1] = 1;
					 s++;
				 }
			 }
			 else if (d < 10)
			 {
				 p[0] = d;
				 s++;
				 if ((x - 1) >= 0 && (y - 1) >= 0)
				 {
					 d = change(a.charAt(x - 1)) + change(b.charAt(y - 1));
				 }
				 else if ((x - 1) >= 0 && (y - 1) < 0)
				 {
					 d = change(a.charAt(x - 1));
				 }
				 else if ((y - 1) >= 0 && (x - 1) < 0)
				 {
					 d = change(b.charAt(y - 1));
				 }
				 else if ((y - 1) < 0 && (x - 1) < 0)
				 {
					 break;
				 }
			 }
			 p++;
		 }
		 int m;
	  for (i = s - 1;i >= 0;i--)
	  {
		  if (c[i] != 0)
		  {
			  m = i;
			  break;
		  }
	  }
	  for (i = m;i >= 0;i--)
	  {
		  System.out.printf("%d",c[i]);
	  }
		return 0;
	}
}

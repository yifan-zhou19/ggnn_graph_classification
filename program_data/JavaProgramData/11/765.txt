package <missing>;

public class GlobalMembers
{
	public static int m(int n)
	{
		if (n % 100 != 0)
		{
					 if (n % 4 == 0)
					 {
					 return (1);
					 }
					 else
					 {
					 return (0);
					 }
		}
		else
		{
			if (n % 400 == 0)
			{
			return (1);
			}
			else
			{
			return (0);
			}
		}

	}
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int x;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  b = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  c = Integer.parseInt(tempVar3);
		  }
		  if (m(a) == 1)
		  {
					 if (b == 1)
					 {
					 x = c;
					 }
					 if (b == 2)
					 {
					 x = 31 + c;
					 }
					 if (b == 3)
					 {
					 x = 60 + c;
					 }
					 if (b == 4)
					 {
					 x = 91 + c;
					 }
					 if (b == 5)
					 {
					 x = 121 + c;
					 }
					 if (b == 6)
					 {
					 x = 152 + c;
					 }
					 if (b == 7)
					 {
					 x = 182 + c;
					 }
					 if (b == 8)
					 {
					 x = 213 + c;
					 }
					 if (b == 9)
					 {
					 x = 244 + c;
					 }
					 if (b == 10)
					 {
					 x = 274 + c;
					 }
					 if (b == 11)
					 {
					 x = 305 + c;
					 }
					 if (b == 12)
					 {
					 x = 335 + c;
					 }
				  System.out.printf("%d",x);
		  }
		  else
		  {
			  if (b == 1)
			  {
					 x = c;
			  }
					 if (b == 2)
					 {
					 x = 31 + c;
					 }
					 if (b == 3)
					 {
					 x = 59 + c;
					 }
					 if (b == 4)
					 {
					 x = 90 + c;
					 }
					 if (b == 5)
					 {
					 x = 120 + c;
					 }
					 if (b == 6)
					 {
					 x = 151 + c;
					 }
					 if (b == 7)
					 {
					 x = 181 + c;
					 }
					 if (b == 8)
					 {
					 x = 212 + c;
					 }
					 if (b == 9)
					 {
					 x = 243 + c;
					 }
					 if (b == 10)
					 {
					 x = 273 + c;
					 }
					 if (b == 11)
					 {
					 x = 304 + c;
					 }
					 if (b == 12)
					 {
					 x = 334 + c;
					 }
					System.out.printf("%d",x);
		  }
		  System.in.read();
		  System.in.read();
	}
}


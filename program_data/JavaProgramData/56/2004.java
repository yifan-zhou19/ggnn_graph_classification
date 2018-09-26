package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 char a;
	 char b;
	 char c;
	 char d;
	 char e;
	 char x;
	 char y;
	 String tempVar = ConsoleInput.scanfRead(null, 1);
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(null, 1);
	 if (tempVar2 != null)
	 {
		 b = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(null, 1);
	 if (tempVar3 != null)
	 {
		 c = tempVar3.charAt(0);
	 }
	 String tempVar4 = ConsoleInput.scanfRead(null, 1);
	 if (tempVar4 != null)
	 {
		 d = tempVar4.charAt(0);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(null, 1);
	 if (tempVar5 != null)
	 {
		 e = tempVar5.charAt(0);
	 }
	 if (c == '\n')
	 {
		  x = a;
	   a = b;
	   b = x;
	   System.out.printf("%c%c",a,b);
	 }
	 else if (d == '\n')
	 {
		   x = a;
		a = c;
		c = x;
		System.out.printf("%c%c%c",a,b,c);
	 }
	else if (e == '\n')
	{
		   x = a;
		a = d;
		d = a;
		y = b;
		b = c;
		c = y;
		System.out.printf("%c%c%c%c",a,b,c,d);
	}
	else
	{
		x = a;
		  a = e;
		  e = x;
		  y = b;
		  b = d;
		  d = y;
		 System.out.printf("%c%c%c%c%c",a,b,c,d,e);
	}
	}


}


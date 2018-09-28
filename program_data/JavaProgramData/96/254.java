package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[100]);
	   int b;
	   int c;
	   int d;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   if ((a.charAt(1) == '\0') || ((a.charAt(2) == '\0') && (a.charAt(0) == '1') && (a.charAt(1) < '3')))
	   {
		   System.out.printf("0\n%s",a);
	   }
	   else
	   {
	   if ((a.charAt(0) == '1') && (a.charAt(1) < '3'))
	   {
		  b = (a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + (a.charAt(2) - '0');
		  i = 2;
	   }
	   else
	   {
		  b = (a.charAt(0) - '0') * 10 + (a.charAt(1) - '0');
		  i = 1;
	   }
	   while (a.charAt(i) != '\0')
	   {
		  c = b / 13;
		  System.out.printf("%d",c);
		  d = b % 13;
		  i++;
		  b = d * 10 + a.charAt(i) - '0';
	   }
	   System.out.printf("\n%d",d);
	   }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}



}


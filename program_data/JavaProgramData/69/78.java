package <missing>;

public class GlobalMembers
{
	public static void back(String a)
	{
		 int l;
		 int i;
		 String b = new String(new char[1001]);
		 l = a.length();
		 for (i = 0;i < l;i++)
		 {
						 b = tangible.StringFunctions.changeCharacter(b, i, a[l - i - 1]);
		 }
		 b = tangible.StringFunctions.changeCharacter(b, l, '\0');
		 a = b;
	}
	public static void full(String a)
	{
		 int l;
		 int i;
		 l = a.length();
		 for (i = l;i < 1000;i++)
		 {
							 a[i] = '0';
		 }
		 a[1000] = '\0';
	}
	public static void recur(String a)
	{
		 int i;
		 for (i = 999;i >= 0;i--)
		 {
							if (!a[i].equals('0'))
							{
										 a[i + 1] = null;
										 break;
							}
		 }
		 back(a);
	}
	public static void plus(String a, String b, String sum)
	{
		  int i;
		  back(a);
		  back(b);
		  full(a);
		  full(b);
		  for (i = 0;i < 1000;i++)
		  {
							  if (a[i].compareTo('9') > 0)
							  {
								  a[i] = a[i] - 10;
								  a[i + 1] = a[i + 1].Substring(1);
							  }
							  if ((a[i] + b[i] - 2 * '0') > 9)
							  {
								  sum[i] = a[i] + b[i] - '0' - 10;
								  a[i + 1] = a[i + 1].Substring(1);
							  }
							  else
							  {
								  sum[i] = a[i] + b[i] - '0';
							  }
		  }
		  recur(b);
		  recur(sum);
	}
	public static void minus(String a, String b, String difference)
	{
		 int i;
		 int w = 0;
		 back(a);
		 back(b);
		 full(a);
		 full(b);
		 for (i = 0;i < 1000;i++)
		 {
						   if (w == 1)
						   {
						   a[i] = a[i] - 1;
						   }
						   if (a[i].compareTo(b[i]) < 0)
						   {
										difference[i] = a[i].Substring(10) - b[i] + '0';
										w = 1;
						   }
						   else
						   {
							   difference[i] = a[i] - b[i] + '0';
							   w = 0;
						   }
		 }
		 for (i = 999;difference[i].equals('0');i--)
		 {
			 ;
		 }
		 if (i >= 0)
		 {
		 difference[i + 1] = '\0';
		 }
		 else
		 {
		 difference[1] = '\0';
		 }
		 back(difference);
	}
	public static int Main()
	{
		  String a = new String(new char[1001]);
		  String b = new String(new char[1001]);
		  String sum = new String(new char[1001]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  b = tempVar2.charAt(0);
		  }
		  if (a.charAt(0) == '0' && a.charAt(1) == 0 && b.charAt(0) == '0' && b.charAt(1) == 0)
		  {
		  System.out.print("0");
		  }
		  else
		  {
			  plus(a, b, sum);
			  System.out.println(sum);
		  }
		  System.in.read();
		  System.in.read();
	}
}


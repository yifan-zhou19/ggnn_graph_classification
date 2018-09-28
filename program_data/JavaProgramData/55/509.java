package <missing>;

public class GlobalMembers
{
	public static int f1(char p)
	{
		int t;
	 if ((p >= 48) && (p <= 57))
	 {
		 t = p - 48;
	 }
	 else if ((p >= 55) && (p <= 90))
	 {
		 t = p - 55;
	 }
		  else
		  {
			  t = p - 87;
		  }
	 return (t);
	}
	public static char f2(int p)
	{
		char t;
	 if ((p >= 0) && (p <= 9))
	 {
		 t = p + 48;
	 }
	 else
	 {
		 t = p + 55;
	 }
	return (t);
	}
	public static void Main()
	{
	 int t = 0;
	 String s = new String(new char[11]);
	 final String x = "";
	 int a;
	 int b;
	 int i;
	 int k;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 s = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 b = Integer.parseInt(tempVar3);
	 }
	 n = s.length();
	 for (i = 0;i <= n - 1;i++)
	 {
	   t = f1(s.charAt(i)) + t * a;
	 }
	 n = 0;
	 if (t == 0)
	 {
		 System.out.print("0");
	 }
	 while (t != 0)
	 {
		 k = t % b;
	   t = (t - k) / b;
	   x = tangible.StringFunctions.changeCharacter(x, n, f2(k));
	   n++;
	 }
	 for (i = n - 1;i >= 0;i--)
	 {
		 System.out.printf("%c",x.charAt(i));
	 }
	System.out.print("\n");
	}
}


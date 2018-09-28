package <missing>;

public class GlobalMembers
{
	public static int f(int[] x, int p, int l)
	{
	 int i;
	 int sum = 0;
	 for (i = 0;i < l;i++)
	 {
	  sum = sum * p + x[i];
	 }
	 return (sum);
	}
	public static void Main()
	{
	 int a;
	 int b;
	 int[] y = new int[80];
	 int i;
	 int len;
	 int t;
	 String x = new String(new char[80]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 x = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 b = Integer.parseInt(tempVar3);
	 }
	 for (i = 0;i < x.length();i++)
	 {
	  if (x.charAt(i) >= '0' && x.charAt(i) <= '9')
	  {
	   y[i] = x.charAt(i) - '0';
	  }
	  else if (x.charAt(i) >= 'a' && x.charAt(i) <= 'z')
	  {
	   y[i] = x.charAt(i) - 'a' + 10;
	  }
	  else if (x.charAt(i) >= 'A' && x.charAt(i) <= 'Z')
	  {
	   y[i] = x.charAt(i) - 'A' + 10;
	  }
	 }
	 t = f(y, a, x.length());
	 if (t == 0)
	 {
	  System.out.print("0");
	 }
	 else
	 {
	  for (i = 0;t != 0;i++)
	  {
	   y[i] = t % b;
	   t = (t - y[i]) / b;
	  }
	  len = i;
	  for (i = 0;i < len;i++)
	  {
	   if (y[i] >= 0 && y[i] <= 9)
	   {
		x = tangible.StringFunctions.changeCharacter(x, i, '0' + y[i]);
	   }
	   else if (y[i] > 9)
	   {
		x = tangible.StringFunctions.changeCharacter(x, i, y[i] - 10 + 'A');
	   }
	  }
	  for (i = len - 1;i >= 0;i--)
	  {
	   System.out.printf("%c",x.charAt(i));
	  }
	 }
	}
}


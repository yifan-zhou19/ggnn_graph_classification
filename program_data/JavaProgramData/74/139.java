package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int f = int n;
	  int h = int n;
	  int n;
	  int m;
	  int d = 0;
	  int i;
	  int k1;
	  int k2;
	  int[] num = new int[100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead("  ");
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  for (i = n;i <= m;i++)
	  {
	   if (((k1 = f(i)) == 1) && (k2 = h(i)) == 1)
	   {
		 num[d] = i;
		 d = d + 1;
	   }
	  }
	  if (d == 0)
	  {
		  System.out.print("no\n");
	  }
	  else if (d != 0)
	  {
	  for (i = 0;i < d - 1;i++)
	  {
		  System.out.printf("%d,",num[i]);
	  }
	  System.out.printf("%d",num[d - 1]);
	  }
	}

	public static int f(int n)
	{
	 int k = Math.sqrt(n);
	 int i;
	 for (i = 2;i <= k;i++)
	 {
	  if (n % i == 0)
	  {
		return (-1);
		break;
	  }
	 }
	 if (i == (k + 1))
	 {
		 return (1);
	 }
	}

	public static int h(int n)
	{
	 String c1 = new String(new char[20]);
	 String c2 = new String(new char[20]);
	 int i;
	 int j;
	 int l;
	 for (i = 0;;i++)
	 {
	  if (n < 10)
	  {
	   c1 = tangible.StringFunctions.changeCharacter(c1, i, n % 10 + 48);
	   c1 = tangible.StringFunctions.changeCharacter(c1, i + 1, n / 10 + 48);
	   break;
	  }
	  else
	  {
	   c1 = tangible.StringFunctions.changeCharacter(c1, i, n % 10 + 48);
	   n = n / 10;
	  }
	 }
	 j = i;
	 for (i = 0;i <= j;i++)
	 {
	  c2 = tangible.StringFunctions.changeCharacter(c2, i, c1.charAt(j - i));
	 }
	 for (i = 0;i <= j;i++)
	 {
	  if (c1.charAt(i) != c2.charAt(i))
	  {
	   return (-1);
	   break;
	  }
	 }
	 if (i == j + 1)
	 {
		 return (1);
	 }
	}

}


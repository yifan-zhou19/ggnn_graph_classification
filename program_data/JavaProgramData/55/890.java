package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String c = new String(new char[1000]);
	 int n;
	 int x = 0;
	 int i;
	 int a;
	 int b;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 c = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 b = Integer.parseInt(tempVar3);
	 }
	 n = c.length();
	 for (i = 0;i <= n - 1;i++)
	 {
	  if ('A' <= c.charAt(i) && c.charAt(i) <= 'Z')
	  {
	   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'A' + 10);
	  }
	  else if ('a' <= c.charAt(i) && c.charAt(i) <= 'z')
	  {
	   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'a' + 10);
	  }
	  else if ('0' <= c.charAt(i) && c.charAt(i) <= '9')
	  {
	   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - '0');
	  }
	 }
	  for (i = 0;i <= n - 1;i++)
	  {
	   x = x + c.charAt(i) * Math.pow(a,n - i - 1);
	  }
	  if (x == 0)
	  {
	   System.out.printf("%d",x);
	  }
	  if (x != 0)
	  {
	  int y;
	  int[] n = new int[100];
	  int j;
	   y = x;
	   for (i = 0;y != 0;i++)
	   {
		   n[i] = y % b;
		   y = y / b;
	   }
	   for (j = i - 1;j >= 0;j--)
	   {
		if (0 <= n[j] != 0 && n[j] < 10)
		{
		 System.out.printf("%d",n[j]);
		}
		else if (n[j] >= 10)
		{
		 n[j] = n[j] + 'A' - 10;
			System.out.printf("%c",n[j]);
		}
	   }
	  }
	   System.out.print("\n");
	   System.in.read();
	   System.in.read();
	}

}


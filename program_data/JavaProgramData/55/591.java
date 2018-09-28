package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int a;
	 int b;
	 int x;
	 int n;
	 int temp;
	 String s = new String(new char[10]);
	 String p = new String(new char[10]);
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
	 temp = 0;
	 for (i = 0;i < n;i++)
	 {
	  if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
	  {
	   temp = temp * a + s.charAt(i) - 'a' + 10;
	  }
	  if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
	  {
	   temp = temp * a + s.charAt(i) - 'A' + 10;
	  }
	  if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
	  {
	   temp = temp * a + s.charAt(i) - '0';
	  }
	 }
	 for (x = 0,i = 0;;i++)
	 {
	  if (temp % b >= 10)
	  {
		  p = tangible.StringFunctions.changeCharacter(p, x, temp % b - 10 + 'A');
	  }
	   else
	   {
		   p = tangible.StringFunctions.changeCharacter(p, x, temp % b + '0');
	   }
	  x++;
	  temp = temp / b;
	  if (temp == 0)
	  {
		  break;
	  }
	 }
	 for (i = x - 1;i >= 0;i--)
	 {
	  System.out.printf("%c",p.charAt(i));
	 }
	}

}


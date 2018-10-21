package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t = 0;
	String c = new String(new char[100]);
	String d = new String(new char[100]);
	 int a;
	 int b;
	 int i;
	 int j;
	 int k;
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
	 for (i = 0;c.charAt(i) != '\0';i++)
	 {
		  if (c.charAt(i) > '9')
		  {
			  if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			  {
			k = c.charAt(i) - 'a' + 10;
			  }
		   else
		   {
			   k = c.charAt(i) - 'A' + 10;
		   }
		  }
		else
		{
			k = c.charAt(i) - '0';
		}
	   t = a * t + k;
	 }
	 if (t == 0)
	 {
		 System.out.print("0");
	 }
	 else
	 {
	  for (i = 0;t != 0;i++)
	  {
		  if (t % b > 9)
		  {
		d = tangible.StringFunctions.changeCharacter(d, i, t % b - 10 + 'A');
		  }
	   else
	   {
		d = tangible.StringFunctions.changeCharacter(d, i, t % b + '0');
	   }
	   t = t / b;
	  }
	 for (j = i - 1;j >= 0;j--)
	 {
		 System.out.printf("%c",d.charAt(j));
	 }
	 }
	}
}


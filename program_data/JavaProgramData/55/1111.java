package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int n;
	  int b;
	  int i;
	  int j;
	  int l;
	  int sum = 0;
	  String c = new String(new char[40]);
	  int[] d = new int[40];
	  String e = new String(new char[40]);
	  String f = new String(new char[40]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  c = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  b = Integer.parseInt(tempVar3);
	  }
	  l = c.length();
	  if (c.charAt(0) == '0')
	  {
	   System.out.print("0");
	  }
	  else
	  {
		  for (i = 0;i < l;i++)
		  {
			 if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			 {
			   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'A'+'a');
			 }
		  }
		  for (i = 0;i < l;i++)
		  {
			 if (c.charAt(i) >= 'a')
			 {
			   d[i] = c.charAt(i) - 'a' + 10;
			 }
			 else
			 {
			   d[i] = c.charAt(i) - '0';
			 }
			 sum = sum * a + d[i];
		  }
		   for (i = 0;sum != 0;i++)
		   {
			e = tangible.StringFunctions.changeCharacter(e, i, sum % b);
			sum = sum / b;
			if (e.charAt(i) > 9)
			{
			e = tangible.StringFunctions.changeCharacter(e, i, e.charAt(i) - 10 + 'A');
			}
			else
			{
			e = tangible.StringFunctions.changeCharacter(e, i, e.charAt(i) + '0');
			}
		   }
			for (j = 0;j <= i;j++)
			{
			 f = tangible.StringFunctions.changeCharacter(f, j, e.charAt(i - j - 1));
			}
			 f = tangible.StringFunctions.changeCharacter(f, i, '\0');
			 System.out.printf("%s",f);
			 System.in.read();
			 System.in.read();
	  }
	}



}


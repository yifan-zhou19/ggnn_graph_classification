package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int m;
	   int n;
	   int len;
	   int i;
	   int total = 0;
	   int t = 0;
	   String a = new String(new char[100]);
	   String b = new String(new char[100]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   n = Integer.parseInt(tempVar3);
	   }
	   len = a.length();
	   for (i = 0;i < len;i++)
	   {
		   if (a.charAt(i) <= '9' && a.charAt(i) >= '0')
		   {
			  total = total + (a.charAt(i) - '0') * Math.pow(m,len - 1 - i);
		   }
		   else
		   {
			  if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			  {
				   total = total + (a.charAt(i) - 'a' + 10) * Math.pow(m,len - 1 - i);
			  }
			  else
			  {
				   total = total + (a.charAt(i) - 'A' + 10) * Math.pow(m,len - 1 - i);
			  }
		   }
	   }
	   if (total == 0)
	   {
		   System.out.print("0\n");
	   }
	   else
	   {
		   for (i = 0;total != 0;i++)
		   {
		   b = tangible.StringFunctions.changeCharacter(b, i, total % n);
		   total = total / n;
		   t++;
		   if (b.charAt(i) <= 9)
		   {
			   b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + '0');
		   }
		   else
		   {
			   b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 'A' - 10);
		   }
		   }
	   for (i = t - 1;i >= 0;i--)
	   {
		  System.out.printf("%c",b.charAt(i));
	   }
	   System.out.print("\n");
	   }
	}
}


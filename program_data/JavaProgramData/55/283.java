package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int i;
	   int t = 0;
	   int j;
	   int c = 0;
	   String s = new String(new char[80]);
	   String a = new String(new char[80]);
	   final String b = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   s = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   m = Integer.parseInt(tempVar3);
	   }
	   for (i = 0;s.charAt(i) != '\0';i++)
	   {
			 for (j = 0;j < 37;j++)
			 {
				   if (s.charAt(i) == b.charAt(j) || (s.charAt(i) == b.charAt(j) + 32 && s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
				   {
					  t = t * n + j;
				   }
			 }
	   }
	   for (i = 79;i > 0;i--)
	   {
			  a = tangible.StringFunctions.changeCharacter(a, i, b.charAt(t % m));
			  c++;
			  t = t / m;
			  if (t == 0)
			  {
				 break;
			  }
	   }
	   for (i = 80 - c;i < 80;i++)
	   {
		   System.out.printf("%c",a.charAt(i));
	   }
		  return 0;
	}
}


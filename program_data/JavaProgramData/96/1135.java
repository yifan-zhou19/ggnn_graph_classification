package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100]);
		  String b = new String(new char[100]);
		  int c;
		  int len;
		  int d;
		  int e;
		  int[] f = new int[100];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = tempVar.charAt(0);
		 }
		 len = a.length();
		 if (len == 1)
		 {
			 System.out.print("0\n");
			 System.out.printf("%d",a.charAt(0) - '0');
		 }
		 else
		 {
		if (len == 2 && ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') < 13)
		{
			 System.out.print("0\n");
			 System.out.printf("%d",((a.charAt(0) - '0') * 10 + a.charAt(1) - '0'));
		}
		 else
		 {
		 for (c = 0;c <= len - 1;c++)
		 {
		 f[c] = a.charAt(c) - '0';
		 }
		 for (c = 0;c <= len - 2;c++)
		 {
		   d = f[c] / 13;
		   b = tangible.StringFunctions.changeCharacter(b, c, d + '0');
		   e = f[c] % 13;
		   f[c + 1] = f[c + 1] + e * 10;
		 }
		  d = f[len - 1] / 13;
		   b = tangible.StringFunctions.changeCharacter(b, len - 1, d + '0');
		   e = f[len - 1] % 13;
		  if (b.charAt(0) != '0')
		  {
		   System.out.printf("%s\n",b);
		  }
		  else
		  {
				  if (b.charAt(1) != '0')
				  {
				for (c = 0;c <= len - 1;c++)
				{
			 b = tangible.StringFunctions.changeCharacter(b, c, b.charAt(c + 1));
				}
			 b = b.substring(0, len - 1);
			System.out.printf("%s\n",b);
				  }
			else
			{
				for (c = 0;c <= len - 2;c++)
				{
			 b = tangible.StringFunctions.changeCharacter(b, c, b.charAt(c + 2));
				}
			 b = b.substring(0, len - 1);
			 b = b.substring(0, len - 2);
			System.out.printf("%s\n",b);
			}
			System.out.printf("%d",e);
		  }

		 }
		 }

	}

}


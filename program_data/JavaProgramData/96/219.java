package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int len;
	   int remain;
	   int num;
	   int size = 0;
	   String N = new String(new char[101]);
	   N = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   len = N.length();
	   remain = 0;
	   if (len == 1)
	   {
		   System.out.print(0);
		   System.out.print("\n");
		   System.out.print(N);
		   System.out.print("\n");
	   }
	   else if (len == 2 && N.charAt(0) == '1' && N.charAt(1) < '3')
	   {
				System.out.print(0);
				System.out.print("\n");
				System.out.print(N);
				System.out.print("\n");
	   }
	   else
	   {
		   for (i = 0;i < len;i++)
		   {
			  num = remain * 10 + N.charAt(i) - '0';
			  if (num < 13)
			  {
				  remain = num;
				  N = tangible.StringFunctions.changeCharacter(N, i, 0 + '0');
			  }
			  else
			  {
				  N = tangible.StringFunctions.changeCharacter(N, i, num / 13 + '0');
				  remain = num % 13;
			  }

		   }
		   for (i = 0;i < len;i++)
		   {
			  if (N.charAt(i) != '0')
			  {
				 size = i;
				 break;
			  }
		   }
		   for (i = size;i < len;i++)
		   {
		   System.out.print(N.charAt(i));
		   }
		   System.out.print("\n");
		   System.out.print(remain);
		   System.out.print("\n");
	   }
	  return 0;
	}

}


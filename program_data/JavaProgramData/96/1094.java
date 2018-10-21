package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		char c;
		int m;
		int i;
		int a;
		int b;
		int no;
		int d;
		no = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		a = str1.charAt(0) - 48;
		b = str1.length();
		d = str1.charAt(1) - 48;
		if (a < 2 && b == 2 && d < 3)
		{
			System.out.print("0");
		}
		if (a < 10 && b < 2)
		{
			System.out.printf("%c\n%d",'0',a);
		}
		else
		{
			for (i = 0;;i++)
			{
							  m = (str1.charAt(i) - 48) * 10 + (str1.charAt(i + 1) - 48);
							  str2 = tangible.StringFunctions.changeCharacter(str2, i, m / 13 + 48);
							  str1 = tangible.StringFunctions.changeCharacter(str1, i + 1, m % 13 + 48);
							  if (no == 1)
							  {
									   if (str2.charAt(i) != '0')
									   {
										   System.out.printf("%c",str2.charAt(i));
									   }
									   no = 0;
							  }
							  else
							  {
								  System.out.printf("%c",str2.charAt(i));
							  }
							  if (str1.charAt(i + 2) == '\0')
							  {
								  break;
							  }
			}

		 System.out.print("\n");
		 c = str1.charAt(i + 1);
	   //  if(c<10) printf("%c\n",c);
		  System.out.printf("%d\n",c - 48);
		}
		return 0;
	 }
}


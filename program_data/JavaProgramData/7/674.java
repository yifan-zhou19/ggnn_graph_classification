package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int a;
	   int b;
	   int c;
	   int d;
	   int e;
	   int sum = 0;
	   int m = 0;
	   int t = 0;
	   int p;
	   int q;
	   int flag = 0;
	   int flag2 = 0;
	   String str = new String(new char[256]);
	   String substr = new String(new char[256]);
	   String rep = new String(new char[256]);
	   String str1 = new String(new char[256]);
	   String str2 = new String(new char[256]);
	   str = new Scanner(System.in).nextLine();
	   substr = new Scanner(System.in).nextLine();
	   rep = new Scanner(System.in).nextLine();
	   a = str.length();
	   b = substr.length();
	   c = rep.length();
			for (m = m;m < a;m++)
			{
				if (str.charAt(m) == substr.charAt(0))
				{
					for (p = m,q = 0;q < b;p++,q++)
					{
						if (str.charAt(p) != substr.charAt(q))
						{
						flag = 1;
						}

					}
					if (flag == 1)
					{
										 flag = 0;

					continue;
					}
					else
					{
					  flag2 = 1;
					  break;
					}

				}
				else
				{
					continue;
				}
			}




	   if (flag2 == 1)
	   {

	   for (i = 0,d = 0;i < m,d < m;d++,i++)
	   {
		  str1 = tangible.StringFunctions.changeCharacter(str1, d, str.charAt(i));
	   }
	   str1 = tangible.StringFunctions.changeCharacter(str1, m, '\0');
	   for (i = m + b,e = 0;i < a,e < a - m - b;e++,i++)
	   {
		  str2 = tangible.StringFunctions.changeCharacter(str2, e, str.charAt(i));
	   }
	   str2 = tangible.StringFunctions.changeCharacter(str2, a - m - b, '\0');
	   System.out.printf("%s%s%s",str1,rep,str2);



	   }
	 else
	 {
		  System.out.printf("%s",str);
	 }

	return 0;
	}
}


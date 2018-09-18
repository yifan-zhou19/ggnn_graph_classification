package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 void match(char * ps, char * pf, int len);
		 final String a = "";
		 while (scanf("%s", a) == 1)
		 {
			  final String b = "";
		  tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		  tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
			  match(tempRef_a, tempRef_b, a.length());
			  b = tempRef_b.argValue;
			  a = tempRef_a.argValue;
		 }
		 return 0;
	}

	public static void match(tangible.RefObject<String> ps, tangible.RefObject<String> pf, int len)
	{
		 int i;
		 int flag;
		 int last;
		 int isleft;
		 int isright;
		 final String str = "";
		 final String strf = "";
		 strf = pf.argValue;
		 str = ps.argValue;
		 for (i = 0; i < len; i++)
		 {
			  if (*(str.Substring(i)) == '(')
			  {
				   *(strf.Substring(i)) = -1;
			  }
			  else if (*(str.Substring(i)) == ')')
			  {
				   *(strf.Substring(i)) = +1;
			  }
		 }

		 do
		 {
			  flag = 0;
			  last = 0;
			  isleft = 0;
			  isright = 0;
			  for (i = 0; i < len; i++)
			  {
				   if (*(strf.Substring(i)) == 1 && flag == 1)
				   {
						*(strf.Substring(i)) = 0;
						*(strf.Substring(last)) = 0;
						flag = 0;
						isleft = 1;
				   }
				   else if (*(strf.Substring(i)) == -1)
				   {
						flag = 1;
						last = i;
						isright = 1;
				   }
			  }
		 } while (isleft != 0 && isright != 0);
		 System.out.printf("%s\n", ps.argValue);
		 for (i = 0; i < len; i++)
		 {
			  if (*(strf.Substring(i)) == -1)
			  {
				   System.out.print("$");
			  }
			  else if (*(strf.Substring(i)) == +1)
			  {
				   System.out.print("?");
			  }
			  else
			  {
				   System.out.print(" ");
			  }
		 }
		 System.out.print("\n");
	}


}


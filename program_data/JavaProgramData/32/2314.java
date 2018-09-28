package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[200]);
	public static String b = new String(new char[200]);
	public static int alen;

	public static void init()
	{
		 int len1;
		 int len2;
		 int temp;
		 int i;
		 alen = len1 = a.length();
		 for (i = 0;i < (len1 + 1) / 2;i++)
		 {
			 temp = a.charAt(i);
			 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(len1 - i - 1));
			 a = tangible.StringFunctions.changeCharacter(a, len1 - i - 1, temp);
		 }
		 for (i = 0;i < len1;i++)
		 {
			 a.charAt(i) -= '0';
		 }
		 len2 = b.length();
		 for (i = 0;i < (len2 + 1) / 2;i++)
		 {
			 temp = b.charAt(i);
			 b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(len2 - i - 1));
			 b = tangible.StringFunctions.changeCharacter(b, len2 - i - 1, temp);
		 }
		 for (i = 0;i < len2;i++)
		 {
			 b.charAt(i) -= '0';
		 }
		 for (i = len2;i < len1;i++)
		 {
			 b = b.substring(0, i);
		 }
	}
	public static void minus()
	{
		 int p;
		 int len;
		 int tp;
		 p = 0;
		 while (p < alen)
		 {
			   if (a.charAt(p) >= b.charAt(p))
			   {
					a.charAt(p) -= b.charAt(p);
			   }
			   else if (a.charAt(p) < b.charAt(p))
			   {
					tp = p + 1;
					while (a.charAt(tp) == 0)
					{
						  a = tangible.StringFunctions.changeCharacter(a, tp, 9);
						  tp++;
					}
					a.charAt(tp)--;
					a = tangible.StringFunctions.changeCharacter(a, p, a.charAt(p) + 10 - b.charAt(p));
			   }
			   p++;
		 }
	}
	public static void output()
	{
		 int len;
		 int i;
		 int t;
		 while (a.charAt(alen) == 0)
		 {
			   if (alen == 0)
			   {
				  System.out.print(0);
				  System.out.print("\n");
				  return;
			   }
			   alen--;
		 }
		 for (i = alen;i >= 0;i--)
		 {
			 t = a.charAt(i);
			 System.out.print(t);
		 }
		 System.out.print("\n");
	}

	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			init();
			minus();
			output();
		}
	}

}


package <missing>;

public class GlobalMembers
{
	public static void reverse(int n, tangible.RefObject<String> p1, tangible.RefObject<String> p2)
	{
		 int i;
		 for (i = 0;i <= n - 1;i++)
		 {
			 *(p2.argValue.Substring(i)) = *(p1.argValue.Substring(n) - i - 1);
		 }
			 *(p2.argValue.Substring(n)) = '\0';
	}

	public static void recopy(int n, tangible.RefObject<String> p1, tangible.RefObject<String> p2)
	{
		 int i;
		 for (i = 0;i <= n - 1;i++)
		 {
			 *(p2.argValue.Substring(i)) = *(p1.argValue.Substring(i));
		 }
			 *(p2.argValue.Substring(n)) = '\0';
	}

	public static void process(tangible.RefObject<String> p)
	{
		 int i;
		 int j;
		 String b = new String(new char[p.argValue.length() + 1]);
		 String c = new String(new char[p.argValue.length() + 1]);
		 for (i = 2;i <= p.argValue.length();i++)
		 {
			 for (j = 1;j <= p.argValue.length() - i + 1;j++)
			 {
		 tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
			 reverse(i, p.argValue.Substring(j) - 1, tempRef_b);
			 b = tempRef_b.argValue;
		 tangible.RefObject<String> tempRef_c = new tangible.RefObject<String>(c);
			 recopy(i, p.argValue.Substring(j) - 1, tempRef_c);
			 c = tempRef_c.argValue;
			 if (strcmp(b,c) == 0)
			 {
			 System.out.printf("%s\n",c);
			 }
			 }
		 }
	}



	public static void Main(String[] args)
	{
	  String a = new String(new char[500]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  String p;
	  p = a;
  tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
	  process(tempRef_p);
	  p = tempRef_p.argValue;
	}

}


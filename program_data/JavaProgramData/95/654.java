package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	int la;
	int lb;
	int i;
	int sa = 0;
	int sb = 0;
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	la = a.length();
	lb = b.length();
	for (i = 0;i < la;i++)
	{
	   if (a.charAt(i) > 96 && a.charAt(i) < 123)
	   {
		   sa += a.charAt(i);
	   }
	   else if (a.charAt(i) > 64 && a.charAt(i) < 91)
	   {
		   sa += a.charAt(i) + 32;
	   }
	}
	for (i = 0;i < lb;i++)
	{
	   if (b.charAt(i) > 96 && b.charAt(i) < 123)
	   {
		   sb += b.charAt(i);
	   }
	   else if (b.charAt(i) > 64 && b.charAt(i) < 91)
	   {
		   sb += b.charAt(i) + 32;
	   }
	}
	if (sa > sb)
	{
		System.out.print(">");
	}
	else if (sa < sb)
	{
		System.out.print("<");
	}
	else
	{
		System.out.print("=");
	}
	}

}

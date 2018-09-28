package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   final String a = "\0";
	   final String b = "\0";
	   String p;
	   String q;
	   int change = char * w;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   b = tempVar2.charAt(0);
	   }
	   if (a.length() != b.length())
	   {
		   System.out.print("NO");
		   return 0;
	   }
   tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	   change(tempRef_a);
	   a = tempRef_a.argValue;
   tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
	   change(tempRef_b);
	   b = tempRef_b.argValue;
	   for (p = a,q = b; p != '\0';p++,q++)
	   {
		   if (p != q)
		   {
			   System.out.print("NO");
			   return 0;
		   }

	   }
	   System.out.print("YES");

		  return 1;
	}
	public static int judge(tangible.RefObject<Integer> w, int i, tangible.RefObject<Integer> p)
	{


	return 0;
	}
	public static int change(tangible.RefObject<String> w)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * pi = w.argValue;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * qi;
	 char s;
	 for (; * (pi + 1) != '\0';pi++)
	 {
		 for (qi = pi + 1; * qi != '\0';qi++)
		 {
			 if (*qi > *pi)
			 {
				 s = qi;
				 *qi = pi;
				 *pi = s;
			 }
		 }
	 }
	return 0;
	}
}


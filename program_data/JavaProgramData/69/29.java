package <missing>;

public class GlobalMembers
{
	///#include <string.h>
	public static String strrev(tangible.RefObject<String> a)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * end;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * beg = a.argValue;
		 char temp;
		 for (end = a.argValue; * end; end++)
		 {
			 ;
		 }
		 for (end--;beg < end;)
		 {
			temp = beg;
			*beg = end;
			*end = temp;
			beg++;
			end--;
		 }
		return a.argValue;
	}
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
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

	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		strrev(tempRef_a);
		a = tempRef_a.argValue;
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		strrev(tempRef_b);
		b = tempRef_b.argValue;

		for (p = a; * p; p++)
		{
			*p = p - '0';
		}
		for (;p < a.Substring(500);p++)
		{
			*p = 0;
		}
		for (p = b; * p; p++)
		{
			*p = p - '0';
		}
		for (;p < b.Substring(500);p++)
		{
			*p = 0;
		}
		int i;
		for (i = 0; i < 500; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + b.charAt(i));
			a.charAt(i + 1) += a.charAt(i) / 10;
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) % 10);
		}

		for (p = a.Substring(400); * p == 0 && p >= a; p--)
		{
			;
		}
		if (p < a)
		{
		System.out.print("0");
		}
		for (;p >= a; p--)
		{
			System.out.printf("%d",(int) * p);
		}
		System.out.print("\n");
		//scanf("%s",a);
		return 0;
	}

}


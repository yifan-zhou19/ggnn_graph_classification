package <missing>;

public class GlobalMembers
{
	public static void func(tangible.RefObject<String> a)
	{
		int lena = a.argValue.length();
		int i;
		int flag = 0;
		for (i = 0;i < lena;i++)
		{
			if (flag == 0)
			{
			  a.argValue.charAt(i) = a.argValue.charAt(i) + a.argValue.charAt(i) - '0';
			}
			else
			{
			  a.argValue.charAt(i) = a.argValue.charAt(i) + a.argValue.charAt(i) + 1 - '0';
			}
			if (a.argValue.charAt(i) > '9')
			{
				  a.argValue.charAt(i) -= 10;
				  flag = 1;
			}
			else
			{
				flag = 0;
			}
		}
		if (flag == 1)
		{
		  a.argValue.charAt(i) = '1';
		  a.argValue.charAt(i + 1) = '\0';
		}
	}
	public static int Main()
	{
	   String a = new String(new char[N]);
	   int n;
	   int i;
	   int len;
	   a = tangible.StringFunctions.changeCharacter(a, 0, '1');
	   a = tangible.StringFunctions.changeCharacter(a, 1, '\0');
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
   tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	   func(tempRef_a);
	   a = tempRef_a.argValue;
	   }
	   len = a.length();
	   for (i = len - 1;i >= 0;i--)
	   {
	   System.out.printf("%c",a.charAt(i));
	   }
	}
}


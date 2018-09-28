package <missing>;

public class GlobalMembers
{
	public static int pd(tangible.RefObject<String> m)
	{
		if (m.argValue >= '0' && m.argValue <= '9')
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		for (a = p; * a != '\0';a++)
		{
	   tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		   if (pd(tempRef_a) != 0)
		   {
			   a = tempRef_a.argValue;
			   System.out.printf("%c",*a);
		   }
		   else
		   {
			   a = tempRef_a.argValue;
		   tangible.RefObject<String> tempRef_a2 = new tangible.RefObject<String>(a);
			   if (pd(a - 1) != 0 && (pd(tempRef_a2) != 1))
			   {
				   a = tempRef_a2.argValue;
				   System.out.print("\n");
			   }
			   else
			   {
				   a = tempRef_a2.argValue;
			   }
		   }
		}
	}

}


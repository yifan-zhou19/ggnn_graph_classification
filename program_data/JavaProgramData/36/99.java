package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int judge = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * b;
		String c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(30);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(39);
		c = b;
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
		if (b.length() != a.length())
		{
			System.out.print("NO\n");
		}
		else
		{
			 for (; * a;a++)
			 {
			 for (b = c,judge = 0; * b;b++)
			 {

				if (*a == *b)
				{
					judge = 1;
					*b = ' ';
					break;
				}
			 }

			 if (judge == 1)
			 {
				 continue;
			 }
			 if (judge == 0)
			 {
				 System.out.print("NO\n");
				 break;
			 }
			 }
			 if (judge == 1)
			 {
				 System.out.print("YES\n");
			 }
		}
		return 0;
	}

}


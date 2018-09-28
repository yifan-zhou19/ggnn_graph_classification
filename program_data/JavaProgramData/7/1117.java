package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[257]);
		String str2 = new String(new char[257]);
		String str3 = new String(new char[257]);
		int i;
		int b;
		int c;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			str3 = tempVar3.charAt(0);
		}

		b = str2.length();

		p = tangible.StringFunctions.strStr(str1,str2);

		if (p != null)

		{
			for (i = 0;str1.Substring(i) < p;i++)
			{
				System.out.printf("%c",str1.charAt(i));
			}
			System.out.printf("%s",str3);

			p = p + b;

			System.out.printf("%s",p);

		}

		else
		{
			System.out.printf("%s",str1);
		}
	}
}


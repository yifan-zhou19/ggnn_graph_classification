package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int position;
		int i;
		int lena;
		int lenb;
		int n = 10;
		String a = new String(new char[10]);
		String b = new String(new char[4]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		char max;
		while (n-- != 0)
		{
			max = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,'\0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,'\0',(Character.SIZE / Byte.SIZE));
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			lena = a.length();
			lenb = b.length();
			p = a.charAt(0);
			for (i = 0;i < lena;i++)
			{
				if (*p > max)
				{
					max = p;
					position = i;
				}
				p += 1;
			}
			for (i = 0;i <= position;i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print(b);
			for (i = position + 1;i < lena;i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}


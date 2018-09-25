package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
		int c;
		int f;

		String str = new String(new char[20]);
		String substr = new String(new char[10]);
		String de = new String(new char[20]);
		char max;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		String t;
		while (scanf("%s%s",str,substr) != EOF)
		{
			n = str.length();
			m = substr.length();
			max = 0;
			for (p = str;p < (str.Substring(n));p++)
			{
			   if (*p > max)
			   {
			   max = p;
			   t = p;
			   }
			}
			//t=&max;
			for (p = str,i = 0;p < (t.Substring(1));p++)
			{
			  de = tangible.StringFunctions.changeCharacter(de, i++, *p);
			}
			for (c = i,q = substr;q < (substr.Substring(m));q++)
			{
			  de = tangible.StringFunctions.changeCharacter(de, c++, *q);
			}
			for (p = (t.Substring(1)),f = c;p < (str.Substring(n));p++)
			{
			  de = tangible.StringFunctions.changeCharacter(de, f++, *p);
			}
			for (q = de;q < (f + de);q++)
			{
			System.out.printf("%c",*q);
			}
			System.out.print("\n");
		}
	}
}


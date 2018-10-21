package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str;
		String substr;
		String newstr;
		int i;
		int j;
		int p;
		int q;
		int a;
		int b = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(11 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		substr = (String)malloc(4 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		newstr = (String)calloc(30,(Character.SIZE / Byte.SIZE));
		while (scanf("%s %s",str,substr) != EOF)
		{
		p = str.length();
		q = substr.length();
		a = str;
		for (i = 1;i < p;i++)
		{
			if (*(str.Substring(i)) > a)
			{
				a = (str.Substring(i));
				b = i;
			}
		}

		for (i = 0;i <= b;i++)
		{
			*(newstr.Substring(i)) = *(str.Substring(i));
		}
		for (i = b + 1,j = 0;j < q;i++,j++)
		{
			*(newstr.Substring(i)) = *(substr.Substring(j));
		}
		for (i = b + q + 1,j = b + 1;j < p;i++,j++)
		{
			*(newstr.Substring(i)) = *(str.Substring(j));
		}

		for (i = 0;i < p + q;i++)
		{
			System.out.printf("%c",*(newstr.Substring(i)));
		}
		System.out.print("\n");
		}
	}
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[5]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int l = a.length();
		String p;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(l * (Character.SIZE / Byte.SIZE));
			p = a;
		int i;
		for (i = 1;i <= l / 2;i++)
		{
			char b;
			b = (p.Substring(i) - 1);
			*(p.Substring(i) - 1) = *(p.Substring(l) - i);
			*(p.Substring(l) - i) = b;
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
	}

}


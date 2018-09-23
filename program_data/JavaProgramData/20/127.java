package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10]);
		String b = new String(new char[3]);
		char c;
		char max;
	int j;
	int t;
	int l;

		while (scanf("%s",a) != EOF)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		l = a.length();
		max = a.charAt(0);
		for (j = 0;j <= l - 1;j++)
		{
		if ((int)a.charAt(j) > (int)max)
		{
			max = a.charAt(j);
		t = j;
		}
		}
		for (j = 0;j <= t;j++)
		{
			System.out.printf("%c",a.charAt(j));
		}
		System.out.printf("%s",b);
		for (j = t + 1;j <= l - 1;j++)
		{
			System.out.printf("%c",a.charAt(j));
		}
		System.out.print("\n");
		}
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while ((c = System.in.read()) != EOF)
		{
			;
		}
	}





}


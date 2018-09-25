package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		int p = 0;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0'};
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m = a.length();
		for (i = 0,j = 0,p = a[0];i < m;i++)
		{
			if (p < a[i])
			{
				j = i;
				p = a[i];
			}
		}
		for (i = 0;i <= j;i++)
		{
			System.out.printf("%c",a[i]);
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%c",b[i]);
		}
		for (i = j + 1;i < m;i++)
		{
			System.out.printf("%c",a[i]);
		}
		System.out.print("\n");
		for (i = 0;i < m;i++)
		{
			a[i] = '\0';
		}
		for (i = 0;i < 3;i++)
		{
			b[i] = '\0';
		}
		if (System.in.read() != EOF)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto loop;
		}
	}
}


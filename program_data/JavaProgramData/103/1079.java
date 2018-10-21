package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int b = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int c = a.length();
		int i;
		for (i = 0; (a[i] = Character.toUpperCase(a.charAt(i))) != 0;i++)
		{
			;
		}
		i = 0;
		while (i < c)
		{
		 if (a.charAt(i) == a.charAt(i + 1))
		 {
			  b++;
		 }
		 else
		 {
			  System.out.printf("(%c,%d)",a.charAt(i),b);
		 b = 1;
		 }
		 i++;
		}
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String a = new String(new char[1100]);
		char h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;a.charAt(i) != '\0';)
		{
			for (n = 0,h = a.charAt(i),j = i;a.charAt(j) == h || (a.charAt(j) - h) == ('A'-'a') || (h - a.charAt(j)) == ('A'-'a');j++)
			{
			n = n + 1;
			}
			if (h < 'Z')
			{
			System.out.printf("(%c,%d)",h,n);
			}
			else
			{
			System.out.printf("(%c,%d)",(h - ('a'-'A')),n);
			}
			i = j;
		}
		System.in.read();
		System.in.read();
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String n = new String(new char[32]);
		int a;
		int b;
		int c;
		int d;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (l = 1;l <= k;l++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		b = n.length();
		if (n.charAt(b - 1) == 'g')
		{
			b = b - 3;
		}
		if (n.charAt(b - 1) == 'y')
		{
			b = b - 2;
		}
		if (n.charAt(b - 1) == 'r')
		{
			b = b - 2;
		}
		for (i = 0;i < b;i++)
		{
			System.out.printf("%c",n.charAt(i));
		}
			System.out.print("\n");
		}
		return 0;
	}






}


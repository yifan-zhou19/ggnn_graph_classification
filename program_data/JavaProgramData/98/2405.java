package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d = 0;
		int e;
		int f;
		int g;
		String s = new String(new char[45]);
		String t = new String(new char[45]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		System.out.printf("%s",s);
		d = s.length();
		for (b = 1;b < a;b++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s = tempVar3.charAt(0);
			}
			c = s.length();
			d = d + c + 1;
			if (d > 80)
			{
				System.out.print("\n");
				System.out.printf("%s",s);
				d = s.length();
			}
			else
			{

			System.out.print(" ");
			System.out.printf("%s",s);
			}
		}
	}



}


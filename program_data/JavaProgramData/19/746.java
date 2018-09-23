package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		String max;
		String min;
		String s = new String(new char[110]);
		String a = new String(new char[110]);
		String b = new String(new char[110]);
		int l = 0;
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		p = tangible.StringFunctions.strTok(s," ");

		while (p != null)
		{
			if (l != 0)
			{
				System.out.print(" ");
			}
			if (strcmp(p,a) == 0)
			{
				p = b;
			}
			System.out.printf("%s",p);
			p = tangible.StringFunctions.strTok(null," ");
			l++;
		}
		System.out.print("\n");



		return 0;
	}




}


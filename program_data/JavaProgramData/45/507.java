package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		String p1;
		String p2;
		String p;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		p1 = s;
		p2 = w;
		p = tangible.StringFunctions.strStr(p2,p1);

		for (i = 0;i < 50;i++)
		{
			if (p == w.charAt(i))
			{
				System.out.printf("%d",i);
				break;
			}
		}
	}




}


package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
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
		int i;
		int j;
		int s;
		s = (int)b.length();
		for (i = 0;i < s;i++)
		{
			if ((b.charAt(i) == a.charAt(0)) && (b.charAt(i + 1) == a.charAt(1)))
			{
				System.out.printf("%d",i);
				break;
			}
		}
	}


}


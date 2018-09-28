package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int q;
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		scanf(" ");
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		q = a.length();
		w = b.length();
		for (i = 0;i < w;i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				break;
			}
		}
		System.out.printf("%d",i);
	}

}


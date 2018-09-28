package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	final String s = " ";
	final String w = " ";
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		w = tempVar2.charAt(0);
	}
	int a = s.length();
	int b = w.length();
	int i;
	int t = 0;
	if (a == 1)
	{
	for (i = 0;i < b;i++)
	{
		if (w.charAt(i) == s.charAt(0))
		{

			System.out.printf("%d",i);
			break;
		}
	}
	}
	if (a == 2)
	{
	for (i = 0;i < b;i++)
	{
		if (w.charAt(i) == s.charAt(0))
		{
			if (w.charAt(i + 1) == s.charAt(1))
			{
			System.out.printf("%d",i);
			break;
			}
		}
	}
	}
	if (a >= 3)
	{
		t = 1;
	for (i = 0;i < b;i++)
	{
		if (w.charAt(i) == s.charAt(0))
		{
			if (w.charAt(i + 1) == s.charAt(1))
			{
				if (w.charAt(i + 2) == s.charAt(2))
				{
			System.out.printf("%d",i);
			break;
				}
			}
		}
	}
	}



	//printf("%d",t);	
	return 0;
	}


}


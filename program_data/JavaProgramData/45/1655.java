package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[50]);
	String w = new String(new char[50]);

	int i;
	int n;
	int j;
	int flag = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		w = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}


	for (i = 0; i + 1 <= (s.length()); i++,flag = 0)
	{
		for (n = 0,j = i;w.charAt(n) != '\0';n++,j++)
		{
			if (s.charAt(j) != w.charAt(n))
			{
			flag = 1;
			break;
			}
		}
		if (flag != 0)
		{
			continue;
		}
		else
		{
			System.out.printf("%d",i);
			break;
		}
	}
	return 0;
	}
}


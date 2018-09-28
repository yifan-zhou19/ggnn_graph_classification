package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String w = new String(new char[100]);
		String temp = new String(new char[100]);
		int n;
		int i;
		int j;
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
		n = s.length();
		for (i = 0; * (w.Substring(i)) != '\0';i++)
		{
			for (j = 0;j < n;j++)
			{
				*(temp.Substring(j)) = *(w.Substring(j) + i);
			}
			*(temp.Substring(j)) = '\0';
			if (strcmp(temp,s) == 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;
	}

}


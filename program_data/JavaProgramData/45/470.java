package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c1 = new String(new char[100]);
		String c2 = new String(new char[100]);
		String p;
		String pc1;
		String pc2;
		int i;
		int j;
		int k;
		int n = 0;
		int m;
		pc1 = c1;
		pc2 = c2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}
		p = tangible.StringFunctions.strStr(c2,c1);
		for (i = 0; * (pc2.Substring(i)) != '\0';i++)
		{
			if ((pc2.Substring(i)) == p)
			{
				break;
			}
		}
		System.out.printf("%d",i);
	}

}


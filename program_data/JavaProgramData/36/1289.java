package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int la;
		int lb;
		int i;
		int j;
		int count = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		la = a.length();
		lb = b.length();
		if (la != lb)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < la;i++)
			{
				for (j = 0;j < lb;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{

						b = tangible.StringFunctions.changeCharacter(b, j, j);
						count++;
						break;
					}
				}
			}
			if (count == la)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}


	}
}


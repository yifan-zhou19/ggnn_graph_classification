package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l1;
		int l2;
		int word;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
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
		l1 = a.length();
		l2 = b.length();
		for (i = 0;i <= l2 - l1;i++)
		{
			for (j = 0;j < l1;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, b.charAt(j + i));
			}
			for (k = 0;k < l1;k++)
			{

				if (c.charAt(k) == a.charAt(k))
				{
					word = 1;
					continue;
				}
				else
				{
					word = 0;
					break;
				}

			}
			if (word == 1)
			{
				System.out.printf("%d",i);
				break;
			}
		}
	}



}


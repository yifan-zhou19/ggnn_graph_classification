package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		char s;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (i = 0;str.charAt(i) != '\0';)
		{
			if (str.charAt(i) > 64 && str.charAt(i) < 91)
			{
				s = str.charAt(i);
			}
			else
			{
				s = str.charAt(i) - 32;
			}
			for (j = 0;;i++)
			{
				if (str.charAt(i) != s && (str.charAt(i) - 32) != s)
				{
					break;
				}
				j++;
			}
			System.out.printf("(%c,%d)",s,j);
		}
	}

}


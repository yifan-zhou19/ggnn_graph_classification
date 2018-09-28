package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		String w = new String(new char[100]);
		String p;
		int i;
		int bl;
		int j = 0;
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
		p = s;
		do
		{
			bl = 1;
			for (i = 0;i < s.length() - 1;i++)
			{
				if (*(p.Substring(i)) != *(w.Substring(i) + j))
				{
					bl = 0;
				}
			}
			if (bl != 0)
			{
				System.out.printf("%d\n",j);
				break;
			}
			else
			{
				j++;
			}
		} while (p < s + w.length());
	}
}


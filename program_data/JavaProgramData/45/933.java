package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int lens;
		int lenw;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
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
		lens = s.length();
		lenw = w.length();
		int k = 0;
		int j = 0;
		int i = 0;
		for (;;i++)
		{
			if (k == 0 && s.charAt(j) == w.charAt(i))
			{
				if (lens == 1)
				{
					System.out.print("0\n");
					break;
				}
				else
				{
					k++;
					j++;
				}
			}
			else if (k != 0 && s.charAt(j) != w.charAt(i))
			{
				k = 0;
				j = 0;
			}
			else if (k != 0 && s.charAt(j) == w.charAt(i))
			{
				if (j == lens - 1)
				{
					System.out.printf("%d\n",i - j);
					break;
				}
				else
				{
					k++;
					j++;
				}
			}
		}
		return 0;
	}


}


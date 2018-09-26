package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		int i;
		int k = 1;
		int[] t = new int[20];
		int j;
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
		if ((a.length()) != (b.length()))
		{
			k = 0;
		}
		else
		{
			for (j = 0;j < a.length();j++)
			{
				for (i = 0;i < a.length();i++)
				{
					if (a.charAt(j) == b.charAt(i))
					{
						b = b.substring(0, i);
						t[j] = 1;
						break;
					}
					if (t[j] == 1)
					{
						break;
					}
				}
			}
		}
		for (j = 0;j < a.length();j++)
		{
			if (t[j] == 0)
			{
				k = 0;
				break;
			}
		}
		if (k == 1)
		{
			System.out.print("YES");
		}
		if (k == 0)
		{
			System.out.print("NO");
		}
	}





}


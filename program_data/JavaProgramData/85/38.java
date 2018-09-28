package <missing>;

public class GlobalMembers
{
	public static int first(char p)
	{
		int z = 0;
		if (p == '_' || (p >= 'a' && p <= 'z') || (p >= 'A' && p <= 'Z'))
		{
			z = 1;
		}
		return z;
	}

	public static int behind(char p)
	{
		int z = 0;
		if (p == '_' || (p >= 'a' && p <= 'z') || (p >= 'A' && p <= 'Z') || p == '0' || (p >= '1' && p <= '9'))
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
		return z;
	}

	public static int Main()
	{
		String p;
		int[] tf;
		int n;
		int i;
		int j;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc((Integer.SIZE / Byte.SIZE) * 25);
		tf = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = tempVar2.charAt(0);
			}
			len = p.length();
			tf[i] = 1;
			if (first(p.charAt(0)) == 0)
			{
				tf[i] = 0;
				continue;
			}
			for (j = 1;j < len;j++)
			{
				if (behind(p.charAt(j)) == 0)
				{
					tf[i] = 0;
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (tf[i] == 0)
			{
				System.out.print("no\n");
			}
			if (tf[i] == 1)
			{
				System.out.print("yes\n");
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
		return 0;
	}

}


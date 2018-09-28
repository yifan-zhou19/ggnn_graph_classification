package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int cont = 0;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		for (i = 0;s1.charAt(i) != '\0';)
		{
			i++;
		}
		for (k = 0;s2.charAt(k) != '\0';)
		{
			k++;
		}
		if (i != k)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < k;i++)
			{
				for (j = 0;j < k;j++)
				{
					if (s1.charAt(i) == s2.charAt(j))
					{
						cont++;
						break;
					}
				}
			}
			if (cont == k)
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


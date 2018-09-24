package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int z;
		int p;
		int q;
		int i;
		int j;
		int s;
		int h;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (z = 0;z < n;z++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			p = a.length();
			q = b.length();
			for (i = p - 1,j = q - 1;i >= 0;i--,j--)
			{
				if (j >= 0)
				{
					if (*(a.Substring(i)) >= *(b.Substring(j)))
					{
						*(a.Substring(i)) = *(a.Substring(i)) - *(b.Substring(j)) + 48;
					}
					else
					{
						*(a.Substring(i)) = *(a.Substring(i)) - *(b.Substring(j)) + 58;
						*(a.Substring(i) - 1) = *(a.Substring(i) - 1) - 1;
					}
				}
				else
				{
					if (*(a.Substring(i)) < '0')
					{
						*(a.Substring(i)) = *(a.Substring(i)) + 10 + 48;
						*(a.Substring(i) - 1) = *(a.Substring(i) - 1) - 1;
					}
					else
					{
						break;
					}
				}
			}
				for (s = 0;s < p;s++)
				{
					if (*(a.Substring(s)) != '0')
					{
						for (h = s;h < p;h++)
						{
							System.out.printf("%d",*(a.Substring(h)) - 48);
						}
					break;
					}
				}
				System.out.print("\n");
		}
	}
}


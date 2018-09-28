package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		int k;
		int p = 0;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		for (i = 0;w.charAt(i) != '\0';i++)
		{
			if (w.charAt(i) == s.charAt(0))
			{
				for (k = i + 1,j = 1;s.charAt(j) != '\0';j++,k++)
				{
					if (w.charAt(k) == s.charAt(j))
					{
						p = 1;
						m = i;
					}
					else
					{
						break;
						p = 0;
					}
				}
			}
			if (p == 1)
			{
				System.out.printf("%d",m);
				break;
			}
		}




	}


}


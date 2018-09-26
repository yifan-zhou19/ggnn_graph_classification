package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[50]);
		String t = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			t = tempVar2.charAt(0);
		}
		int i;
		int j;
		int k = 0;
		for (i = 0;i < 50;i++)
		{
			if (s.charAt(0) == t.charAt(i))
			{
				for (j = i;j < 50;j++)
				{
					if (s[k++] = s.charAt(j) || s.charAt(k) != '\0')
					{
						System.out.printf("%d\n",i);
						break;
					}
				}
			}
		}
	}
}


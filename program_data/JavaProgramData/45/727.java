package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		int n;
		int i;
		int j;
		int length1;
		int length2;
		int k;
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		length1 = s1.length();
		length2 = s2.length();
		for (i = 0;i < length2;i++)
		{
			if (s1.charAt(0) == s2.charAt(i))
			{
				j = 0;
				while (s2.charAt(j + i) == s1.charAt(j) && j < length1)
				{
					j++;
				}
				if (j == length1)
				{
					k = i;
				}
			}
			if (k != 0)
			{
				break;
			}
		}
			System.out.printf("%d",k);

	}
}


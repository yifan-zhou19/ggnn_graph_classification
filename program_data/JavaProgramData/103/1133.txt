package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[MAX]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct code
	//	{
	//		char c;
	//		int n;
	//	}
	//	t[MAX];
		int len;
		int i;
		int j;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
			{
				s.charAt(i) -= 32;
			}
		}

		j = 0;
		k = 0;
		while (j < len)
		{
			t[k].c = s.charAt(j);
			for (i = j;;i++)
			{
				if (t[k].c != s.charAt(i))
				{
					t[k].n = i - j;
					j = i;
					k++;
					break;
				}
			}
		}

		for (i = 0;i < k;i++)
		{
			System.out.printf("(%c,%d)",t[i].c,t[i].n);
		}
		System.out.print("\n");
	}

}


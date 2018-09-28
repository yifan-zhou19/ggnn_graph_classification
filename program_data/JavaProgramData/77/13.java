package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char boy;
		char girl;
		String p = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = tempVar.charAt(0);
		}

		boy = p.charAt(0);
		int i;
		int j;
		int k = 0;
		for (i = 1; i < p.length(); i++)
		{
			if (p.charAt(i) != boy)
			{
				girl = p.charAt(i);
				break;
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int id;
	//		char c;
	//	}
	//	a[100], t;

		for (i = 0; i < p.length(); i++)
		{
			a[i].id = i;
			a[i].c = p.charAt(i);
		}

		for (i = 0; i < p.length() - k; i++)
		{
			if (a[i].c == boy && a[i + 1].c == girl)
			{
				System.out.printf("%d %d\n", a[i].id, a[i + 1].id);
				k += 2;
				for (j = i; j < p.length() - k; j++)
				{
					a[j] = a[j + 2];
				}
				i = -1;
			}
		}

		return 0;
	}

}


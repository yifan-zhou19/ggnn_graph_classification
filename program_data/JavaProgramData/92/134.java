package <missing>;

public class GlobalMembers
{
	public static int cmp(Object elem1, Object elem2)
	{
		return ((int)elem1) - ((int)elem2);
	}

	public static int cmpr(Object elem1, Object elem2)
	{
		return ((int)elem2) - ((int)elem1);
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int count;
		int[] king_h = new int[MAXSIZE];
		int[] general_h = new int[MAXSIZE];
		String king_f = new String(new char[MAXSIZE]);
		String general_f = new String(new char[MAXSIZE]);
		while (scanf("%d", n) != -1)
		{
			if (n == 0)
			{
				break;
			}
			for (i = 0; i < n; ++i)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					general_h[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0; i < n; ++i)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					king_h[i] = Integer.parseInt(tempVar2);
				}
			}
			qsort(general_h, n, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(king_h, n, (Integer.SIZE / Byte.SIZE), cmpr);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(king_f, 0, (Character.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(general_f, 0, (Character.SIZE / Byte.SIZE) * n);
			count = 0;
			for (i = 0; i < n; ++i)
			{
				for (j = 0; j < n; ++j)
				{
					if (king_f.charAt(j) == 0 && general_h[i] > king_h[j])
					{
						king_f = tangible.StringFunctions.changeCharacter(king_f, j, 1);
						general_f = tangible.StringFunctions.changeCharacter(general_f, i, 1);
						++count;
						break;
					}
				}
			}
			for (i = n - 1; i >= 0; --i)
			{
				if (general_f.charAt(i) == 1)
				{
					continue;
				}
				for (j = 0; j < n; ++j)
				{
					if (king_f.charAt(j) == 0 && king_h[j] == general_h[i])
					{
						king_f = tangible.StringFunctions.changeCharacter(king_f, j, 1);
						general_f = tangible.StringFunctions.changeCharacter(general_f, i, 1);
						break;
					}
				}
			}
			for (i = 0; i < n; ++i)
			{
				if (general_f.charAt(i) == 0)
				{
					--count;
				}
			}
			System.out.printf("%d\n", count * 200);
		}
		return 0;
	}

}


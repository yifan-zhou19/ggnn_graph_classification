package <missing>;

public class GlobalMembers
{
	public static int strpos(tangible.RefObject<String> s, tangible.RefObject<String> t)
	{
		int len_s = s.argValue.length();
		int len_t = t.argValue.length();

		int[] next = new int[50];
		next[1] = 0;
		int i;
		int j;
		for (i = 2; i < len_t; i++)
		{
			j = next[i - 1];
			while ((t.argValue.charAt(j) != t.argValue.charAt(i - 1)) && (j > 0))
			{
				j = next[j];
			}
			if (j == 0)
			{
				if (t.argValue.charAt(j) == t.argValue.charAt(i - 1))
				{
					next[i] = j + 1;
				}
				else
				{
					next[i] = j;
				}
			}
			else
			{
				next[i] = j + 1;
			}
		}

	//    for (i=0; i<len_t; i++) printf("%d %d\n",i,next[i]);
	//	printf("\n");


		i = 0;
		j = 0;
		int pos = 0;
		while (pos <= len_s - len_t)
		{
	//		printf("Begin %d %d\n",i,j);
			while ((i < len_s) && (j < len_t) && (s.argValue.charAt(i) == t.argValue.charAt(j)))
			{
				i++;
				j++;
			}
	//		printf("Middle %d %d\n",i,j);
			if (j == len_t)
			{
				return pos;
			}
			else if (j == 0)
			{
						i++;
						pos = i;
			}
					else
					{
						j = next[j];
						pos = i - j;
					}
	//		printf("End %d %d\n\n",i,j);
		}

		return -1;

	}

	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
	tangible.RefObject<String> tempRef_w = new tangible.RefObject<String>(w);
	tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
		System.out.printf("%d\n",strpos(tempRef_w, tempRef_s));
		s = tempRef_s.argValue;
		w = tempRef_w.argValue;
		return 0;
	}
}


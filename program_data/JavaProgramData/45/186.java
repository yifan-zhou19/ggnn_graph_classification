package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[10000]);
		String w = new String(new char[10000]);
		int i;
		int j;
		int k;
		int[] next = new int[10000];
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
		int ls = s.length();
		int lw = w.length();
		//KMP???s?w???
		//??s?next??
		next[0] = -1;
		j = 0;
		k = -1;
		while (j <= ls)
		{
			if (k == -1 || s.charAt(j) == s.charAt(k))
			{
				j++;
				k++;
				next[j] = k;
			}
			else
			{
				k = next[k];
			}
		}
		//??????
		i = 0;
		j = 0;
		while (i < lw)
		{
			if ((j == -1) || w.charAt(i) == s.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				j = next[j];
			}
			if (j >= ls)
			{
				break;
			}
		}
		System.out.printf("%d", i - ls);
	}

}


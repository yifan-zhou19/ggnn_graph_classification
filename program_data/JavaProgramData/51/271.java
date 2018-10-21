//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public String str = new String(new char[10]);
	public int count;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] ngram = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(500);
	public static void Main()
	{
		int n;
		int m;
		int len;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[510]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		len = s.length();
		m = len - n + 1;
		for (i = 0;i < len - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				ngram[i].str = tangible.StringFunctions.changeCharacter(ngram[i].str, j, s.charAt(i + j));
			}
		}
		for (i = 0;i < m;i++)
		{
			ngram[i].count = 1;
		}
		for (i = 0;i < m;i++)
		{
			for (j = i + 1;j < m;j++)
			{
				if (strcmp(ngram[i].str,ngram[j].str) == 0)
				{
					ngram[i].count++;
					ngram[j].count = 0;
				}
			}
		}
		int max = 1;
		for (i = 0;i < m;i++)
		{
			if (ngram[i].count > max)
			{
				max = ngram[i].count;
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			i = 0;
		while (ngram[i].count != max)
		{
			i++;
		}
		System.out.printf("%d\n",max);
		System.out.printf("%s\n",ngram[i].str);
		for (i++;i < m;i++)
		{
			if (ngram[i].count == max)
			{
				System.out.printf("%s\n",ngram[i].str);
			}
		}
		}

	}


}


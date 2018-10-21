public class book
{
	public int num;
	public String author = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] shu = tangible.Arrays.initializeWithDefaultbookInstances(999);

	public static void Main(String[] args)
	{
		int m;
		int b;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		char c;
		int[] writer = new int[26];
		char max = int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			shu[i].num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			shu[i].author = tempVar3.charAt(0);
		}
		}
		for (c = 'A',writer[c - 'A'] = 0;c <= 'Z';c++)
		{
			writer[c - 'A'] = 0;
			for (i = 0;i < m;i++)
			{
				for (b = 0;shu[i].author.charAt(b) != '\0';b++)
				{
					if (c == shu[i].author.charAt(b))
					{
		writer[c - 'A']++;
					}
				}
			}
		}
		p = writer;
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
	tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p);
		System.out.printf("%c\n%d\n",max(tempRef_p),writer[max(tempRef_p2) - 'A']);
		p = tempRef_p2.argValue;
		p = tempRef_p.argValue;
			for (i = 0;i < m;i++)
			{
				for (b = 0;shu[i].author.charAt(b) != '\0';b++)
				{
				tangible.RefObject<Integer> tempRef_p3 = new tangible.RefObject<Integer>(p);
					if (max(tempRef_p3) == shu[i].author.charAt(b))
					{
						p = tempRef_p3.argValue;
						System.out.printf("%d\n",shu[i].num);
					}
					else
					{
						p = tempRef_p3.argValue;
					}
				}
			}

	}
		public static char max(tangible.RefObject<Integer> p)
		{
			int i;
			char max;
			for (i = 0,max = 'A';i < 26;i++)
			{
				if (*(p.argValue + i) > *(p.argValue + max - 'A'))
				{
					max = i + 'A';
				}
			}
			return max;
		}

}


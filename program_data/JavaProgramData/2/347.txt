public class author
{
	public int number;
	public String name = new String(new char[26]);
}

public class single
{

	public String letter = new String(new char[1]);
	public int number;

}

package <missing>;

public class GlobalMembers
{
	public static author[] author = tangible.Arrays.initializeWithDefaultauthorInstances(999);
	public static single[] single = tangible.Arrays.initializeWithDefaultsingleInstances(26);



	public static void Main(String[] args)
	{
		int n;
		int i;
		int m;
		int j;
		int p;
		int k;
		int[] book = new int[999];
		for (i = 0;i < 26;i++)
		{
			single[i].letter = tangible.StringFunctions.changeCharacter(single[i].letter, 0, 65 + i);
			single[i].number = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				author[i].number = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				author[i].name = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (single[k].letter.charAt(0) == author[i].name.charAt(j))
					{
						single[k].number++;
					}
				}
			}
		}
		m = 0;
		p = single[0].number;
		for (i = 1;i < 26;i++)
		{
			if (p < single[i].number)
			{
				p = single[i].number;
				m = i;
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (author[i].name.charAt(j) == single[m].letter.charAt(0))
				{
					book[k] = author[i].number;
					k++;
				}
			}
		}
		System.out.printf("%c\n",single[m].letter.charAt(0));
		System.out.printf("%d\n",k);
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",book[i]);
		}
	}

}


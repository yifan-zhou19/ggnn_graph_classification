package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct book
	//{
	//int n;
	//char a[26];
	//};
	book[] book = tangible.Arrays.initializeWithDefaultbookInstances(999);
	int m;
	int[] c = new int[26];
	int k;
	String w = new String(new char[26]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	int i;
	int j;
	int max = 0;
	int t;
	for (i = 0;i < m;i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   book[i].n = tempVar2;
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   book[i].a = tempVar3;
	   }
	}
	for (i = 0;i < 26;i++)
	{
	w = tangible.StringFunctions.changeCharacter(w, i, 'A' + i);
	}
	for (i = 0;i < 26;i++)
	{
		for (j = 0;j < m;j++)
		{
			for (k = 0;k < 26;k++)
			{
				if (book[j].a[k] == w.charAt(i))
				{
					c[i]++;
				}
			}
		}
	}
	for (i = 0;i < 26;i++)
	{
		if (c[i] > max)
		{
		max = c[i];
		}
	}
	for (i = 0;i < 26;i++)
	{
		if (c[i] == max)
		{
			t = i;
		 break;
		}
	}
	System.out.printf("%c\n%d\n",w.charAt(t),c[t]);
	for (j = 0;j < m;j++)
	{
		   for (k = 0;k < 26;k++)
		   {
			  if (book[j].a[k] == w.charAt(t))
			  {
				  System.out.printf("%d\n",book[j].n);
			  break;
			  }
		   }
	}
	}
}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int d;
		int i;
		int j;
		int l;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct a
	//	{
	//		char name[27];
	//		int c;
	//	}
	//	m[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct b
	//	{
	//		int num,book[1000];
	//		char t;
	//	};
		b[] author = tangible.Arrays.initializeWithDefaultbInstances(27);
		for (i = 1;i <= 26;i++)
		{
		  author[i].t = i + 64;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m[i].c = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  m[i].name = tempVar3;
		  }
		}
		for (i = 1;i <= n;i++)
		{
			  l = String.valueOf(m[i].name).length();
			for (j = 0;j <= l - 1;j++)
			{
			   d = m[i].name[j] - 64;
			   author[d].num++;
			   author[d].book[author[d].num] = m[i].c;
			}
		}
		for (i = 1;i <= 25;i++)
		{
		   if (author[i].num > author[i + 1].num)
		   {
			author[i + 1] = author[i];
		   }
		}
		System.out.printf("%c\n",author[26].t);
		System.out.printf("%d\n",author[26].num);
		for (i = 1;i <= author[26].num;i++)
		{
		  System.out.printf("%d\n",author[26].book[i]);
		}
		return 0;
	}

}


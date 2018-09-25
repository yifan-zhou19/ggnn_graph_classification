package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int m;
		int i;
		int max = 0;
		int n;
		int[] count = new int[26];
		char b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int id;
	//		char author[26];
	//	}
	//	book[1024];
			String p = book[0].author[0];
			String q;
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
			   book[i].id = tempVar2;
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   book[i].author = tempVar3;
		   }
	   }
	/*
	   for(i=0;i<m;i++)
	   {   
		   printf("%d %s\n",book[i].id,book[i].author);
	   }
	*/   
	   for (i = 0;i < m;i++)
	   {

		for (p = book[i].author; p != '\0';p++)
		{
			a = p;
			count[a - 65]++;
		}
	   }
		for (i = 0;i < 26;i++)
		{
			if (max < count[i])
			{
				max = count[i];
				b = 'A' + i;
			}
		}
		System.out.printf("%c\n%d\n",b,max);

		for (i = 0;i < m;i++)
		{
			for (q = book[i].author; q != '\0';q++)
			{
				if (q == b)
				{
					System.out.printf("%d\n",book[i].id);
				}
			}
		}
	}
}


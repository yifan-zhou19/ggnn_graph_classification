public class book
{
	   public int id;
	   public String c = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void number_of_books(int n,int * p,struct book book[1000]);
		char max = new char(int n,int * p,struct book book[1000]);
		void name_of_book(int n,int * p,struct book book[1000],int m);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String s = new String(new char[100]);
		char m;
		book[] book = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int)calloc(257,(Integer.SIZE / Byte.SIZE));
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
							book[i].id = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							book[i].c = tempVar3.charAt(0);
						}
		}
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		number_of_books(n, tempRef_p, book);
		p = tempRef_p.argValue;
	tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p);
		m = max(n, tempRef_p2, book);
		p = tempRef_p2.argValue;
		System.out.printf("%c\n%d\n",m,(*(p + m)));
	tangible.RefObject<Integer> tempRef_p3 = new tangible.RefObject<Integer>(p);
		name_of_book(n, tempRef_p3, book, m);
		p = tempRef_p3.argValue;

		return 0;
	}

	public static void number_of_books(int n, tangible.RefObject<Integer> p, book[] book)
	{
		 int i;
		 int j;
		 for (i = 65;i < 91;i++)
		 {
					  (*(p.argValue + i)) = 0;
		 }
		 for (i = 0;i < n;i++)
		 {
						 for (j = 0;book[i].c.charAt(j) != '\0';j++)
						 {
														(*(p.argValue + book[i].c.charAt(j)))++;
						 }
		 }
	}

	public static char max(int n, tangible.RefObject<Integer> p, book[] book)
	{
		 int i;
		 int k = 0;
		 char m;
		 for (i = 65;i < 91;i++)
		 {
						   if ((*(p.argValue + i)) > k)
						   {
										 k = (*(p.argValue + i));
										 m = i;
						   }
		 }
		 return (m);
	}

	public static void name_of_book(int n, tangible.RefObject<Integer> p, book[] book, int m)
	{
		 int i;
		 int j;
		 for (i = 0;i < n;i++)
		 {
						 for (j = 0;book[i].c.charAt(j) != '\0';j++)
						 {
														if ((book[i].c.charAt(j)) == m)
														{
																			 System.out.printf("%d\n",book[i].id);
																			 break;
														}
						 }
		 }
	}
}


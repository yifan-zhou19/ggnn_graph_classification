package <missing>;

public class GlobalMembers
{
	public static int pro(char pr)
	{
		 return Character.toUpperCase(pr) - 'A';
	}

	public static void put_names(int[][] name, int[] books, int booknum)
	{
		 char ch;
		 int ptr;
		 int counter = 0;
		 while (true)
		 {
				 ch = System.in.read();
				 if (ch != ' ')
				 {
					 break;
				 }
		 }





		 while (true)
		 {


				   ptr = pro(ch);
				   books[ptr]++;
				   //printf("|%c, %d|---", ch, books[ptr]);


				   name[ptr][books[ptr]] = booknum;
				   ch = System.in.read();
				   if (ch == '\n')
				   {
					   break;
				   }

		 }
		 //printf("[%d]\n", counter);
	}
	public static int max(int[] books)
	{
		int i;
		int ptr;
		ptr = books[0];
		for (i = 0;i <= 25;i++)
		{
			  if (books[i] > books[ptr])
			  {
				  ptr = i;
			  }
		}
		return ptr;
	}


	public static int Main()
	{
		  int n;
		  int i;
		  int[][] name = new int[26][100];
		  int[] books = new int[26];
		  int max_ptr;
		  int booknum;

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
					booknum = Integer.parseInt(tempVar2);
				}
				put_names(name, books, booknum);

		  }

		  max_ptr = max(books);
		  System.out.printf("%c\n", max_ptr + 'A');
		  System.out.printf("%d\n", books[max_ptr]);

		  for (i = 1;i <= books[max_ptr];i++)
		  {
				System.out.printf("%d\n", name[max_ptr][i]);
		  }
	}


}


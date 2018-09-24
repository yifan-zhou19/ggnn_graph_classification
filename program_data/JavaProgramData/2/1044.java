public class book
{
	   public String number = new String(new char[20]);
	   public String name = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] books = tangible.Arrays.initializeWithDefaultbookInstances(1000);

	public static int Main()
	{
		   int n;
		   int i;
		   int j;
		   int[] count = new int[26];
		   int temp;
		   int base;
		   int k = 0;
		   char author;
		   int pd = 0;
		   int N = 0;
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
							   books[i].number = tempVar2.charAt(0);
						   }
						   String tempVar3 = ConsoleInput.scanfRead(" ");
						   if (tempVar3 != null)
						   {
							   books[i].name = tempVar3.charAt(0);
						   }
		   }
		   for (i = 0;i < n;i++)
		   {
						   for (j = 0;books[i].name.charAt(j) >= 'A' && books[i].name.charAt(j) <= 'Z';j++)
						   {
									 temp = books[i].name.charAt(j) - 'A';
									 count[temp]++;
						   }
		   }
		   base = count[0];
		   for (i = 0;i < 26;i++)
		   {
							if (count[i] > base)
							{
								base = count[i];
								k = i;
							}
		   }
		   author = 'A' + k;
		   System.out.printf("%c\n",author);
			for (i = 0;i < n;i++)
			{
			   pd = 0;
						   for (j = 0;books[i].name.charAt(j) >= 'A' && books[i].name.charAt(j) <= 'Z';j++)
						   {

								  if (books[i].name.charAt(j) == author)
								  {
								  pd = 1;
								  }
						   }
						   if (pd == 1)
						   {
						   N++;
						   }
			}
		   System.out.printf("%d\n",N);
		   for (i = 0;i < n;i++)
		   {
			   pd = 0;
						   for (j = 0;books[i].name.charAt(j) >= 'A' && books[i].name.charAt(j) <= 'Z';j++)
						   {

								  if (books[i].name.charAt(j) == author)
								  {
								  pd = 1;
								  }
						   }
						   if (pd == 1)
						   {
						   System.out.printf("%s\n",books[i].number);
						   }
		   }


	}


}


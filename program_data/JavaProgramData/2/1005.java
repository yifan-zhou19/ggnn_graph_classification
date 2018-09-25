public class book
{
	public int num;
	public String author = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int m;
	 int i;
	 int j;
	 int[] author_num = new int[26];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 book[] shu = tangible.Arrays.initializeWithDefaultbookInstances(999);
	 for (i = 0;i < n;i++)
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
	 for (i = 0;i < n;i++)
	 {
		 for (j = 0;j < 26;j++)
		 {
			 m = shu[i].author.charAt(j) - 'A';
			 author_num[m]++;
		 }
	 }
	 int max = author_num[0];
	 int author = 'A';
	 for (i = 1;i < 26;i++)
	 {
		 if (author_num[i] > max)
		 {
			 max = author_num[i];
			 author = i + 'A';
		 }
	 }
	System.out.printf("%c\n%d\n",author,max);
	for (i = 0;i < n;i++)
	{
		 for (j = 0;j < 26;j++)
		 {
			 if (shu[i].author.charAt(j) == author)
			 {
				 System.out.printf("%d\n",shu[i].num);
			 }
		 }
	}
	return 0;
	}


}


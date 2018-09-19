public class book
{
	public String a = new String(new char[1000]);
	public String b = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	public static int Main()
	{
	 int m;
	 int i;
	 int j;
	 int s;
	 int k;
	 int p;
	 int l;
	 int[] t = new int[26];
	 char x;
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
		 book[i].a = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 book[i].b = tempVar3.charAt(0);
	 }
	 }
	 for (i = 0;i < m;i++)
	 {
		 s = String.valueOf(book[i].b).length();
		 for (j = 0;j < s;j++)
		 {
			 x = book[i].b.charAt(j);
			 k = x;
			 t[k - 65] = t[k - 65] + 1;
		 }
	 }
	 p = t[0];
	 l = 0;
	 for (i = 1;i < 26;i++)
	 {
		 if (t[i] > p)
		 {
			 p = t[i];
			 l = i;
		 }
	 }
	 x = l + 65;
	 System.out.printf("%c\n",x);
	 System.out.printf("%d\n",p);
	for (i = 0;i < m;i++)
	{
		 s = String.valueOf(book[i].b).length();
		 for (j = 0;j < s;j++)
		 {
			 if (book[i].b.charAt(j) == x)
			 {
				 System.out.printf("%s\n",book[i].a);
			 }
		 }
	}
	return 0;
	}

}


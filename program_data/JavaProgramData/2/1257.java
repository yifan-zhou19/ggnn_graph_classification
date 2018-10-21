public class data
{
public int code;
public String author = new String(new char[20]);
}
public class letter
{
public char let;
public int count;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int t;
	int max;
	data[] a = tangible.Arrays.initializeWithDefaultdataInstances(100);
	letter[] l = tangible.Arrays.initializeWithDefaultletterInstances(26);

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
		a[i].code = Integer.parseInt(tempVar2);
	}
	a[i].author = new Scanner(System.in).nextLine();
	}
	for (i = 0;i < 26;i++)
	{
	l[i].let = i + 65;
	l[i].count = 0;
	}

	for (i = 0;i < n;i++)
	{
	for (j = 0;a[i].author.charAt(j) != '\0';j++)
	{
	for (k = 0;k < 26;k++)
	{
	if (a[i].author.charAt(j) == l[k].let)
	{
	l[k].count++;
	}
	}
	}
	}
	   max = 0;
	   for (k = 0;k < 26;k++)
	   {
	   if (l[k].count > max)
	   {
		   max = l[k].count;
	   t = k;
	   }
	   }

	   System.out.printf("%c\n",l[t].let);
	   System.out.printf("%d\n",l[t].count);
	   for (i = 0;i <= n - 1;i++)
	   {
	   for (j = 0;a[i].author.charAt(j) != '\0';j++)
	   {
	if (a[i].author.charAt(j) == l[t].let)
	{
	System.out.printf("%d\n",a[i].code);
	}
	   }
	   }

	return 0;
	}

}


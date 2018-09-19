package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int i;
	int j;
	int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct
	//{
	//	int n;
	// char s[26];
	//}
	//book[999];
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
		  book[i].n = tempVar2;
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  book[i].s = tempVar3;
	  }
	}
	int[] a = new int[26];
	for (i = 0;i < m;i++)
	{
	 for (j = 0;book[i].s[j] != '\0';j++)
	 {
		 a[(int)(book[i].s[j] - 'A')]++;
	 }
	}
	for (i = 1;i < 26;i++)
	{
	 if (a[k] < a[i])
	 {
	 k = i;
	 }
	}
	System.out.printf("%c\n%d\n",k + 'A',a[k]);
	for (i = 0;i < m;i++)
	{
	 for (j = 0;book[i].s[j] != '\0';j++)
	 {
		 if (book[i].s[j] == k + 'A')
		 {
			 System.out.printf("%d\n",book[i].n);
		 break;
		 }
	 }
	}
	}
}


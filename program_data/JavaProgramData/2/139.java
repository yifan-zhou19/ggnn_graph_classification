package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct b
	//  {
	//	  int n;
	//  char a[26];
	//  };
	  b[] b = tangible.Arrays.initializeWithDefaultbInstances(999);
	  int m;
	  int k;
	  int i;
	  int j;
	  int[] c = new int[26];
	  int p = 0;
	  int q = 0;
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
		  b[i].n = tempVar2;
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[i].a = tempVar3;
	  }
	  }
	for (i = 0;i < m;i++)
	{
	for (j = 0;(x = b[i].a[j]) != '\0' && j < 26;j++)
	{
	c[x - 65]++;
	}
	}
	k = c[0];
	for (i = 0;i < 26;i++)
	{
	if (c[i] > k)
	{
		k = c[i];
		p = i;
	}
	}
	System.out.printf("%c\n",p + 65);
	System.out.printf("%d\n",c[p]);
	for (i = 0;i < m;i++)
	{
		q = 0;
	for (j = 0;(x = b[i].a[j]) != '\0' && j < 26;j++)
	{
	if (x == p + 65)
	{
		q = 1;
	}
	}
	if (q == 1)
	{
		System.out.printf("%d\n",b[i].n);
	}
	}

	}

}


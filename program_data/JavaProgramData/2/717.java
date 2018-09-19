package <missing>;

public class GlobalMembers
{
	public static int[] c = new int[255];

	public static int Main()
	{
	int i;
	int j;
	int n;
	char m = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct
	//{
	//  int id;
	//  char s[255];
	//}
	//a[1000];

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
		  a[i].id = tempVar2;
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[i].s = tempVar3;
	  }
	  for (j = 0; a[i].s[j]; j++)
	  {
		if (++c[a[i].s[j]] > c[m])
		{
			m = a[i].s[j];
		}
	  }
	}
	System.out.printf("%c\n%d\n", m, c[m]);
	for (i = 0;i < n;i++)
	{
	  if (tangible.StringFunctions.strChr(a[i].s, m))
	  {
		System.out.printf("%d\n", a[i].id);
	  }
	}
	return 0;
	}

}


package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct book
	//  {
	//	int num;
	//	char name[26];
	//  }
	//  b[1000];

	  int m;
	  int i;
	  int j;
	  int[] n = new int[26];
	  int max = 0;
	  int t;
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
			  b[i].num = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i].name = tempVar3;
		  }
	  }
	  for (i = 0;i < m;i++)
	  {
		 for (j = 0;j < String.valueOf(b[i].name).length();j++)
		 {
			 ++n[b[i].name[j] - 65];
		 }
	  }
	  for (i = 0;i < 26;i++)
	  {
		if (n[i] > max)
		{
			max = n[i];
		  t = i + 65;
		}
	  }
	  System.out.printf("%c\n",t);
	  System.out.printf("%d\n",max);
	  for (i = 0;i < m;i++)
	  {
		for (j = 0;j < String.valueOf(b[i].name).length();j++)
		{
			if (b[i].name[j] == t)
			{
		   System.out.printf("%d\n",b[i].num);
			}
		}
	  }
	}

}


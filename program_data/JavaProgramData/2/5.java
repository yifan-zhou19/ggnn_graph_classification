package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int i;
	  int j;
	  int k;
	  int q = 0;
	  int t = 0;
	  int u;
	  int max;
	  int[] b = new int[26];
	  final String c = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct as
	//  {
	//	int sh;
	//	char a[26];
	//  }
	//  cla[1000];
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
		   cla[i].sh = tempVar2;
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   cla[i].a = tempVar3;
	   }
	   t = (int)String.valueOf(cla[i].a).length();
	   for (k = 0;k < t;k++)
	   {
		u = cla[i].a[k] - 'A';
		b[u]++;
	   }
	  }
	  max = 0;
	  for (j = 0;j < 25;j++)
	  {
		if (max < b[j])
		{
		  max = b[j];
		  q = j;
		}
	  }
	  System.out.printf("%c\n",c.charAt(q));
	  System.out.printf("%d\n",max);
	  for (i = 0;i < m;i++)
	  {
	   t = (int)String.valueOf(cla[i].a).length();
		 for (k = 0;k < t;k++)
		 {
		  if (cla[i].a[k] == c.charAt(q))
		  {
		   System.out.printf("%d\n",cla[i].sh);
		  }
		 }
	  }
	  return 0;
	}


}


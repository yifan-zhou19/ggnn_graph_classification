package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  String s = new String(new char[10]);
		  float k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct
	//	  {
	//	  char sex[10];
	//	  float hei;
	//	  }
	//	  peo[n];
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  peo[i].sex = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  peo[i].hei = tempVar3;
		  }
		  }
		  for (i = 1;i <= n;i++)
		  {
		  for (j = n - 1;j >= i;j--)
		  {
		  if (peo[j].hei < peo[j - 1].hei)
		  {
			  k = peo[j].hei;
			  peo[j].hei = peo[j - 1].hei;
			  peo[j - 1].hei = k;
			  s = peo[j].sex;
			  peo[j].sex = peo[j - 1].sex;
			  peo[j - 1].sex = s;
		  }
		  }
		  }
		  for (i = 0;i < n;i++)
		  {
		  if (strcmp(peo[i].sex,"male") == 0)
		  {
			  System.out.printf("%.2f",peo[i].hei);
			  break;
		  }
		  }
		  for (i = i + 1;i < n;i++)
		  {
		  if (strcmp(peo[i].sex,"male") == 0)
		  {
		  System.out.printf(" %.2f",peo[i].hei);
		  }
		  }

		  for (i = n - 1;i >= 0;i--)
		  {
		  if (strcmp(peo[i].sex,"female") == 0)
		  {
		  System.out.printf(" %.2f",peo[i].hei);
		  }
		  }
	}
}


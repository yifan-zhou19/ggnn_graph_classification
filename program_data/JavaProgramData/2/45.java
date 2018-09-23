package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct h
	//   {
	//	  char name[27];
	//	  int mun;
	//	  struct h *next;
	//   }
	//   *p,*q,*head;
	int k;
	int j;
	int i;
	int l;
	int n;
	int[][] a = new int[26][1001];
	int b;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

	  p = len;
	  q = head = p;
	  for (i = 0;i < 26;i++)
	  {
			for (j = 0;j < 1000;j++)
			{
			  a[i][j] = 0;
			}
	  }
	  for (i = 0;i < n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p.mun = tempVar2;
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  p.name = tempVar3;
	  }

	  l = p.name.length();
	  for (j = 0;j < l;j++)
	  {
		 b = (p.name)[j] - 65; //????????
		 k = a[b][0] += 1; //????????????
		 a[b][k] = p.mun; //???p->mun????????
	  }
	  q = len;
	  p.next = q;
	  p = q;
	  }
	  p = head;
	  int max = a[0][0];
	  j = 0;
	  for (i = 0;i < 26;i++)
	  {
		  if (max < a[i][0])
		  {
			  max = a[i][0];
			  j = i;
		  }

	  }
	  System.out.printf("%c\n%d\n",j + 65,max);
	  i = 1;
	  while (a[j][i] != 0)
	  {
		System.out.printf("%d\n",a[j][i]);
		i++;
	  }



	}

}


int max = new int(int,int,int,int,int);
int min = new int(int,int,int,int,int);
int main()
{
	int[][] a = new int[5][5];
	int i;
	int j;
	int k = 0;

 for (i = 0;i <= 4;i++)
 {
  for (j = 0;j <= 4;j++)
  {
	   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
  }
 }
 for (i = 0;i <= 4;i++)
 {
  for (j = 0;j <= 4;j++)
  {
	   if (a[i][j] == max(a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]) && a[i][j] == min(a[0][j],a[1][j],a[2][j],a[3][j],a[4][j]))
	   {
		 System.out.print(i + 1);
		 System.out.print(" ");
		 System.out.print(j + 1);
		 System.out.print(" ");
		 System.out.print(a[i][j]);
								k = k + 1;
	   }
  }
 }
  if (k == 0)
  {
	  System.out.print("not found");
  }
  return 0;
}


 int max(int g,int f,int c,int d,int e)
 {
	int sum = 0;
	int i;
	int j;
  int[] b = new int[5];
  b[0] = g;
  b[1] = f;
  b[2] = c;
  b[3] = d;
  b[4] = e;
  for (i = 0;i <= 4;i++)
  {
	  sum = 0;
  for (j = 0;j <= 4;j++)
  {
	  if (b[j] > b[i])
	  {
		  break;
	  }
  if (b[j] <= b[i])
  {
	  sum++;
  }
  if (sum == 5)
  {
	  return b[i];
  }
  }
  }
 }

 int min(int g,int f,int c,int d,int e)
 {
	int sum = 0;
	int i;
	int j;
  int[] b = new int[5];
  b[0] = g;
  b[1] = f;
  b[2] = c;
  b[3] = d;
  b[4] = e;
  for (i = 0;i <= 4;i++)
  {
	  sum = 0;
  for (j = 0;j <= 4;j++)
  {
	  if (b[j] < b[i])
	  {
		  break;
	  }
  if (b[j] >= b[i])
  {
	  sum++;
  }
  if (sum == 5)
  {
	  return b[i];
  }
  }
  }
 }




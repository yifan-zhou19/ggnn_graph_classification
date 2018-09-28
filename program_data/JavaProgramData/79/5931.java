int john = new int(int,int);
int main()
{
	int j;
	int m;
	int n;
	int i = 0;
	int[] a = new int[10];
	//printf("enter n & m :\n");

	while (true)
	{
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }

	  if (m == 0 && n == 0)
	  {
		  break;
	  }
	  else
	  {
		  a[i] = john(n,m);
	  i++;
	  }

	}
 for (j = 0;j < i;j++)
 {
	 System.out.printf("%d\n",a[j]);
 }

}






int john(int n,int m)
{
	int i;
	int j;
	int t;
	int[] a = new int[301];



 for (i = 1;i <= n;i++)
 {
	 a[i] = 1;
 }
 j = n;
 for (i = 1,t = 0;j > 1;i = i + 1)
 {
	 if (i > n)
	 {
	 i = i - n;
	 }
	if (a[i] != 0)
	{
		  t++;
		if (t == m)
		{
			t = 0;
		 a[i] = 0;
		 j--;
		}
	}
	else
	{
		continue;
	}
 }
for (i = 1;i <= n;i++)
{
  if (a[i] == 1)
  {
	  break;
  }
}
	 return (i);
}


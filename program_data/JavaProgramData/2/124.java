void function(int,int);

int main()
{
   char[][] s = new char[200][100];
   int[] n = new int[100];
   int[] h = new int[100];
   int[] maxh = new int[100];
   int a;
   int i;
   int j;
   int k;
   int p;
   int num;
   int maxnum = 0;
   char c;

   String tempVar = ConsoleInput.scanfRead();
   if (tempVar != null)
   {
	   a = Integer.parseInt(tempVar);
   }
   for (i = 0;i < a;i++)
   {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  s[i] = tempVar3.charAt(0);
	  }
   }

   for (j = 'A';j <= 'Z';j++)
   {
	   num = 0;
	   for (i = 0;i < a;i++)
	   {
		  for (k = 0;k < String.valueOf(s[i]).length();k++)
		  {
			 if (s[i][k] == j)
			 {
				 num++;
				 h[num] = n[i];
			 }
		  }
	   }
	   if (num > maxnum)
	   {
		  c = j;
		  maxnum = num;
		  for (p = 1;p <= maxnum;p++)
		  {
			 maxh[p] = h[p];
		  }
	   }
   }

   System.out.printf("%c\n%d\n",c,maxnum);
   for (p = 1;p <= maxnum;p++)
   {
	   System.out.printf("%d\n",maxh[p]);
   }
   return 0;

}


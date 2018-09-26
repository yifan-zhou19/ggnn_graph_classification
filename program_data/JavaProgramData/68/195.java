int pd = int;
int main()
{
   int m;
   int count;
   int i;
   String tempVar = ConsoleInput.scanfRead();
   if (tempVar != null)
   {
	   m = Integer.parseInt(tempVar);
   }
   for (count = 6;count <= m;count = count + 2)
   {
	  i = 2;
	  if (i == 2 && pd(count - 2))
	  {
		  System.out.printf("%d=2+%d\n",count,count - 2);
		  break;
	  }
	  else
	  {
		 for (i = 3;i <= count / 2 + 1;i = i + 2)
		 {
			if (pd(i) && pd(count - i))
			{
			   System.out.printf("%d=%d+%d\n",count,i,count - i);
			   break;
			}
		 }
	  }
   }
   return 0;
}

int pd(int x)
{
   int i;
   for (i = 2;i <= Math.sqrt(x) + 1;i++)
   {
	  if (x % i == 0)
	  {
		 return 0;
	  }
   }
   return 1;
}


void function(int,int);

int main()
{
   int n;
   int i;
   int k = 0;

   String tempVar = ConsoleInput.scanfRead();
   if (tempVar != null)
   {
	   n = Integer.parseInt(tempVar);
   }
   for (i = 0;i < 3;i++)
   {
	  if (n % (2 * i + 3) == 0)
	  {
		 k++;
	  }
   }
   for (i = 0;i < 3;i++)
   {
	  if (n % (2 * i + 3) == 0)
	  {
		 System.out.printf("%d",(2 * i + 3));
		 if (k > 1)
		 {
			System.out.print(" ");
			k--;
		 }
	  }

   }
   if (k == 0)
   {
	  System.out.print("n");
   }
   return 0;

}


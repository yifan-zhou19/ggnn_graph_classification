int yu7WuGuan = int;

	int main()
	{
		 int num;
		 int i;
		 int result = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 num = Integer.parseInt(tempVar);
		 }
		 for (i = 1; i <= num; i++)
		 {
			   if (yu7WuGuan(i))
			   {
			   result += i * i;
			   }
		 }
			   System.out.printf("%d", result);
			   return 0;
	}
		 int yu7WuGuan(int number)
		 {
		 int num;
		 if (number % 7 == 0)
		 {
					 return 0;
		 }
		 for (num = number; num > 0; num /= 10)
		 {
		 if (num % 10 == 7)
		 {
					 return 0;
		 }
		 }
		 return 1;
		 }


//****************
//*1000010538    *
//*??          *
//****************
int reverse = int;
int main()
{
   int i; //????????????
   int[] a = new int[6];
   for (i = 0;i < 6;i++)
   {
	a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   a[i] = reverse(a[i]);
	System.out.print(a[i]);
	System.out.print("\n");
   }
   return 0;
}
 int reverse(int num)
 {
   char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
   int len = 0;
   int i;
   if (num != 0) //?????
   {
	  for (i = 0;num != 0;i++)
	  {
		   str[i] = num % 10 + '0'; //???????????????
				 num = num / 10;
	  }
	  len = str.length();
	  for (i = 0;i < len;i++)
	  {
	  num = num + (str[i] - '0') * Math.pow(10.0,len - 1 - i); //????????????????
	  }
	  return (num);
   }
	 if (num == 0) //????0
	 {
	 return 0; //????0
	 }

 }






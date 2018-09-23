void count(int,int);
int flag;
int main()
{
	int m;
	int n;
	int temp;
  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
  if (m > n)
  {
	  temp = n;
	  n = m;
	  m = temp;
  }
  flag = 0;
  for (int i = m;i >= 1 && flag == 0;i = i / 2)
  {
	count(n,i);
  }
  return 0;
}
 void count(int n,int i)
 {
	 if (n < 1 || n < i)
	 {
		 return;
	 }
	 else
	 {
		 if (i == n)
		 {
			System.out.print(i);
			System.out.print("\n");
			flag = 1;
			return;
		 }
		 else
		 {
			count(n / 2,i);
		 }
	 }
	 return;
 }


